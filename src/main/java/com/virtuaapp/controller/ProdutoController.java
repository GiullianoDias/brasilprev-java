package com.virtuaapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtuaapp.model.Produto;
import com.virtuaapp.service.ProdutoService;

@Controller
@RequestMapping(value="/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value="/{idProduto}", method=RequestMethod.GET)
	public Produto getProduto(@PathVariable Integer idProduto) {		
		return produtoService.getProduto(idProduto);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addingProduto(@Valid @ModelAttribute Produto produto) {		
		produtoService.addProduto(produto);		
		String message = "Produto was successfully added.";
		return message;
	}
	
	@RequestMapping(value="/list")
	public List<Produto> listOfProdutos() {
		List<Produto> produtos = produtoService.getProdutos();		
		return produtos;
	}

	@RequestMapping(value="/edit/{cpf}", method=RequestMethod.POST)
	public String edditingProduto(@ModelAttribute Produto produto, @PathVariable Integer cpf) {
		produtoService.updateProduto(produto);
		String message = "Produto was successfully edited.";
		return message;
	}
	
	@RequestMapping(value="/delete/{idProduto}", method=RequestMethod.GET)
	public String deleteProduto(@PathVariable Integer idProduto) {
		produtoService.deleteProduto(idProduto);
		String message = "Produto was successfully deleted.";
		return message;
	}
}
