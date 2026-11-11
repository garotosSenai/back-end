package com.destiny.destiny.entity.seguranca;

import com.destiny.destiny.entity.enums.MotivoDenuncia;
import com.destiny.destiny.entity.enums.StatusDenuncia;
import com.destiny.destiny.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
<<<<<<< HEAD
=======
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDenuncia;
    @ManyToOne
    @JoinColumn(name = "denunciante_id_usuario")
    private Usuario denunciante;
    @ManyToOne
    @JoinColumn(name = "denunciado_id_usuario")
    private Usuario denunciado;
    @Enumerated(EnumType.STRING)
    private MotivoDenuncia motivo;
    private String descricao;
    private LocalDateTime criadoEm;
    @Enumerated(EnumType.STRING)
    private StatusDenuncia status;

<<<<<<< HEAD
    public Denuncia(){}

=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
    public Denuncia(Usuario denunciante, Usuario denunciado, MotivoDenuncia motivo, String descricao, LocalDateTime criadoEm, StatusDenuncia status) {
        this.denunciante = denunciante;
        this.denunciado = denunciado;
        this.motivo = motivo;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
        this.status = status;
    }
<<<<<<< HEAD

    public Denuncia(Long idDenuncia, Usuario denunciante, Usuario denunciado, MotivoDenuncia motivo, String descricao, LocalDateTime criadoEm, StatusDenuncia status) {
        this.idDenuncia = idDenuncia;
        this.denunciante = denunciante;
        this.denunciado = denunciado;
        this.motivo = motivo;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
        this.status = status;
    }
=======
>>>>>>> 16141627b331fa0b60506f628fb9c8830027aa5d
}
