package com.chevy.recetas.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/receta")
public class RecetaController {

    @GetMapping()
    public ResponseEntity<String> getRecetas() {
        return ResponseEntity.ok("Hola k ase");
    }
}