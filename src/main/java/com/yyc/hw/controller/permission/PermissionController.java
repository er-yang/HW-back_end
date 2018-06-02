package com.yyc.hw.controller.permission;

import com.yyc.hw.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PermissionController {

    @Autowired
    private IPermissionRepository iPermissionRepository;

    @GetMapping(value = "/permission")
    public Map getPermission() {
        long total = iPermissionRepository.count();
        Map map = new HashMap<String,Object>();
        List<Permission> res = iPermissionRepository.findAll();
        map.put("total", total);
        map.put("data", res);
        return map;
    }

    @PostMapping(value = "permission/save")
    public Permission save(@RequestBody Permission permission) {
        return iPermissionRepository.save(permission);
    }
}
