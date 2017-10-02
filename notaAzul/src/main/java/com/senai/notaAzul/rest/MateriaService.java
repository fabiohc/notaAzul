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


import com.senai.notaAzul.repository.MateriaDao;
import com.senai.notaAzul.model.Materia;;



@RestController
@RequestMapping("/Materia")
public class MateriaService {
	
	@Autowired
	private MateriaDao materiaDao;

	@CrossOrigin
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Materia> getMaterias() {
		List<Materia> result = new ArrayList<>();
		materiaDao.findAll().forEach(result::add);
		return result;

	}

	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Materia getMateria(@PathVariable int id) {
		return materiaDao.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Materia m) {
		materiaDao.save(m);
	}

	@CrossOrigin
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
	materiaDao.delete(id);
	}
}


