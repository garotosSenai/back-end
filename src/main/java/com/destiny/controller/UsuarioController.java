package com.destiny.controller;

import com.destiny.entity.Usuario;
import com.destiny.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> buscar (){
        return usuarioService.buscarUsuario();
    }

    @PostMapping
    public void cadastrar (@RequestBody Usuario usuario){
        usuarioService.cadastrarUsuario(usuario);
    }
}
