package com.muscle.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Muscolo {
	private @Id @GeneratedValue Long id_muscolo;
	private String nome;
	
	Muscolo() {}

	public Muscolo(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId_muscolo() {
		return id_muscolo;
	}

	public void setId_muscolo(Long id_muscolo) {
		this.id_muscolo = id_muscolo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
