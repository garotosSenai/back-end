package com.appnamoro.appnamoro.controller;


import com.appnamoro.appnamoro.Curtida;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curtidas")
public class CurtidaController {

    private final List<Curtida> curtidas = new ArrayList<>();
    private Long idSequence = 1L;

    @PostMapping
    public ResponseEntity<Curtida> criar(@RequestBody Curtida curtida) {
        curtida.setId_Curtida(idSequence++);

        if (curtida.getDtCurtida() == null) {
            curtida.setDtCurtida(LocalDate.now());
        }

        curtidas.add(curtida);
        return ResponseEntity.status(HttpStatus.CREATED).body(curtida);
    }
}