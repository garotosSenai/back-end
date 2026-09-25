package com.appnamoro.appnamoro.model;

import java.time.LocalDateTime;

public class Match {
    private Long idMatch;
    private Long idUsuario1;
    private Long idUsuario2;
    private LocalDateTime dataMatch;

    public Match(Long idMatch, Long idUsuario1, Long idUsuario2, LocalDateTime dataMatch) {
        this.idMatch = idMatch;
        this.idUsuario1 = idUsuario1;
        this.idUsuario2 = idUsuario2;
        this.dataMatch = dataMatch;
    }

    public  Match(){

    }


    @Override
    public String toString() {
        return "com.appnamoro.appnamoro.model.Match{" +
                "idMatch=" + idMatch +
                ", idUsuario1=" + idUsuario1 +
                ", idUsuario2=" + idUsuario2 +
                ", dataMatch=" + dataMatch +
                '}';
    }


    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Long getIdUsuario1() {
        return idUsuario1;
    }

    public void setIdUsuario1(Long idUsuario1) {
        this.idUsuario1 = idUsuario1;
    }

    public Long getIdUsuario2() {
        return idUsuario2;
    }

    public void setIdUsuario2(Long idUsuario2) {
        this.idUsuario2 = idUsuario2;
    }

    public LocalDateTime getDataMatch() {
        return dataMatch;
    }

    public void setDataMatch(LocalDateTime dataMatch) {
        this.dataMatch = dataMatch;
    }
}
