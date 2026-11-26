package com.destiny.entity;

import com.destiny.entity.enums.*;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class PreferenciaBusca {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPreferencia;
    private Long idUsuario;
    //@ElementCollection = ajustar
    @Transient //por enquanto deixar assim
    private Set<Genero> generos = new HashSet<>();
    private Integer idadeMinima = 18;
    private Integer idadeMaxima = 99;
    private Double distanciaMaximaKm = 50.0;
    private Integer alturaMinimaCm;
    private Integer alturaMaximaCm;
    private String signo;
    private String escolaridade;
    private String estadoProfissional;
    private String tipoRelacionamento;

    public PreferenciaBusca(){}

    public PreferenciaBusca(Long idPreferencia, Long idUsuario, Set<Genero> generos, Integer idadeMinima, Integer idadeMaxima, Double distanciaMaximaKm, Integer alturaMinimaCm, Integer alturaMaximaCm, String signo, String escolaridade, String estadoProfissional, String tipoRelacionamento) {
        this.idPreferencia = idPreferencia;
        this.idUsuario = idUsuario;
        this.generos = generos;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
        this.distanciaMaximaKm = distanciaMaximaKm;
        this.alturaMinimaCm = alturaMinimaCm;
        this.alturaMaximaCm = alturaMaximaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.tipoRelacionamento = tipoRelacionamento;
    }

    public PreferenciaBusca(Long idUsuario, Set<Genero> generos, Integer idadeMinima, Integer idadeMaxima, Double distanciaMaximaKm, Integer alturaMinimaCm, Integer alturaMaximaCm, String signo, String escolaridade, String estadoProfissional, String tipoRelacionamento) {
        this.idUsuario = idUsuario;
        this.generos = generos;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
        this.distanciaMaximaKm = distanciaMaximaKm;
        this.alturaMinimaCm = alturaMinimaCm;
        this.alturaMaximaCm = alturaMaximaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.tipoRelacionamento = tipoRelacionamento;
    }

    public Long getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(Long idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(Integer idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public Double getDistanciaMaximaKm() {
        return distanciaMaximaKm;
    }

    public void setDistanciaMaximaKm(Double distanciaMaximaKm) {
        this.distanciaMaximaKm = distanciaMaximaKm;
    }

    public Integer getAlturaMinimaCm() {
        return alturaMinimaCm;
    }

    public void setAlturaMinimaCm(Integer alturaMinimaCm) {
        this.alturaMinimaCm = alturaMinimaCm;
    }

    public Integer getAlturaMaximaCm() {
        return alturaMaximaCm;
    }

    public void setAlturaMaximaCm(Integer alturaMaximaCm) {
        this.alturaMaximaCm = alturaMaximaCm;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstadoProfissional() {
        return estadoProfissional;
    }

    public void setEstadoProfissional(String estadoProfissional) {
        this.estadoProfissional = estadoProfissional;
    }

    public String getTipoRelacionamento() {
        return tipoRelacionamento;
    }

    public void setTipoRelacionamento(String tipoRelacionamento) {
        this.tipoRelacionamento = tipoRelacionamento;
    }
}
