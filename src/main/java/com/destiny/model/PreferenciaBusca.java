package com.destiny.model;

import com.destiny.model.enums.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PreferenciaBusca {

    private UUID idPreferencia;
    private Usuario usuario;
    private Set<CategoriaGenero> generosInteresse = new HashSet<>();
    private Integer idadeMinima = 18;
    private Integer idadeMaxima  = 99;
    private Double distanciaMaximaKm = 50.0;
    private Integer alturaMinimaCm;
    private Integer alturaMaximaCm;
    private Set<Signo> signos = new HashSet<>();
    private Set<Escolaridade> escolaridades = new HashSet<>();
    private Set<EstadoProfissional> estadosProfissionais = new HashSet<>();
    private Set<TipoRelacionamento> tiposRelacionamento = new HashSet<>();

    public PreferenciaBusca(){}

    public PreferenciaBusca(Usuario usuario) {
        this.usuario = usuario;
    }

    public UUID getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(UUID idPreferencia) {
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

    public Set<TipoRelacionamento> getTiposRelacionamento() {
        return tiposRelacionamento;
    }

    public void setTiposRelacionamento(Set<TipoRelacionamento> tiposRelacionamento) {
        this.tiposRelacionamento = tiposRelacionamento;
    }
}
