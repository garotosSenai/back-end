package com.destiny.destiny.entity.conexao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Localizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idlocalizacao;
    private String cidade;
    private String estado;
    private Double latitude;
    private Double longitude;

    public Localizacao(){}

    public Localizacao(String cidade, String estado, Double latitude, Double longitude) {
        this.cidade = cidade;
        this.estado = estado;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Localizacao(Long idlocalizacao, String cidade, String estado, Double latitude, Double longitude) {
        this.idlocalizacao = idlocalizacao;
        this.cidade = cidade;
        this.estado = estado;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getIdlocalizacao() {
        return idlocalizacao;
    }

    public void setIdlocalizacao(Long idlocalizacao) {
        this.idlocalizacao = idlocalizacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
