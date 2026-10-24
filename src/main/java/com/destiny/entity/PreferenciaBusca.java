package com.destiny.entity;

import com.destiny.entity.enums.*;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class PreferenciaBusca {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPreferencia;
    private Usuario usuario;
    @Enumerated(EnumType.STRING)
    private Set<CategoriaGenero> generosInteresse = new HashSet<>();
    private Integer idadeMinima = 18;
    private Integer idadeMaxima = 99;
    private Double distanciaMaximaKm = 50.0;
    private Integer alturaMinimaCm;
    private Integer alturaMaximaCm;
    @Enumerated(EnumType.STRING)
    private Set<Signo> signos = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<Escolaridade> escolaridades = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<EstadoProfissional> estadosProfissionais = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<TipoRelacionamento> tiposRelacionamentos = new HashSet<>();

    public PreferenciaBusca(){}

    public PreferenciaBusca(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(Long idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<CategoriaGenero> getGenerosInteresse() {
        return generosInteresse;
    }

    public void setGenerosInteresse(Set<CategoriaGenero> generosInteresse) {
        this.generosInteresse = generosInteresse;
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

    public Set<Signo> getSignos() {
        return signos;
    }

    public void setSignos(Set<Signo> signos) {
        this.signos = signos;
    }

    public Set<Escolaridade> getEscolaridades() {
        return escolaridades;
    }

    public void setEscolaridades(Set<Escolaridade> escolaridades) {
        this.escolaridades = escolaridades;
    }

    public Set<EstadoProfissional> getEstadosProfissionais() {
        return estadosProfissionais;
    }

    public void setEstadosProfissionais(Set<EstadoProfissional> estadosProfissionais) {
        this.estadosProfissionais = estadosProfissionais;
    }

    public Set<TipoRelacionamento> getTiposRelacionamentos() {
        return tiposRelacionamentos;
    }

    public void setTiposRelacionamentos(Set<TipoRelacionamento> tiposRelacionamentos) {
        this.tiposRelacionamentos = tiposRelacionamentos;
    }
}
