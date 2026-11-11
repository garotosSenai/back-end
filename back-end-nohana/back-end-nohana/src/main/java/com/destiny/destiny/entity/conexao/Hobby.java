package com.destiny.destiny.entity.conexao;

import com.destiny.destiny.entity.enums.CategoriaHobby;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHobby;
    private String nome;
    @Enumerated(EnumType.STRING)
    private CategoriaHobby categoria;
    private String descricao;

    public Hobby() {
    }

    public Hobby(String nome, CategoriaHobby categoria, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Hobby(Long idHobby, String nome, CategoriaHobby categoria, String descricao) {
        this.idHobby = idHobby;
        this.nome = nome;
        this.categoria = categoria;
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