package com.destiny.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Hobby {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHobby;
    private String nome;
    @Column(nullable = false)
    private String categoria;
    private String descricao;

    public Hobby(){}

    public Hobby(String nome, String categoria, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hobby hobby)) return false;
        return idHobby != null && idHobby.equals(hobby.idHobby);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idHobby);
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
