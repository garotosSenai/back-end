package com.destiny.entity;

import com.destiny.entity.enums.TipoInteracao;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Interacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInteracao;
    private Usuario origem;
    private Usuario destino;
    @Enumerated(EnumType.STRING)
    private TipoInteracao tipo;
    private LocalDateTime criadoEm;

    public Interacao (){}

    public Interacao(Usuario origem, Usuario destino, TipoInteracao tipo) {
        this.origem = origem;
        this.destino = destino;
        this.tipo = tipo;
        this.criadoEm = LocalDateTime.now();
    }

    public Long getIdInteracao() {
        return idInteracao;
    }

    public void setIdInteracao(Long idInteracao) {
        this.idInteracao = idInteracao;
    }

    public Usuario getOrigem() {
        return origem;
    }

    public void setOrigem(Usuario origem) {
        this.origem = origem;
    }

    public Usuario getDestino() {
        return destino;
    }

    public void setDestino(Usuario destino) {
        this.destino = destino;
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
