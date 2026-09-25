package com.appnamoro.appnamoro.controller;

import com.appnamoro.appnamoro.model.Mensagem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    private final List<Mensagem> mensagens = new ArrayList<>();
    private Long idSequence = 1L;

    @PostMapping
    public ResponseEntity<Mensagem> criar(@RequestBody Mensagem mensagem) {
        mensagem.setIdMensagem(idSequence++);

        if (mensagem.getDataEnvio() == null) {
            mensagem.setDataEnvio(LocalDateTime.now());
        }

        if (mensagem.getVisualizada() == null) {
            mensagem.setVisualizada(false);
        }

        mensagens.add(mensagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(mensagem);
    }

    @GetMapping
    public ResponseEntity<List<Mensagem>> listarTodos() {
        return ResponseEntity.ok(mensagens);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mensagem> buscarPorId(@PathVariable Long id) {
        for (Mensagem msg : mensagens) {
            if (msg.getIdMensagem().equals(id)) {
                return ResponseEntity.ok(msg);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mensagem> atualizar(@PathVariable Long id, @RequestBody Mensagem dadosAtualizados) {
        for (Mensagem msg : mensagens) {
            if (msg.getIdMensagem().equals(id)) {
                if (dadosAtualizados.getConteudo() != null) {
                    msg.setConteudo(dadosAtualizados.getConteudo());
                }
                if (dadosAtualizados.getVisualizada() != null) {
                    msg.setVisualizada(dadosAtualizados.getVisualizada());
                }
                return ResponseEntity.ok(msg);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean removido = mensagens.removeIf(msg -> msg.getIdMensagem().equals(id));
        if (removido) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

