package com.appnamoro.appnamoro.controller;


import com.appnamoro.appnamoro.model.Preferencia;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preferencias")
public class PreferenciaController {

    private final List<Preferencia> preferencias = new ArrayList<>();
    private Long idSequence = 1L;

    @PostMapping
    public ResponseEntity<Preferencia> criar(@RequestBody Preferencia preferencia) {
        preferencia.setId_usuario(idSequence++);
        preferencias.add(preferencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(preferencia);
    }

}