package com.destiny.model;

import com.destiny.model.enums.CategoriaInteresse;

import java.util.UUID;

public class Interesse {

    private UUID idInteresse;
    private String nome;
    private CategoriaInteresse categoria;
    private String descricao;

    public Interesse(){}

    public Interesse(String nome, CategoriaInteresse categoria, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public UUID getIdInteresse() {
        return idInteresse;
    }

    public void setIdInteresse(UUID idInteresse) {
        this.idInteresse = idInteresse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaInteresse getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaInteresse categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
