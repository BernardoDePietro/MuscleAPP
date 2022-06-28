package com.muscle.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
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
