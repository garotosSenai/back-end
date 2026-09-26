package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Mensagem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public ResponseEntity<List<Mensagem>> listarMensagem () {
        return ResponseEntity.ok(listaMensagem);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Mensagem> buscarPorId (@PathVariable Long id){
        for (Mensagem msg : listaMensagem){
           if (msg.getIdMensagem().equals(id)){
               return ResponseEntity.ok(msg);
           }
        }
        return ResponseEntity.notFound().build();
    }
}
