package com.destiny.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Match {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idMatch;
    private Usuario usuario1;
    private Usuario usuario2;
    private LocalDateTime criadoEm;
    private boolean ativo;

    public Match (){}

    public Match(Usuario usuario1, Usuario usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.criadoEm = LocalDateTime.now();
        this.ativo = true;
    }

    public UUID getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(UUID idMatch) {
        this.idMatch = idMatch;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
