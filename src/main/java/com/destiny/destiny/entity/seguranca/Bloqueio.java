package com.destiny.destiny.entity.seguranca;

import com.destiny.destiny.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

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

    public Bloqueio(Usuario bloqueador, Usuario bloqueado, LocalDateTime criadoEm) {
        this.bloqueador = bloqueador;
        this.bloqueado = bloqueado;
        this.criadoEm = criadoEm;
    }
}


