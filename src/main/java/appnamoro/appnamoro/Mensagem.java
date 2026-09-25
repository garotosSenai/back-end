package appnamoro.appnamoro;

import java.time.LocalDateTime;

public class Mensagem {

    private Long idMensagem;
    private Long idMatch;
    private Long idRemente;
    private String conteudo;
    private LocalDateTime dataEnvio;
    private boolean visualizacao = false;

    public Mensagem(Long idMensagem, Long idMatch, Long idRemente, String conteudo, LocalDateTime dataEnvio, boolean visualizacao) {
        this.idMensagem = idMensagem;
        this.idMatch = idMatch;
        this.idRemente = idRemente;
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
        this.visualizacao = visualizacao;
    }

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Long getIdRemente() {
        return idRemente;
    }

    public void setIdRemente(Long idRemente) {
        this.idRemente = idRemente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public boolean isVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(boolean visualizacao) {
        this.visualizacao = visualizacao;
    }
}
