package com.destiny.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bloqueio", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_bloqueado", "id_bloqueador"})})
public class Bloqueio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloqueio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_bloqueador", nullable = false)
    private Usuario bloqueador;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_bloqueado", nullable = false)
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
