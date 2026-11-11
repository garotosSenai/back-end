package com.destiny.destiny.repository;

import com.destiny.destiny.entity.chat.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
