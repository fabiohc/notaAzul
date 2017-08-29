package com.senai.notaAzul.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.senai.notaAzul.model.Resposta;

@RepositoryRestResource(collectionResourceRel = "resposta", path = "respostas")
public interface RespostaDao extends PagingAndSortingRepository<Resposta, Integer>{

}
