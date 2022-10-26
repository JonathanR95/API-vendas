package com.turn2c.apivendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turn2c.apivendas.model.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

	
}
