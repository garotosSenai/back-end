package com.destiny.destiny.controller;

import com.destiny.destiny.entity.usuario.Usuario;
import com.destiny.destiny.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> buscarUsuario(){
        return usuarioService.buscarUsuario();
    }

    @PostMapping
    public void cadastrarUsuario(@RequestBody Usuario usuario){
        usuarioService.cadastrarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public void alterarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        usuarioService.alterarUsuario(id, usuario);
    }
}
