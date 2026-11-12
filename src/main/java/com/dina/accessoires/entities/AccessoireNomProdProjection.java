package com.dina.accessoires.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Accessoire.class })
public interface AccessoireNomProdProjection {
	public String getNomAccessoire();
}
