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
<<<<<<< HEAD

=======
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
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

<<<<<<< HEAD
    public Mensagem(){}

=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
    public Mensagem(Match match, Usuario remetente, String conteudo, LocalDateTime enviadaEm, LocalDateTime visualizadaEm) {
        this.match = match;
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.enviadaEm = enviadaEm;
        this.visualizadaEm = visualizadaEm;
    }
<<<<<<< HEAD

    public Mensagem(Long idMensagem, Match match, Usuario remetente, String conteudo, LocalDateTime enviadaEm, LocalDateTime visualizadaEm) {
        this.idMensagem = idMensagem;
        this.match = match;
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.enviadaEm = enviadaEm;
        this.visualizadaEm = visualizadaEm;
    }


    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getEnviadaEm() {
        return enviadaEm;
    }

    public void setEnviadaEm(LocalDateTime enviadaEm) {
        this.enviadaEm = enviadaEm;
    }

    public LocalDateTime getVisualizadaEm() {
        return visualizadaEm;
    }

    public void setVisualizadaEm(LocalDateTime visualizadaEm) {
        this.visualizadaEm = visualizadaEm;
    }
=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
}
