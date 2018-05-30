package com.yyc.hw.controller.accident;

import com.yyc.hw.entity.Accident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}
