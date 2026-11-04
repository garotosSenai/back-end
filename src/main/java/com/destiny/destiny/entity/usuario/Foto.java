package com.destiny.destiny.entity.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoto;
    private String url;
    private int ordem;
    private LocalDateTime criadoEm;

    public Foto(String url, int ordem, LocalDateTime criadoEm) {
        this.url = url;
        this.ordem = ordem;
        this.criadoEm = criadoEm;
    }
}
