package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMonitorType extends JpaRepository<MonitorType, Integer>{
}
