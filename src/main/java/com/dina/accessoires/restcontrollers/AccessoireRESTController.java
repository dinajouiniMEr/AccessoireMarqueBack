package com.dina.accessoires.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dina.accessoires.entities.Accessoire;
import com.dina.accessoires.service.AccessoireService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AccessoireRESTController {

	@Autowired
	AccessoireService accessoireService;

	@RequestMapping(path = "all", method = RequestMethod.GET)
	public List<Accessoire> getAllAccessoires() {
		return accessoireService.getAllAccessoires();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
	public Accessoire getAccessoireById(@PathVariable("id") Long id) {
		return accessoireService.getAccessoire(id);
	}

	@RequestMapping(path = "/addacc", method = RequestMethod.POST)
	public Accessoire createAccessoire(@RequestBody Accessoire accessoire) {
		return accessoireService.saveAccessoire(accessoire);
	}

	@RequestMapping(path = "/updateacc", method = RequestMethod.PUT)
	public Accessoire updateAccessoire(@RequestBody Accessoire accessoire) {
		return accessoireService.updateAccessoire(accessoire);
	}

	@RequestMapping(value = "/delacc/{id}", method = RequestMethod.DELETE)
	public void deleteAccessoire(@PathVariable("id") Long id) {
		accessoireService.deleteAccessoireById(id);
	}

	@RequestMapping(value = "/accsmar/{idMar}", method = RequestMethod.GET)
	public List<Accessoire> getAccessoiresByMarId(@PathVariable("idMar") Long idMar) {
		return accessoireService.findByMarqueIdMar(idMar);
	}

	@RequestMapping(value = "/prodscat/{idCat}", method = RequestMethod.GET)
	public List<Accessoire> getAccessoiresByCatId(@PathVariable("idCat") Long idCat) {
		return accessoireService.findByMarqueIdMar(idCat);
	}

	@RequestMapping(value = "/accsByName/{nom}", method = RequestMethod.GET)
	public List<Accessoire> findByNomAccessoireContains(@PathVariable("nom") String nom) {
		return accessoireService.findByNomAccessoireContains(nom);
	}

}
