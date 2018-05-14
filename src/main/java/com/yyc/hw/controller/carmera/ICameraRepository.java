package com.yyc.hw.controller.carmera;

import com.yyc.hw.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICameraRepository extends JpaRepository<Camera, Integer> {
}
