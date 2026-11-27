package com.destiny.entity;

import com.destiny.entity.enums.*;
import jakarta.persistence.*;

import java.util.*;

@Entity
public class Perfil {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;
    private Long idUsuario;
    private String nome;
    @Enumerated(value = EnumType.STRING)
    private Genero genero;
    private String identidadeGenero;
    private boolean mostrarIdentidadeGenero;
    private String bio;
    @Embedded
    private Localizacao localizacao;
    private String  fotos;
    private Integer alturaCm;
    private String signo;
    private String escolaridade;
    private String estadoProfissional;
    private String orientacaoSexual;
    private boolean mostrarOrientacao;
    private Long idHobbies;
    private String tipoRelacionamento;

    public Perfil (){}

    public Perfil(Long idPerfil, Long idUsuario, String nome, Genero genero, String identidadeGenero, String bio, Localizacao localizacao, String fotos, Integer alturaCm, String signo, String escolaridade, String estadoProfissional, String orientacaoSexual, Long idHobbies, String tipoRelacionamento) {
        this.idPerfil = idPerfil;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.genero = genero;
        this.identidadeGenero = identidadeGenero;
        this.mostrarIdentidadeGenero = false;
        this.bio = bio;
        this.localizacao = localizacao;
        this.fotos = fotos;
        this.alturaCm = alturaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.orientacaoSexual = orientacaoSexual;
        this.mostrarOrientacao = false;
        this.idHobbies = idHobbies;
        this.tipoRelacionamento = tipoRelacionamento;
    }

    public Perfil(Long idUsuario, String nome, Genero genero, String identidadeGenero,String bio, Localizacao localizacao, String  fotos, Integer alturaCm, String signo, String escolaridade, String estadoProfissional, String orientacaoSexual, Long idHobbies, String tipoRelacionamento) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.genero = genero;
        this.identidadeGenero = identidadeGenero;
        this.mostrarIdentidadeGenero = false;
        this.bio = bio;
        this.localizacao = localizacao;
        this.fotos = fotos;
        this.alturaCm = alturaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.orientacaoSexual = orientacaoSexual;
        this.mostrarOrientacao = false;
        this.idHobbies = idHobbies;
        this.tipoRelacionamento = tipoRelacionamento;
    }

    public Perfil(Perfil p) {
        this.idUsuario = p.idUsuario;
        this.nome = p.getNome();
        this.genero = p.getGenero();
        this.identidadeGenero = p.getIdentidadeGenero();
        this.mostrarIdentidadeGenero = false;
        this.bio = p.getBio();
        this.localizacao = p.getLocalizacao();
        this.fotos = p.getFotos();
        this.alturaCm = p.getAlturaCm();
        this.signo = p.getSigno();
        this.escolaridade = p.getEscolaridade();
        this.estadoProfissional = p.getEstadoProfissional();
        this.orientacaoSexual = p.getOrientacaoSexual();
        this.mostrarOrientacao = false;
        this.idHobbies = p.idHobbies;
        this.tipoRelacionamento = p.tipoRelacionamento;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getIdentidadeGenero() {
        return identidadeGenero;
    }

    public void setIdentidadeGenero(String identidadeGenero) {
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

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String  fotos) {
        this.fotos = fotos;
    }

    public Integer getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Integer alturaCm) {
        this.alturaCm = alturaCm;
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

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    public boolean isMostrarOrientacao() {
        return mostrarOrientacao;
    }

    public void setMostrarOrientacao(boolean mostrarOrientacao) {
        this.mostrarOrientacao = mostrarOrientacao;
    }

    public Long getIdHobbies() {
        return idHobbies;
    }

    public void setHobbies(Long idHobbies) {
        this.idHobbies = idHobbies;
    }

    public String getTipoRelacionamento() {
        return tipoRelacionamento;
    }

    public void setTipoRelacionamento(String tipoRelacionamento) {
        this.tipoRelacionamento = tipoRelacionamento;
    }

    public void setIdHobbies(Long idHobbies) {
        this.idHobbies = idHobbies;
    }
}
