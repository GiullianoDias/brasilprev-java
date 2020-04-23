package com.virtuaapp.model;

import java.util.List;

public class Pedido {

	private Integer idPedido;
	
	private String cpf;

	private List<Produto> Produtos;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Produto> getProdutos() {
		return Produtos;
	}

	public void setProdutos(List<Produto> Produtos) {
		this.Produtos = Produtos;
	}	

}
