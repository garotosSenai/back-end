package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Curtida;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/curtida")
public class CurtidaController {

    private List <Curtida> listaCurtida = new ArrayList<>();

    private Long proximoId = 1L;

    @PostMapping
    public Curtida salvarCurtida (@RequestBody Curtida novaCurtida){
        novaCurtida.setIdUsuario(proximoId++);
        listaCurtida.add(novaCurtida);
        return novaCurtida;
    }

}
