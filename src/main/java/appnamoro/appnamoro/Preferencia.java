package appnamoro.appnamoro;

public class Preferencia {

    private Long idPreferencia;
    private Long idUsuario;
    private String genero;
    private int idadeMinima;
    private int idadeMaxima;
    private int distanciaMaxima;
    private double alturaMinima;
    private double alturaMaxima;
    private String signo;
    private String escolaridade;
    private String estadoProfissional;

    public Preferencia(){

    }

    public Preferencia(Long idPreferencia, Long idUsuario, String genero, int idadeMinima, int idadeMaxima, int distanciaMaxima, double alturaMinima, double alturaMaxima, String signo, String escolaridade, String estadoProfissional) {
        this.idPreferencia = idPreferencia;
        this.idUsuario = idUsuario;
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

    @Override
    public String toString() {
        return "Preferencia{" +
                "idPreferencia=" + idPreferencia +
                ", idUsuario=" + idUsuario +
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

    public Long getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(Long idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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
}
