package com.usjt.aula1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usjt.aula1.model.Tempo;
import com.usjt.aula1.service.TempoService;

@Controller
public class TempoController {

	@Autowired
	private TempoService tempService;
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject(new Tempo());
		List<Tempo> tempos = tempService.listar();
		mv.addObject("tempos", tempos);
		return mv;
	}
	
	@PostMapping("/listar")
	public String cadastrar(Tempo tempo) {
		tempService.cadastrar(tempo);
		return "redirect:/listar";
	}
}
