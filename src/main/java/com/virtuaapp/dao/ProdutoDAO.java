package com.virtuaapp.dao;

import java.util.List;

import com.virtuaapp.model.Produto;

public interface ProdutoDAO {
	 
		public void addProduto(Produto produto);
		public void updateProduto(Produto produto);
		public Produto getProduto(int idProduto);
		public void deleteProduto(int idProduto);
		public List<Produto> getProdutos();
}
