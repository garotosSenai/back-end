package com.destiny.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Foto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoto;
    private String url;
    private int ordem;
    private LocalDateTime criadoEm;

    public Foto (){}

    public Foto(String url, int ordem) {
        this.url = url;
        this.ordem = ordem;
        this.criadoEm = LocalDateTime.now();
    }

    public Long getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Long idFoto) {
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
