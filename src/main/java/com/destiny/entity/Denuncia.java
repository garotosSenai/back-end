package com.destiny.entity;

import com.destiny.entity.enums.MotivoDenuncia;
import com.destiny.entity.enums.StatusDenuncia;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDenuncia;
    private Long idDenunciante;
    private Long idDenunciado;
    @Enumerated(EnumType.STRING)
    private MotivoDenuncia motivo;
    private String descricao;
    private LocalDateTime criadoEm;
    @Enumerated(EnumType.STRING)
    private StatusDenuncia status;

    public Denuncia() {
    }

    public Denuncia(Long idDenuncia, Long idDenunciante, Long idDenunciado, MotivoDenuncia motivo, String descricao) {
        this.idDenuncia = idDenuncia;
        this.idDenunciante = idDenunciante;
        this.idDenunciado = idDenunciado;
        this.motivo = motivo;
        this.descricao = descricao;
        this.criadoEm = LocalDateTime.now();
        this.status = StatusDenuncia.PENDENTE;
    }

    public Denuncia(Long idDenunciante, Long idDenunciado, MotivoDenuncia motivo, String descricao) {
        this.idDenunciante = idDenunciante;
        this.idDenunciado = idDenunciado;
        this.motivo = motivo;
        this.descricao = descricao;
        this.criadoEm = LocalDateTime.now();
        this.status = StatusDenuncia.PENDENTE;
    }

    public Long getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(Long idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public Long getIdDenunciante() {
        return idDenunciante;
    }

    public void setIdDenunciante(Long idDenunciante) {
        this.idDenunciante = idDenunciante;
    }

    public Long getIdDenunciado() {
        return idDenunciado;
    }

    public void setIdDenunciado(Long idDenunciado) {
        this.idDenunciado = idDenunciado;
    }

    public MotivoDenuncia getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoDenuncia motivo) {
        this.motivo = motivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public StatusDenuncia getStatus() {
        return status;
    }

    public void setStatus(StatusDenuncia status) {
        this.status = status;
    }
}
