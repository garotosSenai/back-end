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
<<<<<<< HEAD


=======
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
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

<<<<<<< HEAD
    public Interacao(){
    }

=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
    public Interacao(LocalDateTime criadoEm, Usuario origem, Usuario destino, TipoInteracao tipo) {
        this.criadoEm = criadoEm;
        this.origem = origem;
        this.destino = destino;
        this.tipo = tipo;
    }
<<<<<<< HEAD

    public Interacao(Long idInteracao, Usuario origem, Usuario destino, TipoInteracao tipo, LocalDateTime criadoEm) {
        this.idInteracao = idInteracao;
        this.origem = origem;
        this.destino = destino;
        this.tipo = tipo;
        this.criadoEm = criadoEm;
    }
=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
}
