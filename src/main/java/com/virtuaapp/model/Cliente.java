package com.virtuaapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	private Integer cpf;
	
	private String nome;

	private String endereco;
	
	@NotNull
	@Range(min=111111111, max=999999999)
	private String telefone;
		
	public Cliente() {
		
	}
		
	public Integer getCPF() {
		return cpf;
	}
	public void setCPF(Integer cpf) {
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
