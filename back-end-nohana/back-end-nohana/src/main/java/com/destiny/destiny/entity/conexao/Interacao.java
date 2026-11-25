package com.destiny.destiny.entity.conexao;

import com.destiny.destiny.entity.enums.TipoInteracao;
import com.destiny.destiny.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity


public class Interacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInteracao;
    private Usuario origem;
    private Usuario destino;
    @Enumerated(EnumType.STRING)
    private TipoInteracao tipo;
    private LocalDateTime criadoEm;

    public Interacao(){
    }

    public Interacao(LocalDateTime criadoEm, Usuario origem, Usuario destino, TipoInteracao tipo) {
        this.criadoEm = criadoEm;
        this.origem = origem;
        this.destino = destino;
        this.tipo = tipo;
    }

    public Interacao(Long idInteracao, Usuario origem, Usuario destino, TipoInteracao tipo, LocalDateTime criadoEm) {
        this.idInteracao = idInteracao;
        this.origem = origem;
        this.destino = destino;
        this.tipo = tipo;
        this.criadoEm = criadoEm;
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
