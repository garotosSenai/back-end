package com.destiny.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Mensagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensagem;
    private Long idMatch;
    private Long idRemetente;
    private String conteudo;
    private LocalDateTime enviadaEm;
    private LocalDateTime visualizadaEm;

    public Mensagem (){}

    public Mensagem(Long idMensagem, Long idMatch, Long idRemetente, String conteudo) {
        this.idMensagem = idMensagem;
        this.idMatch = idMatch;
        this.idRemetente = idRemetente;
        this.conteudo = conteudo;
        this.enviadaEm = LocalDateTime.now();
        this.visualizadaEm = LocalDateTime.now();
    }

    public Mensagem(Long idMatch, Long idRemetente, String conteudo) {
        this.idMatch = idMatch;
        this.idRemetente = idRemetente;
        this.conteudo = conteudo;
        this.enviadaEm = LocalDateTime.now();
        this.visualizadaEm = LocalDateTime.now();
    }

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Long getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(Long idRemetente) {
        this.idRemetente = idRemetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getEnviadaEm() {
        return enviadaEm;
    }

    public void setEnviadaEm(LocalDateTime enviadaEm) {
        this.enviadaEm = enviadaEm;
    }

    public LocalDateTime getVisualizadaEm() {
        return visualizadaEm;
    }

    public void setVisualizadaEm(LocalDateTime visualizadaEm) {
        this.visualizadaEm = visualizadaEm;
    }
}
