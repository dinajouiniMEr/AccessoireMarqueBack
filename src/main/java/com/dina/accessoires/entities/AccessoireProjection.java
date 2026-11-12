package com.dina.accessoires.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomAcc", types = { Accessoire.class })
public interface AccessoireProjection {
	public String getNomAccessoire();
}
