package com.virtuaapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtuaapp.model.Produto;

@Repository
public class ProdutoDAOImpl implements ProdutoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();		
	}
	
	public void addProduto(Produto produto) {
		getCurrentSession().save(produto);
	}

	public void updateProduto(Produto produto) {
		Produto produtoUpdate = getProduto(produto.getIdProduto());
		produtoUpdate.setDescricao(produto.getDescricao());
		produtoUpdate.setNomeProduto(produto.getNomeProduto());
		produtoUpdate.setUrlPicture(produto.getUrlPicture());
		produtoUpdate.setValor(produto.getValor());
		getCurrentSession().update(produtoUpdate);
	}

	public Produto getProduto(int idProduto) {
		Produto produto = (Produto) getCurrentSession().get(Produto.class, idProduto);
		return produto;
	}

	public void deleteProduto(int idProduto) {
		Produto produto = getProduto(idProduto);
		if(produto != null)
			getCurrentSession().delete(produto);
	}

	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos() {
		return getCurrentSession().createQuery("from Produto").list();
	}

}
