package com.yyc.hw.controller.carmera;

import com.yyc.hw.entity.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class CameraController {
    @Autowired
    private ICameraRepository carmeraRepository;
    @GetMapping(value = "/camera")
    public Map getCameraList () {
        long total = carmeraRepository.count();
        Map map = new HashMap<String,Object>();
        List<Camera> res = carmeraRepository.findAll();
        map.put("total", total);
        map.put("data", res);
        return map;
    }
    @PostMapping(value = "/camera/save")
    public Camera saveCamera (@RequestBody Camera camera) {
        return carmeraRepository.save(camera);
    }
    @GetMapping(value = "/camera/delete/{id}")
    public boolean  deleteCamera(@PathVariable("id") Integer id){
        try {
            carmeraRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
