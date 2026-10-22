package com.destiny.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Foto {

    private UUID idFoto;
    private String url;
    private int ordem;
    private LocalDateTime criadoEm;

    public Foto (){}

    public Foto(String url, int ordem) {
        this.url = url;
        this.ordem = ordem;
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

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
