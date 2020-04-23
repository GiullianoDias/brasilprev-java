package com.virtuaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtuaapp.dao.ClienteDAO;
import com.virtuaapp.model.Cliente;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	
	public void addCliente(Cliente cliente) {
		clienteDAO.addCliente(cliente);	
	}

	public void updateCliente(Cliente cliente) {
		clienteDAO.updateCliente(cliente);		
	}

	public Cliente getCliente(int cpf) {
		return clienteDAO.getCliente(cpf);
	}

	public void deleteCliente(int cpf) {
		clienteDAO.deleteCliente(cpf);
	}

	public List<Cliente> getClientes() {
		return clienteDAO.getClientes();
	}
	
}
