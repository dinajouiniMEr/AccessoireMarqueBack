package com.dina.accessoires.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Accessoire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAccessoire;
	private String nomAccessoire;
	private Double prixAccessoire;
	private Date dateCreation;
	private String type;

	@ManyToOne
	private Marque marque;

	public Accessoire() {
		super();
	}

	public Accessoire(String nomAccessoire, Double prixAccessoire, Date dateCreation) {
		super();
		this.nomAccessoire = nomAccessoire;
		this.prixAccessoire = prixAccessoire;
		this.dateCreation = dateCreation;
	}

	public Accessoire(String nomAccessoire, Double prixAccessoire, Date dateCreation, String type) {
		super();
		this.nomAccessoire = nomAccessoire;
		this.prixAccessoire = prixAccessoire;
		this.dateCreation = dateCreation;
		this.type = type;
	}

	public Accessoire(String nomAccessoire, Double prixAccessoire, Date dateCreation, String type, Marque marque) {
		super();
		this.nomAccessoire = nomAccessoire;
		this.prixAccessoire = prixAccessoire;
		this.dateCreation = dateCreation;
		this.type = type;
		this.marque = marque;
	}

	public Long getIdAccessoire() {
		return idAccessoire;
	}

	public void setIdAccessoire(Long idAccessoire) {
		this.idAccessoire = idAccessoire;
	}

	public String getNomAccessoire() {
		return nomAccessoire;
	}

	public void setNomAccessoire(String nomAccessoire) {
		this.nomAccessoire = nomAccessoire;
	}

	public Double getPrixAccessoire() {
		return prixAccessoire;
	}

	public void setPrixAccessoire(Double prixAccessoire) {
		this.prixAccessoire = prixAccessoire;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Accessoire [idAccessoire=" + idAccessoire + ", nomAccessoire=" + nomAccessoire
				+ ", prixAccessoire=" + prixAccessoire + ", dateCreation=" + dateCreation
				+ ", type=" + type + ", marque=" + marque + "]";
	}
}
