package com.destiny.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Bloqueio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloqueio;
    private Usuario bloqueador;
    private Usuario bloqueado;
    private LocalDateTime criadoEm;

    public Bloqueio (){}

    public Bloqueio(Usuario bloqueador, Usuario bloqueado) {
        this.bloqueador = bloqueador;
        this.bloqueado = bloqueado;
        this.criadoEm = LocalDateTime.now();
    }

    public Long getIdBloqueio() {
        return idBloqueio;
    }

    public void setIdBloqueio(Long idBloqueio) {
        this.idBloqueio = idBloqueio;
    }

    public Usuario getBloqueador() {
        return bloqueador;
    }

    public void setBloqueador(Usuario bloqueador) {
        this.bloqueador = bloqueador;
    }

    public Usuario getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Usuario bloqueado) {
        this.bloqueado = bloqueado;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
