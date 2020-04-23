package com.virtuaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtuaapp.dao.ProdutoDAO;
import com.virtuaapp.model.Produto;

public class ProdutoServiceImpl {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	public void addProduto(Produto produto) {
		produtoDAO.addProduto(produto);	
	}

	public void updateProduto(Produto produto) {
		produtoDAO.updateProduto(produto);		
	}

	public Produto getProduto(int cpf) {
		return produtoDAO.getProduto(cpf);
	}

	public void deleteProduto(int idProduto) {
		produtoDAO.deleteProduto(idProduto);
	}

	public List<Produto> getProdutos() {
		return produtoDAO.getProdutos();
	}
	
}
