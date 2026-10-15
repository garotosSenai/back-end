package com.destiny.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Foto {

    private UUID idFoto;
    private String url;
    private int ordemFotos;
    private LocalDateTime criadoEm;

    public Foto(String url, int ordemFotos, LocalDateTime criadoEm) {
        this.url = url;
        this.ordemFotos = ordemFotos;
        this.criadoEm = LocalDateTime.now();
    }

    public UUID getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(UUID idFoto) {
        this.idFoto = idFoto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrdemFotos() {
        return ordemFotos;
    }

    public void setOrdemFotos(int ordemFotos) {
        this.ordemFotos = ordemFotos;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
