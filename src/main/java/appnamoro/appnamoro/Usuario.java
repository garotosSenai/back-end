package appnamoro.appnamoro;

import appnamoro.appnamoro.enuns.Genero;

import java.time.LocalDate;

public class Usuario {

    private Long idUsuario;
    private String nomeCompleto;
    private LocalDate dtNascimento;
    private Genero genero;
    private String email;
    private String cidade;
    private String biografia;
    private String fotoPerfil;

//construtor vazio para o spring boot transformar as informações em JSON em objetos java
    public Usuario (){}

    public Usuario (Long idUsuario, String nomeCompleto, LocalDate dtNascimento, Genero genero, String email, String cidade, String biografia, String fotoPerfil){
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
        this.email = email;
        this.cidade = cidade;
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", genero=" + genero +
                ", email='" + email + '\'' +
                ", cidade='" + cidade + '\'' +
                ", biografia='" + biografia + '\'' +
                ", fotoPerfil='" + fotoPerfil + '\'' +
                '}';
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
