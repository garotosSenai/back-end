package com.destiny.model;

import com.destiny.model.enums.*;

import java.util.*;

public class Perfil {

    private UUID idPerfil;
    private Usuario usuario;
    private String nome;
    private Genero genero;
    private String bio;
    private Localizacao localizacao;
    private List<Foto> fotos = new ArrayList<>();
    private int alturaCm;
    private Signo signo;
    private Escolaridade escolaridade;
    private EstadoProfissional estadoProfissional;
    private Set<OrientacaoSexual> orientacaoSexual = new HashSet<>();
    private boolean mostrarSexualidade = false;

    public Perfil (){}

    public Perfil(Usuario usuario, String nome, Genero genero, String bio, Localizacao localizacao, List<Foto> fotos, int alturaCm, Signo signo, Escolaridade escolaridade, EstadoProfissional estadoProfissional, Set<OrientacaoSexual> orientacaoSexual, boolean mostrarSexualidade) {
        this.usuario = usuario;
        this.nome = nome;
        this.genero = genero;
        this.bio = bio;
        this.localizacao = localizacao;
        this.fotos = fotos;
        this.alturaCm = alturaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.orientacaoSexual = orientacaoSexual;
        this.mostrarSexualidade = mostrarSexualidade;
    }

    public UUID getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(UUID idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    public Signo getSigno() {
        return signo;
    }

    public void setSigno(Signo signo) {
        this.signo = signo;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public EstadoProfissional getEstadoProfissional() {
        return estadoProfissional;
    }

    public void setEstadoProfissional(EstadoProfissional estadoProfissional) {
        this.estadoProfissional = estadoProfissional;
    }

    public Set<OrientacaoSexual> getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setOrientacaoSexual(Set<OrientacaoSexual> orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    public boolean isMostrarSexualidade() {
        return mostrarSexualidade;
    }

    public void setMostrarSexualidade(boolean mostrarSexualidade) {
        this.mostrarSexualidade = mostrarSexualidade;
    }
}
