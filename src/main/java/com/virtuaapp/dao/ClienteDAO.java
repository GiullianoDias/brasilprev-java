package com.virtuaapp.dao;

import java.util.List;

import com.virtuaapp.model.Cliente;

public interface ClienteDAO {
	public void addCliente(Cliente cliente);
	public void updateCliente(Cliente cliente);
	public Cliente getCliente(int cpf);
	public void deleteCliente(int cpf);
	public List<Cliente> getClientes();
}
