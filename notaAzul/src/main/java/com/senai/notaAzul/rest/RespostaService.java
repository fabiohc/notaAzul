package com.senai.notaAzul.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senai.notaAzul.repository.RespostaDao;
import com.senai.notaAzul.model.Resposta;

@RestController
@RequestMapping ("/resposta")
public class RespostaService {
	
	@Autowired
	private RespostaDao respostaDao;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public List<Resposta> getResposta(){
		List<Resposta> result = new ArrayList<>();
		respostaDao.findAll().forEach(result::add);
		return result;
		
	}
	
 	

}
