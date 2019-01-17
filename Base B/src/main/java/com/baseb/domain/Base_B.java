package com.baseb.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "baseb")
public class Base_B implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String cpf;
	private int idade;
	private String endereco;
	private String fonte_de_renda;
	private int Score;
	private List<String> bens;
	
	public Base_B(){
		
	}
	
	public Base_B(String id){
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFonte_de_renda() {
		return fonte_de_renda;
	}

	public void setFonte_de_renda(String fonte_de_renda) {
		this.fonte_de_renda = fonte_de_renda;
	}

	public List<String> getBens() {
		return bens;
	}

	public void setBens(List<String> bens) {
		this.bens = bens;
	}
}