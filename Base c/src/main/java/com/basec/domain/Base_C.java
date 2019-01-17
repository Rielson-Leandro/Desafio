package com.basec.domain;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "basec")
public class Base_C implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Size(max = 11)
	private String cpf;
	private List<String> ultimaConsulta; 
	private List<String> movimentoFinaceiro;
	private List<String> ultimaCompra;
	
	public Base_C() {
		
	}
	
	public Base_C(String cpf){
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

	public List<String> getUltimaConsulta() {
		return ultimaConsulta;
	}

	public void setUltimaConsulta(List<String> ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}

	public List<String> getMovimentoFinaceiro() {
		return movimentoFinaceiro;
	}

	public void setMovimentoFinaceiro(List<String> movimentoFinaceiro) {
		this.movimentoFinaceiro = movimentoFinaceiro;
	}

	public List<String> getUltimaCompra() {
		return ultimaCompra;
	}

	public void setUltimaCompra(List<String> ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}
	
	

}
