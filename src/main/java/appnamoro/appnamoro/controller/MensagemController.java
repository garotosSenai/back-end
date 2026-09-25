package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/mensagem")
public class MensagemController {

    private List <Mensagem> listaMensagem = new ArrayList<>();

    private Long proximoId = 1L;

@PostMapping
    public Mensagem salvarMensagem (@RequestBody Mensagem novaMensagem){
        novaMensagem.setIdMensagem(proximoId++);
        novaMensagem.setDataEnvio(LocalDateTime.now());
        novaMensagem.setVisualizacao(false);

        listaMensagem.add(novaMensagem);
        return novaMensagem;
    }
}
