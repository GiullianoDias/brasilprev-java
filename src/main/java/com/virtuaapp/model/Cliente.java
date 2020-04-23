package com.virtuaapp.model;

public class Cliente {
	
	private Integer cpf;
	
	private String nome;

	private String endereco;
	
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
