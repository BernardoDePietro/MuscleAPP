package com.muscle.demo.model;

import java.util.Date;
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
@Entity(name = "scheda")
public class Scheda {
	private @Id @GeneratedValue Long id_scheda;
	private Date data_inizio;
	private Date data_fine;
	
	Scheda() {}

	public Scheda(Date data_inizio, Date data_fine) {
		super();
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
	}

	public Long getId_scheda() {
		return id_scheda;
	}

	public void setId_scheda(Long id_scheda) {
		this.id_scheda = id_scheda;
	}

	public Date getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}

	public Date getData_fine() {
		return data_fine;
	}

	public void setData_fine(Date data_fine) {
		this.data_fine = data_fine;
	}
}
