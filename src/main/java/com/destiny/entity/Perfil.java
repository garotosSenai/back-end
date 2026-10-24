package com.destiny.entity;

import com.destiny.entity.enums.*;
import jakarta.persistence.*;

import java.util.*;

@Entity
public class Perfil {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;
    private Usuario usuario;
    private String nome;
    @Enumerated(EnumType.STRING)
    private CategoriaGenero categoriaGenero;
    @Enumerated(EnumType.STRING)
    private IdentidadeGenero identidadeGenero;
    private boolean mostrarIdentidadeGenero = false;
    private String bio;
    private Localizacao localizacao;
    private List<Foto> fotos = new ArrayList<>();
    private Integer alturaCm;
    @Enumerated(EnumType.STRING)
    private Signo signo;
    @Enumerated(EnumType.STRING)
    private Escolaridade escolaridade;
    @Enumerated(EnumType.STRING)
    private EstadoProfissional estadoProfissional;
    @Enumerated(EnumType.STRING)
    private Set<OrientacaoSexual> orientacoes = new HashSet<>();
    private boolean mostrarOrientacao = false;
    private Set<Hobby> hobbies = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<TipoRelacionamento> tiposRelacionamentos = new HashSet<>();

    public Perfil (){}

    public Perfil(Usuario usuario, String nome, CategoriaGenero categoriaGenero, Localizacao localizacao) {
        this.usuario = usuario;
        this.nome = nome;
        this.categoriaGenero = categoriaGenero;
        this.localizacao = localizacao;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
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

    public CategoriaGenero getCategoriaGenero() {
        return categoriaGenero;
    }

    public void setCategoriaGenero(CategoriaGenero categoriaGenero) {
        this.categoriaGenero = categoriaGenero;
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

    public Set<TipoRelacionamento> getTiposRelacionamentos() {
        return tiposRelacionamentos;
    }

    public void setTiposRelacionamentos(Set<TipoRelacionamento> tiposRelacionamentos) {
        this.tiposRelacionamentos = tiposRelacionamentos;
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
