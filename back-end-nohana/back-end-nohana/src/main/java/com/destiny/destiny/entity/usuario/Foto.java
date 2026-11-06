package com.destiny.destiny.entity.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity

public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoto;
    private String url;
    private int ordem;
    private LocalDateTime criadoEm;

    public Foto(){}

    public Foto(String url, int ordem, LocalDateTime criadoEm) {
        this.url = url;
        this.ordem = ordem;
        this.criadoEm = criadoEm;
    }

    public Foto(Long idFoto, String url, int ordem, LocalDateTime criadoEm) {
        this.idFoto = idFoto;
        this.url = url;
        this.ordem = ordem;
        this.criadoEm = criadoEm;
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
