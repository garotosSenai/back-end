package com.destiny.destiny.entity.conexao;

import com.destiny.destiny.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity


public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatch;
    @ManyToOne
    @JoinColumn(name = "usuario_1_id_usuario")
    private Usuario usuario1;
    @ManyToOne
    @JoinColumn(name = "usuario_2_id_usuario")
    private Usuario usuario2;
    private LocalDateTime criadoEm;
    private boolean ativo;

    public Match(Usuario usuario1, Usuario usuario2, boolean ativo, LocalDateTime criadoEm) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.ativo = ativo;
        this.criadoEm = criadoEm;
    }

    public Match(Long idMatch, Usuario usuario1, Usuario usuario2, LocalDateTime criadoEm, boolean ativo) {
        this.idMatch = idMatch;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.criadoEm = criadoEm;
        this.ativo = ativo;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
