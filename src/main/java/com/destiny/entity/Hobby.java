package com.destiny.entity;

import com.destiny.entity.enums.CategoriaHobby;

import java.util.Objects;
import java.util.UUID;

public class Hobby {

    private UUID idHobby;
    private String nome;
    private CategoriaHobby categoria;
    private String descricao;

    public Hobby(){}

    public Hobby(String nome, CategoriaHobby categoria, String descricao) {
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

    public UUID getIdHobby() {
        return idHobby;
    }

    public void setIdHobby(UUID idHobby) {
        this.idHobby = idHobby;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaHobby getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaHobby categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
