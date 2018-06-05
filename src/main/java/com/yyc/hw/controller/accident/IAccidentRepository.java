package com.yyc.hw.controller.accident;

import com.yyc.hw.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IAccidentRepository  extends JpaRepository<Accident, Integer> {
    @Query(value = "select a.*, latitude, longitude, nodeName from accident a LEFT JOIN monitornode m on a.monitornodeID = m.nodeID",nativeQuery = true)
    public List<Map> findAllAccident();

    public List<Accident> findAccidentsByMonitorNodeIDEquals(String monitorNodeID);

    @Query( value = "SELECT COUNT(accidentID ) as times,HOUR(occurTime) as name from accident WHERE monitorNodeID=:id GROUP BY HOUR(occurTime)", nativeQuery = true)
    public List<Map> CountAccidentByTime(@Param("id")String id);

    @Query( value = "SELECT m.nodeName,COUNT(monitorNodeID) as times FROM accident a LEFT JOIN monitornode m on a.monitorNodeID =m.nodeID GROUP BY monitorNodeID", nativeQuery = true)
    public List<Map> CountAccidentByMonitor();
    @Query(value = "SELECT accidentType as name ,COUNT(accidentID ) as times from accident a GROUP BY accidentType",nativeQuery = true)
    public List<Map> CountAccidentByType();

    @Query( value = "SELECT m.nodeName,a.*  FROM accident a LEFT JOIN monitornode m on a.monitorNodeID =m.nodeID WHERE a.state=0", nativeQuery = true)
    public  List<Map> getAccidentsByState();
}
