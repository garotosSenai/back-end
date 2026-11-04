package com.destiny.destiny.entity.usuario;

import com.destiny.destiny.entity.conexao.Hobby;
import com.destiny.destiny.entity.conexao.Localizacao;
import com.destiny.destiny.entity.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;
    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private Usuario usuario;
    private String nome;
    @Enumerated(EnumType.STRING)
    private CategoriaGenero categoriaGenero;
    @Enumerated(EnumType.STRING)
    private IdentidadeGenero identidadeGenero;
    private boolean mostrarIdentidadeGenero = false;
    private String bio;
    @ManyToOne
    @JoinColumn(name = "localizacao_idlocalizacao")
    private Localizacao localizacao;
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Foto> fotos = new ArrayList<>();
    private Integer alturaCm;
    @Enumerated(EnumType.STRING)
    private Signo signo;
    @Enumerated(EnumType.STRING)
    private Escolaridade escolaridade;
    @Enumerated(EnumType.STRING)
    private EstadoProfissional estadoProfissional;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "perfil_orientacoes", joinColumns = @JoinColumn(name = "perfil_id"))
    private Set<OrientacaoSexual> orientacoes = new HashSet<>();
    private boolean mostrarOrientacao = false;
    @ManyToMany
    @JoinTable(
         name = "perfil_hobby",
         joinColumns = @JoinColumn(name = "perfil_id"),
         inverseJoinColumns = @JoinColumn(name = "hobby_id")
    )
    private Set<Hobby> hobbies = new HashSet<>();
    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "perfil_tipos_relacionamento" ,joinColumns = @JoinColumn(name = "perfil_id"))
    private Set<TipoRelacionamento> tiposRelacionamentos = new HashSet<>();

    public Perfil(Usuario usuario, String nome, CategoriaGenero categoriaGenero, IdentidadeGenero identidadeGenero, boolean mostrarIdentidadeGenero, String bio, Localizacao localizacao, List<Foto> fotos, Integer alturaCm, Signo signo, Escolaridade escolaridade, EstadoProfissional estadoProfissional, Set<OrientacaoSexual> orientacoes, boolean mostrarOrientacao) {
        this.usuario = usuario;
        this.nome = nome;
        this.categoriaGenero = categoriaGenero;
        this.identidadeGenero = identidadeGenero;
        this.mostrarIdentidadeGenero = mostrarIdentidadeGenero;
        this.bio = bio;
        this.localizacao = localizacao;
        this.fotos = fotos;
        this.alturaCm = alturaCm;
        this.signo = signo;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
        this.orientacoes = orientacoes;
        this.mostrarOrientacao = mostrarOrientacao;
    }
}
