package com.dina.accessoires.service;

import java.util.List;

import com.dina.accessoires.entities.Accessoire;
import com.dina.accessoires.entities.Marque;

public interface AccessoireService {

	Accessoire saveAccessoire(Accessoire a);
	Accessoire updateAccessoire(Accessoire a);
	void deleteAccessoire(Accessoire a);
	void deleteAccessoireById(Long id);
	Accessoire getAccessoire(Long id);
	List<Accessoire> getAllAccessoires();

	List<Accessoire> findByNomAccessoire(String nom);
	List<Accessoire> findByNomAccessoireContains(String nom);
	List<Accessoire> findByNomPrix(String nom, Double prix);
	List<Accessoire> findByMarque(Marque marque);
	List<Accessoire> findByMarqueIdMar(Long id);
	List<Accessoire> findByOrderByNomAccessoireAsc();
	List<Accessoire> trierAccessoiresNomsPrix();

}
