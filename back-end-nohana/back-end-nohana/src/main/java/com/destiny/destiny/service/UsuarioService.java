package com.destiny.destiny.service;

import com.destiny.destiny.entity.usuario.Usuario;
import com.destiny.destiny.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> buscarUsuario(){
        List<Usuario> usuarioList = new ArrayList<>();
        return usuarioRepository.findAll();
    }

    public Usuario cadastrarUsuario (Usuario u){
       return usuarioRepository.save(u);
    }

    public void deletar(long id){
        usuarioRepository.deleteById(id);
    }

    @Transactional
    public void alterarUsuario(Long id, Usuario u){
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.setAtivo(u.isAtivo());
        usuario.setCriadoEm(u.getCriadoEm());
        usuario.setDataNascimento(u.getDataNascimento());
        usuario.setSenha(u.getSenha());
        usuario.setEmail(u.getEmail());

    }
}
