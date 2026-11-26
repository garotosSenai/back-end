package com.destiny.entity;

import com.destiny.entity.enums.TipoInteracao;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Interacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInteracao;
    private Long idOrigem;
    private Long idDestino;
    @Enumerated(EnumType.STRING)
    private TipoInteracao tipo;
    private LocalDateTime criadoEm;

    public Interacao (){}

    public Interacao(Long idInteracao, Long idOrigem, Long idDestino, TipoInteracao tipo) {
        this.idInteracao = idInteracao;
        this.idOrigem = idOrigem;
        this.idDestino = idDestino;
        this.tipo = tipo;
        this.criadoEm = LocalDateTime.now();
    }

    public Interacao(Long idOrigem, Long idDestino, TipoInteracao tipo) {
        this.idOrigem = idOrigem;
        this.idDestino = idDestino;
        this.tipo = tipo;
        this.criadoEm = LocalDateTime.now();
    }

    public Long getIdInteracao() {
        return idInteracao;
    }

    public void setIdInteracao(Long idInteracao) {
        this.idInteracao = idInteracao;
    }

    public Long getIdOrigem() {
        return idOrigem;
    }

    public void setIdOrigem(Long idOrigem) {
        this.idOrigem = idOrigem;
    }

    public Long getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Long idDestino) {
        this.idDestino = idDestino;
    }

    public TipoInteracao getTipo() {
        return tipo;
    }

    public void setTipo(TipoInteracao tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
