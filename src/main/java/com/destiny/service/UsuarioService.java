package com.destiny.service;

import com.destiny.entity.Usuario;
import com.destiny.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> buscarUsuario (){
        List<Usuario> usuarioList = new ArrayList<>();
        return usuarioRepository.findAll();
    }

    public void cadastrarUsuario (Usuario usuario){
        Usuario u = new Usuario (usuario.getEmail(), usuario.getSenha(), usuario.getDataNascimento());
        usuarioRepository.save(u);
    }
}
