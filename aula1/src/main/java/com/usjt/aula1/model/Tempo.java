package com.usjt.aula1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tempo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Double tmax;
	private Double tmin;
	private Double humidade;
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getHumidade() {
		return humidade;
	}

	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getTmax() {
		return tmax;
	}

	public void setTmax(Double tmax) {
		this.tmax = tmax;
	}

	public Double getTmin() {
		return tmin;
	}

	public void setTmin(Double tmin) {
		this.tmin = tmin;
	}
	
	
	
}
