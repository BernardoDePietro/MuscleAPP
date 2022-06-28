package com.muscle.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity(name = "esercizio")
public class Esercizio {
	private @Id @GeneratedValue Long id_esercizio;
	private String nome;
	private String link_esempio;
	
	Esercizio() {}

	public Esercizio(String nome, String link_esempio) {
		super();
		this.nome = nome;
		this.link_esempio = link_esempio;
	}

	public Long getId_esercizio() {
		return id_esercizio;
	}

	public void setId_esercizio(Long id_esercizio) {
		this.id_esercizio = id_esercizio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLink_esempio() {
		return link_esempio;
	}

	public void setLink_esempio(String link_esempio) {
		this.link_esempio = link_esempio;
	}
}
