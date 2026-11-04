package com.destiny.destiny.entity.chat;

import com.destiny.destiny.entity.conexao.Match;
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
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensagem;
    @ManyToOne
    @JoinColumn(name = "match_id_match")
    private Match match;
    @ManyToOne
    @JoinColumn(name = "remetente_id_usuario")
    private Usuario remetente;
    private String conteudo;
    private LocalDateTime enviadaEm;
    private LocalDateTime visualizadaEm;

    public Mensagem(Match match, Usuario remetente, String conteudo, LocalDateTime enviadaEm, LocalDateTime visualizadaEm) {
        this.match = match;
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.enviadaEm = enviadaEm;
        this.visualizadaEm = visualizadaEm;
    }
}
