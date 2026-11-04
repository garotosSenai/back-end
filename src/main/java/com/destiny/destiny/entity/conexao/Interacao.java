package com.destiny.destiny.entity.conexao;

import com.destiny.destiny.entity.enums.TipoInteracao;
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
public class Interacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInteracao;
    @ManyToOne
    @JoinColumn(name = "origem_id_usuario")
    private Usuario origem;
    @ManyToOne
    @JoinColumn(name = "destino_id_usuario")
    private Usuario destino;
    @Enumerated(EnumType.STRING)
    private TipoInteracao tipo;
    private LocalDateTime criadoEm;

    public Interacao(LocalDateTime criadoEm, Usuario origem, Usuario destino, TipoInteracao tipo) {
        this.criadoEm = criadoEm;
        this.origem = origem;
        this.destino = destino;
        this.tipo = tipo;
    }
}
