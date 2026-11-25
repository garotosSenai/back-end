package com.destiny.destiny.entity.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private LocalDateTime criadoEm;
    private boolean ativo;

    public Usuario(){}

    public Usuario(String email, String senha, LocalDate dataNascimento, LocalDateTime criadoEm, boolean ativo) {
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.criadoEm = criadoEm;
        this.ativo = ativo;
    }

    public Usuario(Long idUsuario, String email, String senha, LocalDate dataNascimento, LocalDateTime criadoEm, boolean ativo) {
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.criadoEm = criadoEm;
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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
