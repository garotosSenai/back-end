package com.destiny.model;

import com.destiny.model.enums.TipoInteracao;

import java.time.LocalDateTime;
import java.util.UUID;

public class Interacao {

    private UUID idInteracao;
    private Usuario origemInteracao;
    private Usuario destinoInteracao;
    private TipoInteracao tipoInteracao;
    private LocalDateTime criadoEm;

    public Interacao (){}

    public Interacao(UUID idInteracao, Usuario origemInteracao, Usuario destinoInteracao, TipoInteracao tipoInteracao, LocalDateTime criadoEm) {
        this.idInteracao = idInteracao;
        this.origemInteracao = origemInteracao;
        this.destinoInteracao = destinoInteracao;
        this.tipoInteracao = tipoInteracao;
        this.criadoEm = LocalDateTime.now();
    }

    public UUID getIdInteracao() {
        return idInteracao;
    }

    public void setIdInteracao(UUID idInteracao) {
        this.idInteracao = idInteracao;
    }

    public Usuario getOrigemInteracao() {
        return origemInteracao;
    }

    public void setOrigemInteracao(Usuario origemInteracao) {
        this.origemInteracao = origemInteracao;
    }

    public Usuario getDestinoInteracao() {
        return destinoInteracao;
    }

    public void setDestinoInteracao(Usuario destinoInteracao) {
        this.destinoInteracao = destinoInteracao;
    }

    public TipoInteracao getTipoInteracao() {
        return tipoInteracao;
    }

    public void setTipoInteracao(TipoInteracao tipoInteracao) {
        this.tipoInteracao = tipoInteracao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
