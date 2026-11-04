package com.destiny.destiny.entity.conexao;

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
}
