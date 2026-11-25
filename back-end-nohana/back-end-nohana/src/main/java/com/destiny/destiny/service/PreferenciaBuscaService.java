package com.destiny.destiny.service;

import com.destiny.destiny.entity.usuario.PreferenciaBusca;
import com.destiny.destiny.repository.PreferenciaBuscaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenciaBuscaService {
    private final PreferenciaBuscaRepository preferenciaBuscaRepository;

    public PreferenciaBuscaService(PreferenciaBuscaRepository preferenciaBuscaRepository) {
        this.preferenciaBuscaRepository = preferenciaBuscaRepository;
    }

    public List<PreferenciaBusca> buscarPreferencia() {
        return preferenciaBuscaRepository.findAll();
    }

    public void cadastrarPreferencia(PreferenciaBusca p) {
        preferenciaBuscaRepository.save(p);
    }

    @Transactional
    public void alterarPreferencia(Long id, PreferenciaBusca p) {
        PreferenciaBusca preferenciaBusca = preferenciaBuscaRepository.getReferenceById(id);
        preferenciaBusca.setAlturaMaximaCm(p.getAlturaMaximaCm());
        preferenciaBusca.setAlturaMinimaCm(p.getAlturaMinimaCm());
        preferenciaBusca.setDistanciaMaximaKm(p.getDistanciaMaximaKm());
        preferenciaBusca.setEscolaridades(p.getEscolaridades());
        preferenciaBusca.setGenerosInteresse(p.getGenerosInteresse());
        preferenciaBusca.setIdadeMinima(p.getIdadeMinima());
        preferenciaBusca.setIdadeMaxima(p.getIdadeMaxima());
        preferenciaBusca.setSignos(p.getSignos());
        preferenciaBusca.setEstadosProfissionais(p.getEstadosProfissionais());
        preferenciaBusca.setTiposRelacionamentos(p.getTiposRelacionamentos());
    }

    public void deletarPrefencia(Long id){
        preferenciaBuscaRepository.deleteById(id);

    }

}

