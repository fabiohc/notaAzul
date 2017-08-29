package com.senai.notaAzul.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senai.notaAzul.repository.QuestaoDao;
import com.senai.notaAzul.model.Questao;

@RestController
@RequestMapping("/questao")
public class QuestaoService {
	
	@Autowired
	private QuestaoDao questaoDao;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Questao> getQuestao(){
		List<Questao> result = new ArrayList<>();
		questaoDao.findAll().forEach(result::add);
	      return result;
	}

}
