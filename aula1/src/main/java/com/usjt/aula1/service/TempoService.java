package com.usjt.aula1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usjt.aula1.model.Tempo;
import com.usjt.aula1.repository.TempoRepository;

@Service
public class TempoService {
	
	@Autowired
	private TempoRepository tempRepo;
	
	public List<Tempo> listar() {
		return tempRepo.findAll();
	}
	
	public void cadastrar(Tempo tempo) {
		tempRepo.save(tempo);
	}
}
