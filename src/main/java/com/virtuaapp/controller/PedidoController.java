package com.virtuaapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtuaapp.model.Pedido;
import com.virtuaapp.service.PedidoService;

@Controller
@RequestMapping(value="/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@RequestMapping(value="/{idPedido}", method=RequestMethod.GET)
	
	public Pedido getPedido(@PathVariable Integer idPedido) {		
		return pedidoService.getPedido(idPedido);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addingPedido(@Valid @ModelAttribute Pedido pedido) {		
		pedidoService.addPedido(pedido);		
		String message = "Pedido was successfully added.";
		return message;
	}
	
	@RequestMapping(value="/list")
	public List<Pedido> listOfPedidos(int cpf) {
		List<Pedido> pedidos = pedidoService.getPedidosCliente(cpf);		
		return pedidos;
	}

	@RequestMapping(value="/edit/{cpf}", method=RequestMethod.POST)
	public String edditingPedido(@ModelAttribute Pedido pedido, @PathVariable Integer cpf) {
		pedidoService.updatePedido(pedido);
		String message = "Pedido was successfully edited.";
		return message;
	}
	
	@RequestMapping(value="/delete/{idPedido}", method=RequestMethod.GET)
	public String deletePedido(@PathVariable Integer idPedido) {
		pedidoService.deletePedido(idPedido);
		String message = "Pedido was successfully deleted.";
		return message;
	}
}
