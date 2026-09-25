package com.appnamoro.appnamoro.model;

import java.time.LocalDateTime;

public class Mensagem {
    private Long idMensagem;
    private Long idMatch;
    private Long idRemetente;
    private String conteudo;
    private LocalDateTime dataEnvio;
    private Boolean visualizada;

    public Mensagem() {
    }

    public Mensagem(Long idMensagem, Long idMatch, Long idRemetente, String conteudo, LocalDateTime dataEnvio, Boolean visualizada) {
        this.idMensagem = idMensagem;
        this.idMatch = idMatch;
        this.idRemetente = idRemetente;
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
        this.visualizada = visualizada;
    }

    @Override
    public String toString() {
        return "com.appnamoro.appnamoro.model.Mensagem{" +
                "idMensagem=" + idMensagem +
                ", idMatch=" + idMatch +
                ", idRemetente=" + idRemetente +
                ", conteudo='" + conteudo + '\'' +
                ", dataEnvio=" + dataEnvio +
                ", visualizada=" + visualizada +
                '}';
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

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Boolean getVisualizada() {
        return visualizada;
    }

    public void setVisualizada(Boolean visualizada) {
        this.visualizada = visualizada;
    }
}
