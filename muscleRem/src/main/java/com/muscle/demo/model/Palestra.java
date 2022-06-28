package com.muscle.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Palestra {
	private @Id @GeneratedValue Long id_palestra;
	private String nome;
	private String via;
	private int civico;
	private String citta;
	
	public Palestra() {}
	
	public Palestra(String nome, String via, int civico, String citta) {
		super();
		this.nome = nome;
		this.via = via;
		this.civico = civico;
		this.citta = citta;
	}

	public Long getId_palestra() {
		return id_palestra;
	}

	public void setId_palestra(Long id_palestra) {
		this.id_palestra = id_palestra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
}
