package com.appnamoro.appnamoro.controller;

import com.appnamoro.appnamoro.model.Interesse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/interesses")
public class InteresseController {

    private final List<Interesse> interesses = new ArrayList<>();
    private Long idSequence = 1L;

    @PostMapping
    public ResponseEntity<Interesse> criar(@RequestBody Interesse interesse) {
        if (interesse.getIdUsuario() == null) {
            interesse.setIdUsuario(idSequence++);
        }

        interesses.add(interesse);
        return ResponseEntity.status(HttpStatus.CREATED).body(interesse);
    }
}