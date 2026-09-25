package com.appnamoro.appnamoro.controller;

import com.appnamoro.appnamoro.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();
    private Long idSequence = 1L;

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {
        usuario.setId_usuario(idSequence++);
        usuarios.add(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }


    @GetMapping
    public ResponseEntity<List<Usuario>> listarTodos() {
        return ResponseEntity.ok(usuarios);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        Optional<Usuario> usuarioFound = usuarios.stream()
                .filter(u -> u.getId_usuario().equals(id))
                .findFirst();

        return usuarioFound.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario dadosAtualizados) {
        Optional<Usuario> usuarioOpt = usuarios.stream()
                .filter(u -> u.getId_usuario().equals(id))
                .findFirst();

        if (usuarioOpt.isPresent()) {
            Usuario usuarioExistente = usuarioOpt.get();
            usuarioExistente.setNomeCompleto(dadosAtualizados.getNomeCompleto());
            usuarioExistente.setDtNascimento(dadosAtualizados.getDtNascimento());
            usuarioExistente.setIdade(dadosAtualizados.getIdade());
            usuarioExistente.setEmail(dadosAtualizados.getEmail());
            usuarioExistente.setGenero(dadosAtualizados.getGenero());
            usuarioExistente.setBiografia(dadosAtualizados.getBiografia());
            usuarioExistente.setCidade(dadosAtualizados.getCidade());
            usuarioExistente.setFoto_perfil(dadosAtualizados.getFoto_perfil());

            return ResponseEntity.ok(usuarioExistente);
        }

        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean removido = usuarios.removeIf(u -> u.getId_usuario().equals(id));
        if (removido) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}