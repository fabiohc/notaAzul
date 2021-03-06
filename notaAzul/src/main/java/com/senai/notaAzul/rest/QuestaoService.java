package com.senai.notaAzul.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senai.notaAzul.repository.QuestaoDao;
import com.senai.notaAzul.model.Materia;
import com.senai.notaAzul.model.Questao;

@RestController
@RequestMapping("/questao")
public class QuestaoService {
	
	@Autowired
	private QuestaoDao questaoDao;
	
	@CrossOrigin
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Questao> getQuestao(){
		List<Questao> result = new ArrayList<>();
		questaoDao.findAll().forEach(result::add);
	      return result;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Questao getQuestao(@PathVariable int id) {
		return questaoDao.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Questao q) {
		questaoDao.save(q);
	}

	@CrossOrigin
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
	questaoDao.delete(id);
	}


}
