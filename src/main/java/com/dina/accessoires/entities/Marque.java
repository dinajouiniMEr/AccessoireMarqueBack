package com.dina.accessoires.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMar;
	private String nomMar;
	private String descriptionMar;

	@JsonIgnore
	@ToString.Exclude
	@OneToMany(mappedBy = "marque")
	private List<Accessoire> accessoires;

	public Marque(String nomMar, String descriptionMar) {
		super();
		this.nomMar = nomMar;
		this.descriptionMar = descriptionMar;
	}
}
