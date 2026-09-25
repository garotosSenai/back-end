package com.appnamoro.appnamoro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/denuncias")
public class DenunciaController {

    private final List<Denuncia> denuncias = new ArrayList<>();
    private Long idSequence = 1L;

    @PostMapping
    public ResponseEntity<Denuncia> criar(@RequestBody Denuncia denuncia) {
        denuncia.setIdDenuncia(idSequence++);

        denuncias.add(denuncia);
        return ResponseEntity.status(HttpStatus.CREATED).body(denuncia);
    }
}