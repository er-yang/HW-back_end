package com.yyc.hw.controller.permission;

import com.yyc.hw.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPermissionRepository extends JpaRepository<Permission,Integer> {
}
