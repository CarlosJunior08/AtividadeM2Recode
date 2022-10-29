package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Destinos {
	
	@Id
	Long idDestinos;
	String nome;
	int valor;
	String descricao;
	
	public Destinos(Long idDestinos, String nome, int valor, String descricao) {
		super();
		this.idDestinos = idDestinos;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public Long getIdDestinos() {
		return idDestinos;
	}
	public void setIdDestinos(Long idDestinos) {
		this.idDestinos = idDestinos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}

 