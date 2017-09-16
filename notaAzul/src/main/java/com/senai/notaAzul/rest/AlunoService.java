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

import com.senai.notaAzul.repository.AlunoDao;
import com.senai.notaAzul.model.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoService {

	@Autowired
	private AlunoDao alunoDao;

	@CrossOrigin
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Aluno> getAlunos() {
		List<Aluno> result = new ArrayList<>();
		alunoDao.findAll().forEach(result::add);
		return result;

	}

	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Aluno getAluno(@PathVariable int id) {
		return alunoDao.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Aluno a) {
		alunoDao.save(a);
	}

	@CrossOrigin
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
	alunoDao.delete(id);
	}
}