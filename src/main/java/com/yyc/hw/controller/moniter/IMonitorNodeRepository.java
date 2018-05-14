package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface IMonitorNodeRepository extends JpaRepository<MonitorNode, Integer>{
    @Query(value = "select a.*, b.center_name from monitor_node a left join monitor_center b on a.monitor_centerid = b.centerid", nativeQuery = true)
    public List<Map> getNodeList();
}
