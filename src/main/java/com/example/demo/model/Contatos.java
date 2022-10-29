package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contatos {
	
	@Id
	Long idContatos;
	String nome;
	int telefone;
	String mensagem;
	String email;
	
	
	public Contatos(Long idContatos, String nome, int telefone, String mensagem, String email) {
		super();
		this.idContatos = idContatos;
		this.nome = nome;
		this.telefone = telefone;
		this.mensagem = mensagem;
		this.email = email;
	}
	public Long getIdContatos() {
		return idContatos;
	}
	public void setIdContatos(Long idContatos) {
		this.idContatos = idContatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	}
