package com.destiny.model;

import com.destiny.model.enums.MotivoDenuncia;
import com.destiny.model.enums.StatusDenuncia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Denuncia {

    private UUID IdDenuncia;
    private Usuario denunciante;
    private Usuario denunciado;
    private MotivoDenuncia motivoDenuncia;
    private String descricao;
    private LocalDateTime criadaEm;
    private StatusDenuncia statusDenuncia;

    public Denuncia (){}

    public Denuncia(Usuario denunciante, Usuario denunciado, MotivoDenuncia motivoDenuncia, String descricao, LocalDateTime criadaEm, StatusDenuncia statusDenuncia) {
        this.denunciante = denunciante;
        this.denunciado = denunciado;
        this.motivoDenuncia = motivoDenuncia;
        this.descricao = descricao;
        this.criadaEm = LocalDateTime.now();
        this.statusDenuncia = StatusDenuncia.PENDENTE;
    }

    public UUID getIdDenuncia() {
        return IdDenuncia;
    }

    public void setIdDenuncia(UUID idDenuncia) {
        IdDenuncia = idDenuncia;
    }

    public Usuario getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Usuario denunciante) {
        this.denunciante = denunciante;
    }

    public Usuario getDenunciado() {
        return denunciado;
    }

    public void setDenunciado(Usuario denunciado) {
        this.denunciado = denunciado;
    }

    public MotivoDenuncia getMotivoDenuncia() {
        return motivoDenuncia;
    }

    public void setMotivoDenuncia(MotivoDenuncia motivoDenuncia) {
        this.motivoDenuncia = motivoDenuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriadaEm() {
        return criadaEm;
    }

    public void setCriadaEm(LocalDateTime criadaEm) {
        this.criadaEm = criadaEm;
    }

    public StatusDenuncia getStatusDenuncia() {
        return statusDenuncia;
    }

    public void setStatusDenuncia(StatusDenuncia statusDenuncia) {
        this.statusDenuncia = statusDenuncia;
    }
}
