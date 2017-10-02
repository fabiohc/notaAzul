package com.senai.notaAzul.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.senai.notaAzul.model.Materia;

	
@RepositoryRestResource(collectionResourceRel = "materia", path = "materias")
public interface MateriaDao extends PagingAndSortingRepository<Materia, Integer>{
}


