package com.novaviagens.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novaviagens.backend.domain.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {
	

}
