
public class Preferencia {

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
        return "Preferencia{" +
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