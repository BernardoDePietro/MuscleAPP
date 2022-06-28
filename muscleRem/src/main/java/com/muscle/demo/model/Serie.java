package com.muscle.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Serie {
	private @Id @GeneratedValue Long id_serie;
	private int ripetizioni;
	private String giorno; //si può fare una lookup table
	private float peso;
	
	Serie() {}
	
	public Serie(int ripetizioni, String giorno, float peso) {
		super();
		this.ripetizioni = ripetizioni;
		this.giorno = giorno;
		this.peso = peso;
	}

	public Long getId_serie() {
		return id_serie;
	}
	
	public void setId_serie(Long id_serie) {
		this.id_serie = id_serie;
	}
	
	public int getRipetizioni() {
		return ripetizioni;
	}
	
	public void setRipetizioni(int ripetizioni) {
		this.ripetizioni = ripetizioni;
	}
	
	public String getGiorno() {
		return giorno;
	}
	
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
