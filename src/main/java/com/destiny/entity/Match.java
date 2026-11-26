package com.destiny.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "matches")
public class Match {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatch;
    private Long idUsuario1;
    private Long idUsuario2;
    private LocalDateTime criadoEm;
    private boolean ativo;

    public Match (){}

    public Match(Long idMatch, Long idUsuario1, Long idUsuario2) {
        this.idMatch = idMatch;
        this.idUsuario1 = idUsuario1;
        this.idUsuario2 = idUsuario2;
        this.criadoEm = LocalDateTime.now();
        this.ativo = true;
    }

    public Match(Long idUsuario1, Long idUsuario2) {
        this.idUsuario1 = idUsuario1;
        this.idUsuario2 = idUsuario2;
        this.criadoEm = LocalDateTime.now();
        this.ativo = true;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Long getIdUsuario1() {
        return idUsuario1;
    }

    public void setIdUsuario1(Long idUsuario1) {
        this.idUsuario1 = idUsuario1;
    }

    public Long getIdUsuario2() {
        return idUsuario2;
    }

    public void setIdUsuario2(Long idUsuario2) {
        this.idUsuario2 = idUsuario2;
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
