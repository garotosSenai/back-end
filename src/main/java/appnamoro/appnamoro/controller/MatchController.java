package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Match;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/match")
public class MatchController {

    private List <Match> listaMatch = new ArrayList<>();

    private Long proximoId = 1L;

@PostMapping
    public Match salvarMatch (@RequestBody Match novoMatch){
        novoMatch.setIdUsuario(proximoId++);
        listaMatch.add(novoMatch);
        return novoMatch;
    }
}
