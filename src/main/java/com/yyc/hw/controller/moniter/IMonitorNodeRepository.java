package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface IMonitorNodeRepository extends JpaRepository<MonitorNode, Integer>{
    @Query(value = "select a.*, b.centerName, c.typeName from monitornode a left join monitorcenter b on a.monitorCenterID = b.centerID LEFT JOIN monitortype c  on a.typeID = c.typeID ", nativeQuery = true)
    public List<Map> getNodeList();
}
