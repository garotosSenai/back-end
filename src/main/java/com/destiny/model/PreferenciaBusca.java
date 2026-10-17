package com.destiny.model;

import com.destiny.model.enums.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PreferenciaBusca {

    private UUID idPreferencia;
    private Usuario usuario;
    private Set<Genero> generosInteresse = new HashSet<>();
    private int idadeMinima;
    private int idadeMaxima;
    private double distanciaMaximaKm;
    private int alturaMinimaCm;
    private int alturaMaximaCm;
    private Set<Signo> signos = new HashSet<>();
    private Set<Escolaridade> escolaridades = new HashSet<>();
    private Set<EstadoProfissional> estadoProfissionals = new HashSet<>();
    private Set<TiposRelacionamento> tiposRelacionamento = new HashSet<>();

    public PreferenciaBusca(){}

    public PreferenciaBusca(Usuario usuario, Set<Genero> generosInteresse, int idadeMinima, int idadeMaxima, double distanciaMaximaKm, int alturaMinimaCm, int alturaMaximaCm, Set<Signo> signos, Set<Escolaridade> escolaridades, Set<EstadoProfissional> estadoProfissionals, Set<TiposRelacionamento> tiposRelacionamento) {
        this.usuario = usuario;
        this.generosInteresse = generosInteresse;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
        this.distanciaMaximaKm = distanciaMaximaKm;
        this.alturaMinimaCm = alturaMinimaCm;
        this.alturaMaximaCm = alturaMaximaCm;
        this.signos = signos;
        this.escolaridades = escolaridades;
        this.estadoProfissionals = estadoProfissionals;
        this.tiposRelacionamento = tiposRelacionamento;
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

    public Set<Genero> getGenerosInteresse() {
        return generosInteresse;
    }

    public void setGenerosInteresse(Set<Genero> generosInteresse) {
        this.generosInteresse = generosInteresse;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public double getDistanciaMaximaKm() {
        return distanciaMaximaKm;
    }

    public void setDistanciaMaximaKm(double distanciaMaximaKm) {
        this.distanciaMaximaKm = distanciaMaximaKm;
    }

    public int getAlturaMinimaCm() {
        return alturaMinimaCm;
    }

    public void setAlturaMinimaCm(int alturaMinimaCm) {
        this.alturaMinimaCm = alturaMinimaCm;
    }

    public int getAlturaMaximaCm() {
        return alturaMaximaCm;
    }

    public void setAlturaMaximaCm(int alturaMaximaCm) {
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

    public Set<EstadoProfissional> getEstadoProfissionals() {
        return estadoProfissionals;
    }

    public void setEstadoProfissionals(Set<EstadoProfissional> estadoProfissionals) {
        this.estadoProfissionals = estadoProfissionals;
    }

    public Set<TiposRelacionamento> getTiposRelacionamento() {
        return tiposRelacionamento;
    }

    public void setTiposRelacionamento(Set<TiposRelacionamento> tiposRelacionamento) {
        this.tiposRelacionamento = tiposRelacionamento;
    }
}
