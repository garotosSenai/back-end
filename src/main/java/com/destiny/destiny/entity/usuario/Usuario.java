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
    @OneToOne
    @JoinColumn(name =  "usuario_id" , nullable = false, unique = true)
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
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.criadoEm = criadoEm;
        this.ativo = ativo;
    }


}
