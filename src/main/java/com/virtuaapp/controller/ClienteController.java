package com.virtuaapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtuaapp.model.Cliente;
import com.virtuaapp.service.ClienteService;

@Controller
@RequestMapping(value="/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value="/{cpf}", method=RequestMethod.GET)
	public Cliente getCliente(@PathVariable Integer cpf) {		
		return clienteService.getCliente(cpf);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addingCliente(@Valid @ModelAttribute Cliente cliente) {		
		clienteService.addCliente(cliente);		
		String message = "Cliente was successfully added.";
		return message;
	}
	
	@RequestMapping(value="/list")
	public List<Cliente> listOfClientes() {
		List<Cliente> clientes = clienteService.getClientes();		
		return clientes;
	}

	@RequestMapping(value="/edit/{cpf}", method=RequestMethod.POST)
	public String edditingCliente(@ModelAttribute Cliente cliente, @PathVariable Integer cpf) {
		clienteService.updateCliente(cliente);
		String message = "Cliente was successfully edited.";
		return message;
	}
	
	@RequestMapping(value="/delete/{cpf}", method=RequestMethod.GET)
	public String deleteCliente(@PathVariable Integer cpf) {
		clienteService.deleteCliente(cpf);
		String message = "Cliente was successfully deleted.";
		return message;
	}
}
