package com.destiny.destiny.entity.seguranca;

import com.destiny.destiny.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
<<<<<<< HEAD
=======
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d

public class Bloqueio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloqueio;
    @ManyToOne
    @JoinColumn(name = "bloqueador_id_usuario")
    private Usuario bloqueador;
    @ManyToOne
    @JoinColumn(name = "bloqueado_id_usuario")
    private Usuario bloqueado;
    private LocalDateTime criadoEm;

<<<<<<< HEAD
    public Bloqueio(){}

=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
    public Bloqueio(Usuario bloqueador, Usuario bloqueado, LocalDateTime criadoEm) {
        this.bloqueador = bloqueador;
        this.bloqueado = bloqueado;
        this.criadoEm = criadoEm;
    }
<<<<<<< HEAD

    public Bloqueio(Long idBloqueio, Usuario bloqueador, Usuario bloqueado, LocalDateTime criadoEm) {
        this.idBloqueio = idBloqueio;
        this.bloqueador = bloqueador;
        this.bloqueado = bloqueado;
        this.criadoEm = criadoEm;
    }

    public Long getIdBloqueio() {
        return idBloqueio;
    }

    public void setIdBloqueio(Long idBloqueio) {
        this.idBloqueio = idBloqueio;
    }

    public Usuario getBloqueador() {
        return bloqueador;
    }

    public void setBloqueador(Usuario bloqueador) {
        this.bloqueador = bloqueador;
    }

    public Usuario getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Usuario bloqueado) {
        this.bloqueado = bloqueado;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
}


