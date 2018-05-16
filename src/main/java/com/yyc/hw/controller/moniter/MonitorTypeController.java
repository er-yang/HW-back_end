package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonitorTypeController {
    @Autowired
    private IMonitorType monitorTypeRepository;

    @GetMapping(value = "/monitorType")
    public List<MonitorType> getType() {
        return monitorTypeRepository.findAll();
    }
    @PostMapping(value = "/monitorType/save")
    public MonitorType saveMonitorType(@RequestBody MonitorType monitorCenter) {
        return monitorTypeRepository.save(monitorCenter);
    }
    @GetMapping(value = "/monitorType/delete/{id}")
    public boolean  deleteMonitorType(@PathVariable("id") Integer id){
        try {
            monitorTypeRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
