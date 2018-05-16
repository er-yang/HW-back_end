package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface IMonitorRepository extends JpaRepository<MonitorCenter, Integer> {
    @Query(value = "SELECT m.*, a.accountName from monitorcenter m LEFT JOIN account a on m.manager = a.accountID",nativeQuery = true)
    public List<Map> getCenterList();
}
