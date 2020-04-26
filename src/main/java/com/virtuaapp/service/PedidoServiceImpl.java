package com.virtuaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtuaapp.dao.PedidoDAO;
import com.virtuaapp.model.Pedido;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService	{

	@Autowired
	private PedidoDAO pedidoDAO;
	
	public void addPedido(Pedido pedido) {
		pedidoDAO.addPedido(pedido);
	}

	public void updatePedido(Pedido pedido) {
		pedidoDAO.updatePedido(pedido);
	}

	public Pedido getPedido(int idPedido) {
		return pedidoDAO.getPedido(idPedido);
	}

	public void deletePedido(int idPedido) {
		pedidoDAO.deletePedido(idPedido);
	}

	public List<Pedido> getPedidosCliente(int cpf) {
		return pedidoDAO.getPedidosCliente(cpf);
	}

}
