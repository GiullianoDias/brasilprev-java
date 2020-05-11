package com.bp.apirestbrprev.controller;

import com.bp.apirestbrprev.model.Customer;
import com.bp.apirestbrprev.repository.CustomerRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Clientes")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @ApiOperation(value="Retorna uma lista de Clientes")
    @GetMapping("/cliente")
    public List<Customer> listaClientes(){
        return customerRepository.findAll();
    }

    @ApiOperation(value="Retorna um cliente unico")
    @GetMapping("/cliente/{id}")
    public Customer listaClienteUnico(@PathVariable(value="id") long id){
        return customerRepository.findById(id);
    }

    @ApiOperation(value="Salva um Cliente")
    @PostMapping("/cliente")
    public Customer salvaCliente(@RequestBody @Valid Customer customer) {
        return customerRepository.save(customer);
    }

    @ApiOperation(value="Deleta um Cliente")
    @DeleteMapping("/cliente")
    public void deletaCliente(@RequestBody @Valid Customer customer) {
        customerRepository.delete(customer);
    }

    @ApiOperation(value="Atualiza um Cliente")
    @PutMapping("/cliente")
    public Customer atualizaCliente(@RequestBody @Valid Customer customer) {
        return customerRepository.save(customer);
    }
}
