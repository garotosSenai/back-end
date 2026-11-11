package com.destiny.destiny.entity.conexao;

import jakarta.persistence.*;

@Entity

public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHobby;
    private String nome;
    @Enumerated(EnumType.STRING)
    private String categoriahobby;
    private String descricao;

    public Hobby() {
    }

    public Hobby(Long idHobby, String nome, String categoriahobby, String descricao) {
        this.idHobby = idHobby;
        this.nome = nome;
        this.categoriahobby = categoriahobby;
        this.descricao = descricao;
    }

    public Hobby(String nome, String categoriahobby, String descricao) {
        this.nome = nome;
        this.categoriahobby = categoriahobby;
        this.descricao = descricao;
    }

    public Long getIdHobby() {
        return idHobby;
    }

    public void setIdHobby(Long idHobby) {
        this.idHobby = idHobby;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoriahobby() {
        return categoriahobby;
    }

    public void setCategoriahobby(String categoriahobby) {
        this.categoriahobby = categoriahobby;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}