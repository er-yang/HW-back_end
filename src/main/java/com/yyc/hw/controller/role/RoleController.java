package com.yyc.hw.controller.role;

import com.yyc.hw.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoleController {
    @Autowired
    private IRoleRepository iRoleRepository;

    @GetMapping(value = "/role")
    public Map getPermission() {
        long total = iRoleRepository.count();
        Map map = new HashMap<String,Object>();
        List<Role> res = iRoleRepository.findAll();
        map.put("total", total);
        map.put("data", res);
        return map;
     }
}
