package com.destiny.destiny.service;

import com.destiny.destiny.entity.usuario.Perfil;
import com.destiny.destiny.entity.usuario.PreferenciaBusca;
import com.destiny.destiny.repository.PerfilRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public List<Perfil> buscarPerfil() {
        return perfilRepository.findAll();
    }

    public void cadastrarPerfil(Perfil p) {
        perfilRepository.save(p);
    }

    @Transactional
    public void alterarPerfil(Long id, Perfil p) {
        Perfil perfil = perfilRepository.getReferenceById(id);
        perfil.setAlturaCm(p.getAlturaCm());
        perfil.setBio(p.getBio());
        perfil.setCategoriaGenero(p.getCategoriaGenero());
        perfil.setEscolaridade(p.getEscolaridade());
        perfil.setEstadoProfissional(p.getEstadoProfissional());
        perfil.setFotos(p.getFotos());
        perfil.setHobbies(p.getHobbies());
        perfil.setIdentidadeGenero(p.getIdentidadeGenero());
        perfil.setLocalizacao(p.getLocalizacao());
        perfil.setMostrarIdentidadeGenero(p.isMostrarIdentidadeGenero());
        perfil.setMostrarOrientacao(p.isMostrarOrientacao());
        perfil.setNome(p.getNome());
        perfil.setOrientacoes(p.getOrientacoes());
        perfil.setSigno(p.getSigno());
        perfil.setTiposRelacionamentos(p.getTiposRelacionamentos());
    }

    public void deletarPerfil(Long id){
        perfilRepository.deleteById(id);

    }


}
