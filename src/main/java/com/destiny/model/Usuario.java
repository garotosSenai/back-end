package com.destiny.model;

import com.destiny.model.enums.Genero;

import java.time.LocalDate;

public class Usuario {

    private Long idUsuario;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dtNascimento;
    private Genero genero;
    private String cidade;
    private String bio;
    private String fotoPerfil;


}
