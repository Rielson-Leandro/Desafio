package com.desafio.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "basea")
public class Base_A implements Serializable{

	private static final long serialVersionUID = -7147208680870824943L;
	
	@Id
	private String id;
	
	private String cpf;
	private String nome;
	private String endereco;
	private List<String> dividas;
	
	public Base_A(){
		
	}
	
	public Base_A(String cpf){
		this.cpf = cpf;
	}

	public String getId() {
		return id;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<String> getDividas() {
		return dividas;
	}

	public void setDividas(List<String> dividas) {
		this.dividas = dividas;
	}
}