package com.destiny.entity;

import com.destiny.entity.enums.MotivoDenuncia;
import com.destiny.entity.enums.StatusDenuncia;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Denuncia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idDenuncia;
    private Usuario denunciante;
    private Usuario denunciado;
    @Enumerated(EnumType.STRING)
    private MotivoDenuncia motivo;
    private String descricao;
    private LocalDateTime criadoEm;
    @Enumerated(EnumType.STRING)
    private StatusDenuncia status;

    public Denuncia (){}

    public Denuncia(Usuario denunciante, Usuario denunciado, MotivoDenuncia motivo, String descricao) {
        this.denunciante = denunciante;
        this.denunciado = denunciado;
        this.motivo = motivo;
        this.descricao = descricao;
        this.criadoEm = LocalDateTime.now();
        this.status = StatusDenuncia.PENDENTE;
    }

    public UUID getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(UUID idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public Usuario getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Usuario denunciante) {
        this.denunciante = denunciante;
    }

    public Usuario getDenunciado() {
        return denunciado;
    }

    public void setDenunciado(Usuario denunciado) {
        this.denunciado = denunciado;
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
