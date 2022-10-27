package com.turn2c.apivendas.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_vendedores")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name = "tb_Vendedor_Cliente",
			joinColumns = {@JoinColumn(name = "vendedor_id")},
			inverseJoinColumns = {@JoinColumn(name = "cliente_id")})
	private List<Cliente> cliente;
	
	
	/*Metodo Construtor*/
	
	public Vendedor() {}
	
	public Vendedor(List<Cliente> cliente) {
		super();
		this.cliente = cliente;
	}

	/* Getters and Setters*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	
	
	
}
