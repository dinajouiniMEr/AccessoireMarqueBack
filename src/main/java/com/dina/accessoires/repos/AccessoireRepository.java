package com.dina.accessoires.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dina.accessoires.entities.Accessoire;
import com.dina.accessoires.entities.Marque;

@RepositoryRestResource(path = "rest")
public interface AccessoireRepository extends JpaRepository<Accessoire, Long> {

	List<Accessoire> findByNomAccessoire(String nom);

	List<Accessoire> findByNomAccessoireContains(String nom);

	@Query("select a from Accessoire a where a.nomAccessoire like %:nom and a.prixAccessoire > :prix")
	List<Accessoire> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

	@Query("select a from Accessoire a where a.marque = ?1")
	List<Accessoire> findByMarque(Marque marque);

	List<Accessoire> findByMarqueIdMar(Long id);

	List<Accessoire> findByOrderByNomAccessoireAsc();

	@Query("select a from Accessoire a order by a.nomAccessoire ASC, a.prixAccessoire DESC")
	List<Accessoire> trierAccessoiresNomsPrix();

}
