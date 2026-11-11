package com.destiny.destiny.entity.usuario;

import com.destiny.destiny.entity.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity

public class PreferenciaBusca {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPreferencia;
    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private Usuario usuario;
    @Enumerated(EnumType.STRING)
    private Set<CategoriaGenero> generosInteresse = new HashSet<>();
    private Integer idadeMinima = 18;
    private Integer idadeMaxima = 99;
    private Double distanciaMaximaKm = 50.0;
    private Integer alturaMinimaCm;
    private Integer alturaMaximaCm;
    @Enumerated(EnumType.STRING)
    private Set<Signo> signos = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<Escolaridade> escolaridades = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<EstadoProfissional> estadosProfissionais = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private Set<TipoRelacionamento> tiposRelacionamentos = new HashSet<>();

    public PreferenciaBusca(){}

    public PreferenciaBusca(Usuario usuario, Set<CategoriaGenero> generosInteresse, Integer idadeMinima, Integer idadeMaxima, Double distanciaMaximaKm, Integer alturaMinimaCm, Integer alturaMaximaCm, Set<Signo> signos, Set<Escolaridade> escolaridades, Set<EstadoProfissional> estadosProfissionais, Set<TipoRelacionamento> tiposRelacionamentos) {
        this.usuario = usuario;
        this.generosInteresse = generosInteresse;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
        this.distanciaMaximaKm = distanciaMaximaKm;
        this.alturaMinimaCm = alturaMinimaCm;
        this.alturaMaximaCm = alturaMaximaCm;
        this.signos = signos;
        this.escolaridades = escolaridades;
        this.estadosProfissionais = estadosProfissionais;
        this.tiposRelacionamentos = tiposRelacionamentos;
    }

    public PreferenciaBusca(Long idPreferencia, Usuario usuario, Integer idadeMinima, Set<CategoriaGenero> generosInteresse, Double distanciaMaximaKm, Integer idadeMaxima, Integer alturaMinimaCm, Integer alturaMaximaCm, Set<Signo> signos, Set<Escolaridade> escolaridades, Set<EstadoProfissional> estadosProfissionais, Set<TipoRelacionamento> tiposRelacionamentos) {
        this.idPreferencia = idPreferencia;
        this.usuario = usuario;
        this.idadeMinima = idadeMinima;
        this.generosInteresse = generosInteresse;
        this.distanciaMaximaKm = distanciaMaximaKm;
        this.idadeMaxima = idadeMaxima;
        this.alturaMinimaCm = alturaMinimaCm;
        this.alturaMaximaCm = alturaMaximaCm;
        this.signos = signos;
        this.escolaridades = escolaridades;
        this.estadosProfissionais = estadosProfissionais;
        this.tiposRelacionamentos = tiposRelacionamentos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(Long idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public Set<CategoriaGenero> getGenerosInteresse() {
        return generosInteresse;
    }

    public void setGenerosInteresse(Set<CategoriaGenero> generosInteresse) {
        this.generosInteresse = generosInteresse;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(Integer idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public Double getDistanciaMaximaKm() {
        return distanciaMaximaKm;
    }

    public void setDistanciaMaximaKm(Double distanciaMaximaKm) {
        this.distanciaMaximaKm = distanciaMaximaKm;
    }

    public Integer getAlturaMinimaCm() {
        return alturaMinimaCm;
    }

    public void setAlturaMinimaCm(Integer alturaMinimaCm) {
        this.alturaMinimaCm = alturaMinimaCm;
    }

    public Integer getAlturaMaximaCm() {
        return alturaMaximaCm;
    }

    public void setAlturaMaximaCm(Integer alturaMaximaCm) {
        this.alturaMaximaCm = alturaMaximaCm;
    }

    public Set<Signo> getSignos() {
        return signos;
    }

    public void setSignos(Set<Signo> signos) {
        this.signos = signos;
    }

    public Set<Escolaridade> getEscolaridades() {
        return escolaridades;
    }

    public void setEscolaridades(Set<Escolaridade> escolaridades) {
        this.escolaridades = escolaridades;
    }

    public Set<EstadoProfissional> getEstadosProfissionais() {
        return estadosProfissionais;
    }

    public void setEstadosProfissionais(Set<EstadoProfissional> estadosProfissionais) {
        this.estadosProfissionais = estadosProfissionais;
    }

    public Set<TipoRelacionamento> getTiposRelacionamentos() {
        return tiposRelacionamentos;
    }

    public void setTiposRelacionamentos(Set<TipoRelacionamento> tiposRelacionamentos) {
        this.tiposRelacionamentos = tiposRelacionamentos;
    }
}
