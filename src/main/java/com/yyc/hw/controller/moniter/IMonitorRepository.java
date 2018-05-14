package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMonitorRepository extends JpaRepository<MonitorCenter, Integer> {
}
