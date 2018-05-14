package com.yyc.hw.controller.carmera;

import com.yyc.hw.entity.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CameraController {
    @Autowired
    private ICameraRepository carmeraRepository;
    @GetMapping(value = "/camera")
    public List<Camera> getCameraList () {
        return carmeraRepository.findAll();
    }
    @PostMapping(value = "/camera/save")
    public Camera saveCamera (@RequestBody Camera camera) {
        return carmeraRepository.save(camera);
    }
    @GetMapping(value = "/camera/delete/id")
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
