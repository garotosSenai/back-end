package com.destiny.model;

import com.destiny.model.enums.*;

import java.util.*;

public class Perfil {

    private UUID idPerfil;
    private Usuario usuario;
    private String nome;
    private CategoriaGenero genero;
    private IdentidadeGenero identidadeGenero;
    private boolean mostrarIdentidadeGenero = false;
    private String bio;
    private Localizacao localizacao;
    private List<Foto> fotos = new ArrayList<>();
    private Integer alturaCm;
    private Signo signo;
    private Escolaridade escolaridade;
    private EstadoProfissional estadoProfissional;
    private Set<OrientacaoSexual> orientacoes = new HashSet<>();
    private boolean mostrarOrientacao = false;
    private Set<Hobby> hobbies = new HashSet<>();
    private Set<TipoRelacionamento> buscandoTipoRelacionamento = new HashSet<>();

    public Perfil (){}

    public Perfil(Usuario usuario, String nome, CategoriaGenero genero, Localizacao localizacao) {
        this.usuario = usuario;
        this.nome = nome;
        this.genero = genero;
        this.localizacao = localizacao;
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

    public CategoriaGenero getGenero() {
        return genero;
    }

    public void setGenero(CategoriaGenero genero) {
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

    public Integer getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Integer alturaCm) {
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


    public Set<OrientacaoSexual> getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(Set<OrientacaoSexual> orientacoes) {
        this.orientacoes = orientacoes;
    }

    public boolean isMostrarOrientacao() {
        return mostrarOrientacao;
    }

    public void setMostrarOrientacao(boolean mostrarOrientacao) {
        this.mostrarOrientacao = mostrarOrientacao;
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<TipoRelacionamento> getBuscandoTipoRelacionamento() {
        return buscandoTipoRelacionamento;
    }

    public void setBuscandoTipoRelacionamento(Set<TipoRelacionamento> buscandoTipoRelacionamento) {
        this.buscandoTipoRelacionamento = buscandoTipoRelacionamento;
    }

    public IdentidadeGenero getIdentidadeGenero() {
        return identidadeGenero;
    }

    public void setIdentidadeGenero(IdentidadeGenero identidadeGenero) {
        this.identidadeGenero = identidadeGenero;
    }

    public boolean isMostrarIdentidadeGenero() {
        return mostrarIdentidadeGenero;
    }

    public void setMostrarIdentidadeGenero(boolean mostrarIdentidadeGenero) {
        this.mostrarIdentidadeGenero = mostrarIdentidadeGenero;
    }
}
