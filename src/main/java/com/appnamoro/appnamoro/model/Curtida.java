package com.appnamoro.appnamoro.model;

import java.time.LocalDate;

public class Curtida {
    private long id_Usuario;
    private Long Id_Curtida;
    private long id_UsuarioCurtido;
    private LocalDate dtCurtida;


    public Curtida(){

    }

    public Curtida(long id_UsuarioCurtido, long id_Usuario, Long id_Curtida, LocalDate dtCurtida) {
        this.id_UsuarioCurtido = id_UsuarioCurtido;
        this.id_Usuario = id_Usuario;
        Id_Curtida = id_Curtida;
        this.dtCurtida = dtCurtida;
    }

    @Override
    public String toString() {
        return "Curtida{" +
                "id_Usuario=" + id_Usuario +
                ", Id_Curtida=" + Id_Curtida +
                ", id_UsuarioCurtido=" + id_UsuarioCurtido +
                ", dtCurtida=" + dtCurtida +
                '}';
    }




    public long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Long getId_Curtida() {
        return Id_Curtida;
    }

    public void setId_Curtida(Long id_Curtida) {
        Id_Curtida = id_Curtida;
    }

    public long getId_UsuarioCurtido() {
        return id_UsuarioCurtido;
    }

    public void setId_UsuarioCurtido(long id_UsuarioCurtido) {
        this.id_UsuarioCurtido = id_UsuarioCurtido;
    }

    public LocalDate getDtCurtida() {
        return dtCurtida;
    }

    public void setDtCurtida(LocalDate dtCurtida) {
        this.dtCurtida = dtCurtida;
    }
}
