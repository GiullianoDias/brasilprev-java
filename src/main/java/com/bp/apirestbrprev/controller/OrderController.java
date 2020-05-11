package com.bp.apirestbrprev.controller;

import com.bp.apirestbrprev.model.Order;
import com.bp.apirestbrprev.repository.OrderRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Compras")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @ApiOperation(value="Retorna uma lista de Compras")
    @GetMapping("/compras")
    public List<Order> listaCompras(){
        return orderRepository.findAll();
    }

    @ApiOperation(value="Retorna uma compra")
    @GetMapping("/compras/{id}")
    public Order listaCompraUnico(@PathVariable(value="id") long id){
        return orderRepository.findById(id);
    }

    @ApiOperation(value="Salva uma compra")
    @PostMapping("/compras")
    public Order salvaCompra(@RequestBody @Valid Order order) {
        return orderRepository.save(order);
    }

    @ApiOperation(value="Deleta uma compra")
    @DeleteMapping("/compras")
    public void deletaCompra(@RequestBody @Valid Order order) {
        orderRepository.delete(order);
    }

    @ApiOperation(value="Atualiza uma compra")
    @PutMapping("/compras")
    public Order atualizaCompra(@RequestBody @Valid Order order) {
        return orderRepository.save(order);
    }
}
