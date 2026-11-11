package com.destiny.destiny.repository;

import com.destiny.destiny.entity.usuario.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository<Foto, Long> {
}
