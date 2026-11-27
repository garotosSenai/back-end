package com.destiny.service;

import com.destiny.entity.Perfil;
import com.destiny.entity.Usuario;
import com.destiny.repository.PerfilRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }


    public List<Perfil> buscarPerfil (){
        List<Usuario> perfilList = new ArrayList<>();
        return perfilRepository.findAll();
    }

    public Perfil cadastrarPerfil (Perfil perfil){
      Perfil p = new Perfil(perfil);
      return perfilRepository.save(perfil);
    }

    public void deletarPerfil (@PathVariable Long idPerfil){
        perfilRepository.deleteById(idPerfil);
    }

    @Transactional
    public void alterarPerfil (@PathVariable Long idPerfil, @RequestBody Perfil perfil){
        Perfil p = perfilRepository.getReferenceById(idPerfil);
        p.setIdUsuario(perfil.getIdUsuario());
        p.setNome(perfil.getNome());
        p.setGenero(perfil.getGenero());
        p.setIdentidadeGenero(perfil.getIdentidadeGenero());
        p.setMostrarIdentidadeGenero(perfil.isMostrarIdentidadeGenero());
        p.setBio(perfil.getBio());
        p.setLocalizacao(perfil.getLocalizacao());
        p.setFotos(perfil.getFotos());
        p.setAlturaCm(perfil.getAlturaCm());
        p.setSigno(perfil.getSigno());
        p.setEscolaridade(perfil.getEscolaridade());
        p.setEstadoProfissional(perfil.getEstadoProfissional());
        p.setOrientacaoSexual(perfil.getOrientacaoSexual());
        p.setMostrarOrientacao(perfil.isMostrarOrientacao());
        perfilRepository.save(p);
    }
}
