package com.yyc.hw.controller.role;

import com.yyc.hw.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Integer>{
}
