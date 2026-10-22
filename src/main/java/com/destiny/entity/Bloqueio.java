package com.destiny.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Bloqueio {

    private UUID idBloqueio;
    private Usuario bloqueador;
    private Usuario bloqueado;
    private LocalDateTime criadoEm;

    public Bloqueio (){}

    public Bloqueio(Usuario bloqueador, Usuario bloqueado) {
        this.bloqueador = bloqueador;
        this.bloqueado = bloqueado;
        this.criadoEm = LocalDateTime.now();
    }

    public UUID getIdBloqueio() {
        return idBloqueio;
    }

    public void setIdBloqueio(UUID idBloqueio) {
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
