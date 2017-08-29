package com.senai.notaAzul.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.senai.notaAzul.model.Aluno;

	
@RepositoryRestResource(collectionResourceRel = "aluno", path = "alunos")
public interface AlunoDao extends PagingAndSortingRepository<Aluno, Integer>{
}
