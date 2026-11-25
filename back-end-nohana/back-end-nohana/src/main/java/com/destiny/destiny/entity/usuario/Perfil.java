package com.destiny.destiny.entity.usuario;

import com.destiny.destiny.entity.conexao.Hobby;
import com.destiny.destiny.entity.conexao.Localizacao;
import com.destiny.destiny.entity.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public Perfil(Usuario usuario, String nome, CategoriaGenero categoriaGenero, IdentidadeGenero identidadeGenero, boolean mostrarIdentidadeGenero, String bio, Localizacao localizacao, List<Foto> fotos, Integer alturaCm, Signo signo, Escolaridade escolaridade, EstadoProfissional estadoProfissional, Set<OrientacaoSexual> orientacoes, boolean mostrarOrientacao) {
        this.usuario = usuario;
        this.nome = nome;
        this.categoriaGenero = categoriaGenero;
        this.identidadeGenero = identidadeGenero;
        this.mostrarIdentidadeGenero = mostrarIdentidadeGenero;
        this.bio = bio;
        this.localizacao = localizacao;
        this.fotos = fotos;
        this.alturaCm = alturaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.orientacoes = orientacoes;
        this.mostrarOrientacao = mostrarOrientacao;
    }

    public Perfil(Long idPerfil, Usuario usuario, String nome, CategoriaGenero categoriaGenero, IdentidadeGenero identidadeGenero, boolean mostrarIdentidadeGenero, String bio, Localizacao localizacao, List<Foto> fotos, Integer alturaCm, Signo signo, Escolaridade escolaridade, EstadoProfissional estadoProfissional, Set<OrientacaoSexual> orientacoes, boolean mostrarOrientacao) {
        this.idPerfil = idPerfil;
        this.usuario = usuario;
        this.nome = nome;
        this.categoriaGenero = categoriaGenero;
        this.identidadeGenero = identidadeGenero;
        this.mostrarIdentidadeGenero = mostrarIdentidadeGenero;
        this.bio = bio;
        this.localizacao = localizacao;
        this.fotos = fotos;
        this.alturaCm = alturaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.orientacoes = orientacoes;
        this.mostrarOrientacao = mostrarOrientacao;
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
}