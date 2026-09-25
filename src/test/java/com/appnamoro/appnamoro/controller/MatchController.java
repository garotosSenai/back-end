
package com.appnamoro.appnamoro.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private Long idSequence = 1L;

    @PostMapping
    public <Match> ResponseEntity<Match> criar(@RequestBody Match match) {
        match.getClass();

        if (match.getDataMatch() == null) {
            match.setDataMatch(LocalDateTime.now());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(match);
    }
}