package appnamoro.appnamoro;

public class Match {

    private Long idCurtida;
    private Long idUsuario;
    private Long generoInteresse;
    private Long idadeMaxima;
    private Long idadeMinima;
    private Long distancaMaxima;
    private Long alturaMinima;
    private Long alturaMaxima;
    private String signo;
    private String hobby;
    private String escolaridade;
    private String estadoProfissional;

    public Match(Long idCurtida, Long idUsuario, Long generoInteresse, Long idadeMaxima, Long idadeMinima, Long distancaMaxima, Long alturaMinima, Long alturaMaxima, String signo, String hobby, String escolaridade, String estadoProfissional) {
        this.idCurtida = idCurtida;
        this.idUsuario = idUsuario;
        this.generoInteresse = generoInteresse;
        this.idadeMaxima = idadeMaxima;
        this.idadeMinima = idadeMinima;
        this.distancaMaxima = distancaMaxima;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.signo = signo;
        this.hobby = hobby;
        this.escolaridade = escolaridade;
        this.estadoProfissional = estadoProfissional;
    }

    public Long getIdCurtida() {
        return idCurtida;
    }

    public void setIdCurtida(Long idCurtida) {
        this.idCurtida = idCurtida;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getGeneroInteresse() {
        return generoInteresse;
    }

    public void setGeneroInteresse(Long generoInteresse) {
        this.generoInteresse = generoInteresse;
    }

    public Long getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(Long idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public Long getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(Long idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Long getDistancaMaxima() {
        return distancaMaxima;
    }

    public void setDistancaMaxima(Long distancaMaxima) {
        this.distancaMaxima = distancaMaxima;
    }

    public Long getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(Long alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public Long getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Long alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
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
