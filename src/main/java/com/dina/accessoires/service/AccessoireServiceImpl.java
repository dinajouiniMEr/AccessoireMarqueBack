package com.dina.accessoires.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dina.accessoires.entities.Accessoire;
import com.dina.accessoires.entities.Marque;
import com.dina.accessoires.repos.AccessoireRepository;

@Service
public class AccessoireServiceImpl implements AccessoireService {

	@Autowired
	AccessoireRepository accessoireRepository;

	@Override
	public Accessoire saveAccessoire(Accessoire a) {
		return accessoireRepository.save(a);
	}

	@Override
	public Accessoire updateAccessoire(Accessoire a) {
		return accessoireRepository.save(a);
	}

	@Override
	public void deleteAccessoire(Accessoire a) {
		accessoireRepository.delete(a);
	}

	@Override
	public void deleteAccessoireById(Long id) {
		accessoireRepository.deleteById(id);
	}

	@Override
	public Accessoire getAccessoire(Long id) {
		return accessoireRepository.findById(id).get();
	}

	@Override
	public List<Accessoire> getAllAccessoires() {
		return accessoireRepository.findAll();
	}

	@Override
	public List<Accessoire> findByNomAccessoire(String nom) {
		return accessoireRepository.findByNomAccessoire(nom);
	}

	@Override
	public List<Accessoire> findByNomAccessoireContains(String nom) {
		return accessoireRepository.findByNomAccessoireContains(nom);
	}

	@Override
	public List<Accessoire> findByNomPrix(String nom, Double prix) {
		return accessoireRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Accessoire> findByMarque(Marque marque) {
		return accessoireRepository.findByMarque(marque);
	}

	@Override
	public List<Accessoire> findByMarqueIdMar(Long id) {
		return accessoireRepository.findByMarqueIdMar(id);
	}

	@Override
	public List<Accessoire> findByOrderByNomAccessoireAsc() {
		return accessoireRepository.findByOrderByNomAccessoireAsc();
	}

	@Override
	public List<Accessoire> trierAccessoiresNomsPrix() {
		return accessoireRepository.trierAccessoiresNomsPrix();
	}

}
