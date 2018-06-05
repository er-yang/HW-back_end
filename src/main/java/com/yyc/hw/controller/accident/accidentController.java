package com.yyc.hw.controller.accident;

import com.yyc.hw.entity.Accident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class accidentController {
    @Autowired
    private IAccidentRepository accidentRepository;

    @GetMapping(value = "/accident")
    public Map findallByAccident() {
        long total = accidentRepository.count();
        List<Map> res = accidentRepository.findAllAccident();
        Map temp = new HashMap();
        temp.put("total", total);
        temp.put("data", res);
        return temp;
    }

    @GetMapping(value = "/accident/{id}")
    public List<Accident> findAccidentByMonitor (@PathVariable("id") String id) {
        return accidentRepository.findAccidentsByMonitorNodeIDEquals(id);
    }
    @GetMapping(value = "/accident/count/{id}")
    public List<Map> CountAccidentByTime (@PathVariable("id") String id) {
        return accidentRepository.CountAccidentByTime(id);
    }

    @GetMapping(value = "/accident/count")
    public Map countAccidentByMonitorNode(){
        List<Map> accident = accidentRepository.CountAccidentByMonitor();
        List<Map> typedata = accidentRepository.CountAccidentByType();
        Map temp = new HashMap();
        temp.put("accident", accident);
        temp.put("typedata", typedata);
        return temp;
    }

    @GetMapping(value = "accident/count/type")
    public List<Map> countAccidentByType() {
        return accidentRepository.CountAccidentByType();
    }
    @GetMapping(value = "accident/deal")
    public List<Map> getAccidentDeal() {
        return accidentRepository.getAccidentsByState();
    }
}
