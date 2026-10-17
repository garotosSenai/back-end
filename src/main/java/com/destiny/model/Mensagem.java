package com.destiny.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Mensagem {

    private UUID idMensagem;
    private Match match;
    private Usuario remetente;
    private String conteudo;
    private LocalDateTime enviadaEm;
    private LocalDateTime visualizadaEm;

    public Mensagem (){}

    public Mensagem(Match match, Usuario remetente, String conteudo) {
        this.match = match;
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.enviadaEm = LocalDateTime.now();
        this.visualizadaEm = visualizadaEm;
    }

    public UUID getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(UUID idMensagem) {
        this.idMensagem = idMensagem;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
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
