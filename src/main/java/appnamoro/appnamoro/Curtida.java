package appnamoro.appnamoro;

import java.time.LocalDate;

public class Curtida {

    private Long idUsuario;
    private Long idCurtida;
    private Long idUsuarioCurtido;
    private LocalDate dtCurtida;

    public Curtida (){

    }

    public Curtida(Long idUsuario, Long idCurtida, Long idUsuarioCurtido, LocalDate dtCurtida) {
        this.idUsuario = idUsuario;
        this.idCurtida = idCurtida;
        this.idUsuarioCurtido = idUsuarioCurtido;
        this.dtCurtida = dtCurtida;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdCurtida() {
        return idCurtida;
    }

    public void setIdCurtida(Long idCurtida) {
        this.idCurtida = idCurtida;
    }

    public Long getIdUsuarioCurtido() {
        return idUsuarioCurtido;
    }

    public void setIdUsuarioCurtido(Long idUsuarioCurtido) {
        this.idUsuarioCurtido = idUsuarioCurtido;
    }

    public LocalDate getDtCurtida() {
        return dtCurtida;
    }

    public void setDtCurtida(LocalDate dtCurtida) {
        this.dtCurtida = dtCurtida;
    }
}
