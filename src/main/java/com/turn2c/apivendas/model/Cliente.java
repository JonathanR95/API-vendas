package com.turn2c.apivendas.model;


import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name ="tb_clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotNull
	private String nome; 
	
	@ManyToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonProperty("vendedores")
	private Optional<Vendedor> vendedores;

	/*Metodo Construtor*/
	
	public Cliente() {}

	public Cliente(Optional<Vendedor> vendedores) {
		super();
		this.vendedores = vendedores;
	}
	
	/* getters e setters*/
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Optional<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(Optional<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	
	
}
