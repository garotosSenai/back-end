package com.destiny.repository;

import com.destiny.entity.PreferenciaBusca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenciaBuscaRepository extends JpaRepository<PreferenciaBusca, Long> {
}
