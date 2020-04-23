package com.virtuaapp.dao;

import java.util.List;

import com.virtuaapp.model.Pedido;

public interface PedidoDAO {
	 
		public void addPedido(Pedido pedido);
		public void updatePedido(Pedido pedido);
		public Pedido getPedido(int idPedido);
		public void deletePedido(int idPedido);
		public List<Pedido> getPedidosCliente(int cpf);
}
