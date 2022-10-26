package com.turn2c.apivendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turn2c.apivendas.model.Vendedor;
import com.turn2c.apivendas.repository.VendedorRepository;

@RestController
@RequestMapping("/vendedores")
@CrossOrigin("*")
public class VendedorController {

	@Autowired
	private VendedorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Vendedor>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}