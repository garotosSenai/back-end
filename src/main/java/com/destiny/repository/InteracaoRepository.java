package com.destiny.repository;

import com.destiny.entity.Interacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteracaoRepository extends JpaRepository<Interacao, Long> {
}
