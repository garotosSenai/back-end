package com.destiny.destiny.entity.conexao;

import com.destiny.destiny.entity.enums.CategoriaHobby;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHobby;
    private String nome;
    @Enumerated(EnumType.STRING)
    private CategoriaHobby categoria;
    private String descricao;


}
