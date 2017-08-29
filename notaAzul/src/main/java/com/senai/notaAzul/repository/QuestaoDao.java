package com.senai.notaAzul.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.senai.notaAzul.model.Questao;
 
@RepositoryRestResource(collectionResourceRel = "questao", path = "questoes")
public interface QuestaoDao extends PagingAndSortingRepository<Questao, Integer> {

}
