package com.virtuaapp.service;

import java.util.List;

import com.virtuaapp.model.Pedido;

public interface PedidoService {
	public void addPedido(Pedido pedido);
	public void updatePedido(Pedido pedido);
	public Pedido getPedido(int idPedido);
	public void deletePedido(int idPedido);
	public List<Pedido> getPedidosCliente(int cpf);
}
