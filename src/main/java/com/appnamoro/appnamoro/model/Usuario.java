package com.appnamoro.appnamoro.model;

import java.time.LocalDate;

public class Usuario {
    private Long id_usuario;
    private String nomeCompleto;
    private LocalDate dtNascimento;
    private Integer idade;
    private String email;
    private String genero;
    private String biografia;
    private String cidade;
    private String foto_perfil;

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", genero='" + genero + '\'' +
                ", biografia='" + biografia + '\'' +
                ", cidade='" + cidade + '\'' +
                ", foto_perfil='" + foto_perfil + '\'' +
                '}';
    }

    public Usuario() {
    }

    public Usuario(Long id_usuario, String nomeCompleto, LocalDate dtNascimento, String email, Integer idade, String genero, String biografia, String cidade, String foto_perfil) {
        this.id_usuario = id_usuario;
        this.nomeCompleto = nomeCompleto;
        this.dtNascimento = dtNascimento;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
        this.biografia = biografia;
        this.cidade = cidade;
        this.foto_perfil = foto_perfil;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getCidade() {
        return cidade;
    }

    public String getFoto_perfil() {
        return foto_perfil;

    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }
}