package com.dina.accessoires;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dina.accessoires.entities.Accessoire;
import com.dina.accessoires.entities.Marque;
import com.dina.accessoires.repos.AccessoireRepository;
import com.dina.accessoires.repos.MarqueRepository;

@SpringBootTest
class AccessoireMarqueApplicationTests {

	@Autowired
	private AccessoireRepository accessoireRepository;

	@Autowired
	private MarqueRepository marqueRepository;

	@Test
	public void testCreateMarques() {
		Marque m1 = new Marque("Cartier", "Marque d'origine française");
		marqueRepository.save(m1);
	}

	@Test
	public void testCreateAccessoire() throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2026-10-05");
		Marque m = new Marque();
		m.setIdMar(1L);
		Accessoire acc = new Accessoire("Matrix Ring", 139.99, date, "bague", m);
		accessoireRepository.save(acc);
	}

	@Test
	public void testFindAccessoire() {
		Accessoire a = accessoireRepository.findById(1L).get();
		System.out.println(a);
	}

	@Test
	public void testUpdateAccessoire() {
		Accessoire a = accessoireRepository.findById(1L).get();
		a.setPrixAccessoire(100.0);
		accessoireRepository.save(a);
	}

	@Test
	public void testDeleteAccessoire() {
		accessoireRepository.deleteById(1L);
	}

	@Test
	public void testListerTousAccessoires() {
		List<Accessoire> accs = accessoireRepository.findAll();
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomAccessoire() {
		List<Accessoire> accs = accessoireRepository.findByNomAccessoire("Matrix Ring");
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomAccessoireContains() {
		List<Accessoire> accs = accessoireRepository.findByNomAccessoireContains("Ring");
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomPrix() {
		List<Accessoire> accs = accessoireRepository.findByNomPrix("Matrix Ring", 100.0);
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByMarque() {
		Marque mar = new Marque();
		mar.setIdMar(1L);
		List<Accessoire> accs = accessoireRepository.findByMarque(mar);
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByMarqueIdMar() {
		List<Accessoire> accs = accessoireRepository.findByMarqueIdMar(1L);
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByOrderByNomAccessoireAsc() {
		List<Accessoire> accs = accessoireRepository.findByOrderByNomAccessoireAsc();
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testTrierAccessoiresNomsPrix() {
		List<Accessoire> accs = accessoireRepository.trierAccessoiresNomsPrix();
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

}
