package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IMonitorNodeRepository extends JpaRepository<MonitorNode, Integer>{
    @Query(value = "select a.*, b.centerName, c.typeName from monitornode a left join monitorcenter b on a.monitorCenterID = b.centerID LEFT JOIN monitortype c  on a.typeID = c.typeID ", nativeQuery = true)
    public List<Map> getNodeList();

    public MonitorNode findMonitorNodeByNodeID(Integer id);

    public List<MonitorNode> findMonitorNodesByMonitorCenterIDEquals(String Id);

    @Query(value = "SELECT nodeID, nodeName from monitornode n LEFT JOIN monitorcenter  m on m.centerID=n.monitorCenterID WHERE m.manager=:id", nativeQuery = true)
    public List<Map> getNodeLByUser(@Param("id")String id);
}
