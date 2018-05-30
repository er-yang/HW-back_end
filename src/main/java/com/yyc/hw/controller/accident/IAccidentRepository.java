package com.yyc.hw.controller.accident;

import com.yyc.hw.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface IAccidentRepository  extends JpaRepository<Accident, Integer> {
    @Query(value = "select a.*, latitude, longitude, nodeName from accident a LEFT JOIN monitornode m on a.monitornodeID = m.nodeID",nativeQuery = true)
    public List<Map> findAllAccident();
}
