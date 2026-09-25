package appnamoro.appnamoro;

import appnamoro.appnamoro.enuns.MotivoDenuncia;
import appnamoro.appnamoro.enuns.Status;

import java.time.LocalDateTime;

public class Denuncia {

    private Long idDenuncia;
    private Long idDenunciante;
    private Long idDenunciado;
    private MotivoDenuncia motivoDenuncia;
    private String descricao;
    private LocalDateTime dataDenuncia;
    private Status status;

    public Denuncia(Long idDenuncia, Long idDenunciante, Long idDenunciado, MotivoDenuncia motivoDenuncia, String descricao, LocalDateTime dataDenuncia, Status status) {
        this.idDenuncia = idDenuncia;
        this.idDenunciante = idDenunciante;
        this.idDenunciado = idDenunciado;
        this.motivoDenuncia = motivoDenuncia;
        this.descricao = descricao;
        this.dataDenuncia = dataDenuncia;
        this.status = status;
    }

    public Long getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(Long idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public Long getIdDenunciante() {
        return idDenunciante;
    }

    public void setIdDenunciante(Long idDenunciante) {
        this.idDenunciante = idDenunciante;
    }

    public Long getIdDenunciado() {
        return idDenunciado;
    }

    public void setIdDenunciado(Long idDenunciado) {
        this.idDenunciado = idDenunciado;
    }

    public MotivoDenuncia getMotivoDenuncia() {
        return motivoDenuncia;
    }

    public void setMotivoDenuncia(MotivoDenuncia motivoDenuncia) {
        this.motivoDenuncia = motivoDenuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(LocalDateTime dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
