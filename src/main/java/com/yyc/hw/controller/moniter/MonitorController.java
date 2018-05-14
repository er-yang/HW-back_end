package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MonitorController {
    @Autowired
    private IMonitorRepository moniterRepository;
    @Autowired
    private  IMonitorNodeRepository monitorNodeRepository;

    @GetMapping(value = "/monitorCenter")
    public List<MonitorCenter> getMonitorCenterList() {
        return moniterRepository.findAll();
    }
    @GetMapping(value = "/monitorNode")
    public List<Map> getListNode() {
        return monitorNodeRepository.getNodeList();
    }
}
