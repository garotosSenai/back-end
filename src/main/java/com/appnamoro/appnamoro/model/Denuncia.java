package com.appnamoro.appnamoro.model;

import java.time.LocalDateTime;

public class Denuncia {

    private Long idDenuncia;
    private Long idDenunciante;
    private Long idDenunciado;
    private String motivo;
    private String descricao;
    private LocalDateTime dataDenuncia;
    private String status;


    public Denuncia() {
    }


    public Denuncia(Long idDenuncia, Long idDenunciante, Long idDenunciado, String motivo, String descricao, LocalDateTime dataDenuncia, String status) {
        this.idDenuncia = idDenuncia;
        this.idDenunciante = idDenunciante;
        this.idDenunciado = idDenunciado;
        this.motivo = motivo;
        this.descricao = descricao;
        this.dataDenuncia = dataDenuncia;
        this.status = status;
    }

    @Override
    public String toString() {
        return "com.appnamoro.appnamoro.model.Denuncia{" +
                "idDenuncia=" + idDenuncia +
                ", idDenunciante=" + idDenunciante +
                ", idDenunciado=" + idDenunciado +
                ", motivo='" + motivo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataDenuncia=" + dataDenuncia +
                ", status='" + status + '\'' +
                '}';
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Preferencia {

        private Long id_usuario;
        private String genero;
        private int idadeMinima;
        private int idadeMaxima;
        private int distanciaMaxima;
        private double alturaMinima;
        private double alturaMaxima;
        private String signo;
        private String escolaridade;
        private String estadoProfissional;

        // Construtor vazio (necessário para o Spring deserializar o JSON)
        public Preferencia() {
        }

        // Construtor completo
        public Preferencia(Long id_usuario, String genero, int idadeMinima, int idadeMaxima,
                           int distanciaMaxima, double alturaMinima, double alturaMaxima,
                           String signo, String escolaridade, String estadoProfissional) {
            this.id_usuario = id_usuario;
            this.genero = genero;
            this.idadeMinima = idadeMinima;
            this.idadeMaxima = idadeMaxima;
            this.distanciaMaxima = distanciaMaxima;
            this.alturaMinima = alturaMinima;
            this.alturaMaxima = alturaMaxima;
            this.signo = signo;
            this.escolaridade = escolaridade;
            this.estadoProfissional = estadoProfissional;
        }

        // Getters e Setters
        public Long getId_usuario() {
            return id_usuario;
        }

        public void setId_usuario(Long id_usuario) {
            this.id_usuario = id_usuario;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public int getIdadeMinima() {
            return idadeMinima;
        }

        public void setIdadeMinima(int idadeMinima) {
            this.idadeMinima = idadeMinima;
        }

        public int getIdadeMaxima() {
            return idadeMaxima;
        }

        public void setIdadeMaxima(int idadeMaxima) {
            this.idadeMaxima = idadeMaxima;
        }

        public int getDistanciaMaxima() {
            return distanciaMaxima;
        }

        public void setDistanciaMaxima(int distanciaMaxima) {
            this.distanciaMaxima = distanciaMaxima;
        }

        public double getAlturaMinima() {
            return alturaMinima;
        }

        public void setAlturaMinima(double alturaMinima) {
            this.alturaMinima = alturaMinima;
        }

        public double getAlturaMaxima() {
            return alturaMaxima;
        }

        public void setAlturaMaxima(double alturaMaxima) {
            this.alturaMaxima = alturaMaxima;
        }

        public String getSigno() {
            return signo;
        }

        public void setSigno(String signo) {
            this.signo = signo;
        }

        public String getEscolaridade() {
            return escolaridade;
        }

        public void setEscolaridade(String escolaridade) {
            this.escolaridade = escolaridade;
        }

        public String getEstadoProfissional() {
            return estadoProfissional;
        }

        public void setEstadoProfissional(String estadoProfissional) {
            this.estadoProfissional = estadoProfissional;
        }

        @Override
        public String toString() {
            return "com.appnamoro.appnamoro.model.Denuncia.Preferencia{" +
                    "id_usuario=" + id_usuario +
                    ", genero='" + genero + '\'' +
                    ", idadeMinima=" + idadeMinima +
                    ", idadeMaxima=" + idadeMaxima +
                    ", distanciaMaxima=" + distanciaMaxima +
                    ", alturaMinima=" + alturaMinima +
                    ", alturaMaxima=" + alturaMaxima +
                    ", signo='" + signo + '\'' +
                    ", escolaridade='" + escolaridade + '\'' +
                    ", estadoProfissional='" + estadoProfissional + '\'' +
                    '}';
        }
    }
}

