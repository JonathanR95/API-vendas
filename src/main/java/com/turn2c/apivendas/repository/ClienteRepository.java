package com.turn2c.apivendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.turn2c.apivendas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	public List<Cliente> findAllByNomeContainingIgnoreCase(@Param ("nome")String titulo);
}
