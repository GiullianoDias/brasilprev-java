package com.virtuaapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.virtuaapp.model.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();		
	}
	
	public void addCliente(Cliente cliente) {
		getCurrentSession().save(cliente);
	}

	public void updateCliente(Cliente cliente) {
		Cliente clienteToUpdate = getCliente(cliente.getCPF());
		clienteToUpdate.setNome(cliente.getNome());
		clienteToUpdate.setEndereco(cliente.getEndereco());
		clienteToUpdate.setTelefone(cliente.getTelefone());
		getCurrentSession().update(clienteToUpdate);
	}

	public Cliente getCliente(int cpf) {
		Cliente cliente = (Cliente) getCurrentSession().get(Cliente.class, cpf);
		return cliente;
	}

	public void deleteCliente(int cpf) {
		Cliente cliente = getCliente(cpf);
		if(cliente != null)
			getCurrentSession().delete(cliente);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		return getCurrentSession().createQuery("from Cliente").list();
	}

}
