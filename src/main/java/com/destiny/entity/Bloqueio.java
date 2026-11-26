package com.destiny.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Bloqueio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloqueio;
    private Long idBloqueador;
    private Long idBloqueado;
    private LocalDateTime criadoEm;

    public Bloqueio (){}

    public Bloqueio(Long idBloqueio, Long idBloqueador, Long idBloqueado) {
        this.idBloqueio = idBloqueio;
        this.idBloqueador = idBloqueador;
        this.idBloqueado = idBloqueado;
        this.criadoEm = LocalDateTime.now();
    }

    public Bloqueio(Long idBloqueador, Long idBloqueado) {
        this.idBloqueador = idBloqueador;
        this.idBloqueado = idBloqueado;
        this.criadoEm = LocalDateTime.now();
    }

    public Long getIdBloqueio() {
        return idBloqueio;
    }

    public void setIdBloqueio(Long idBloqueio) {
        this.idBloqueio = idBloqueio;
    }

    public Long getIdBloqueador() {
        return idBloqueador;
    }

    public void setIdBloqueador(Long idBloqueador) {
        this.idBloqueador = idBloqueador;
    }

    public Long getIdBloqueado() {
        return idBloqueado;
    }

    public void setIdBloqueado(Long idBloqueado) {
        this.idBloqueado = idBloqueado;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
