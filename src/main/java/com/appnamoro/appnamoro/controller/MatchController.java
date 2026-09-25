package com.appnamoro.appnamoro.controller;

import com.appnamoro.appnamoro.model.Match;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private Long idSequence = 1L;
    private final List<Match> matches = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Match> criar(@RequestBody Match match) {
        match.setIdMatch(idSequence++);

        if (match.getDataMatch() == null) {
            match.setDataMatch(LocalDateTime.now());
        }


        matches.add(match);
        return ResponseEntity.status(HttpStatus.CREATED).body(match);
    }

    @GetMapping
    public ResponseEntity<List<Match>> listarTodos() {
        return ResponseEntity.ok(matches);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Match> buscarPorId(@PathVariable Long id) {
        for (Match m : matches) {
            if (m.getIdMatch().equals(id)) {
                return ResponseEntity.ok(m);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Match> atualizar(@PathVariable Long id, @RequestBody Match dadosAtualizados) {
        for (Match m : matches) {
            if (m.getIdMatch().equals(id)) {
                if (dadosAtualizados.getIdUsuario1() != null) {
                    m.setIdUsuario1(dadosAtualizados.getIdUsuario1());
                }
                if (dadosAtualizados.getIdUsuario2() != null) {
                    m.setIdUsuario2(dadosAtualizados.getIdUsuario2());
                }
                if (dadosAtualizados.getDataMatch() != null) {
                    m.setDataMatch(dadosAtualizados.getDataMatch());
                }
                return ResponseEntity.ok(m);
            }
        }
        return ResponseEntity.notFound().build();
    }

}