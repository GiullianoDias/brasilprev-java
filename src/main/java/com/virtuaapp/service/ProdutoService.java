package com.virtuaapp.service;

import java.util.List;

import com.virtuaapp.model.Produto;

public interface ProdutoService {
	
	public void addProduto(Produto produto);
	public void updateProduto(Produto produto);
	public Produto getProduto(int idProduto);
	public void deleteProduto(int idProduto);
	public List<Produto> getProdutos();

}
