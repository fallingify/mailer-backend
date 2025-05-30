package com.g25.mailer.template.controller;

import com.g25.mailer.template.entity.Target;
import com.g25.mailer.template.service.TargetService;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Hidden
@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/targets")
@RequiredArgsConstructor
public class TargetController {
    private final TargetService targetservice;

    @GetMapping("/{name}")
    public ResponseEntity<Target> getTarget(@PathVariable String name) {
        return targetservice.getTargetByName(name)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}


