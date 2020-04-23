package com.virtuaapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.virtuaapp.model.Pedido;

public class PedidoDAOImpl implements PedidoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();		
	}
	
	public void addPedido(Pedido pedido) {
		getCurrentSession().save(pedido);
	}

	public void updatePedido(Pedido pedido) {
		Pedido pedidoUpdate = getPedido(pedido.getIdPedido());
		pedidoUpdate.setCpf(pedido.getCpf());
		pedidoUpdate.setProdutos(pedido.getProdutos());
		getCurrentSession().update(pedidoUpdate);
	}

	public Pedido getPedido(int idPedido) {
		Pedido pedido = (Pedido) getCurrentSession().get(Pedido.class, idPedido);
		return pedido;
	}

	public void deletePedido(int idPedido) {
		Pedido pedido = getPedido(idPedido);
		if(pedido != null)
			getCurrentSession().delete(pedido);
	}
	
	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidosCliente(int cpf) {
		return getCurrentSession().createQuery("from Pedido where cpf = :cpf").list();
	}

}
