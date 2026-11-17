package com.destiny.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private LocalDateTime criadoEm;
    private boolean ativo;

    public Usuario(Long idUsuario, String email, String senha, LocalDate dataNascimento) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.criadoEm = LocalDateTime.now();
        this.ativo = true;
    }

    public Usuario (){}

    public Usuario(String email, String senha, LocalDate dataNascimento) {
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.criadoEm = LocalDateTime.now();
        this.ativo = true;
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
