package com.destiny.model;

import com.destiny.model.enums.Genero;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Usuario {

    private UUID idUsuario;
    private String email;
    private String senha;
    private LocalDate dtNascimento;
    private LocalDateTime dtCadastro;
    private boolean ativo;

    public Usuario (){}

    public Usuario(String email, String senha, LocalDate dtNascimento, LocalDateTime dtCadastro, boolean ativo) {
        this.email = email;
        this.senha = senha;
        this.dtNascimento = dtNascimento;
        this.dtCadastro = LocalDateTime.now();
        this.ativo = ativo;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
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

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public LocalDateTime getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(LocalDateTime dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
