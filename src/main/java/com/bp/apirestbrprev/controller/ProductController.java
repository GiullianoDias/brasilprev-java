package com.bp.apirestbrprev.controller;

import com.bp.apirestbrprev.model.Product;
import com.bp.apirestbrprev.repository.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @ApiOperation(value="Retorna uma lista de Produtos")
    @GetMapping("/produtos")
    public List<Product> listaProdutos(){
        return productRepository.findAll();
    }

    @ApiOperation(value="Retorna um produto unico")
    @GetMapping("/produto/{id}")
    public Product listaProdutoUnico(@PathVariable(value="id") long id){
        return productRepository.findById(id);
    }

    @ApiOperation(value="Salva um produto")
    @PostMapping("/produto")
    public Product salvaProduto(@RequestBody @Valid Product product) {
        return productRepository.save(product);
    }

    @ApiOperation(value="Deleta um produto")
    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody @Valid Product product) {
        productRepository.delete(product);
    }

    @ApiOperation(value="Atualiza um produto")
    @PutMapping("/produto")
    public Product atualizaProduto(@RequestBody @Valid Product product) {
        return productRepository.save(product);
    }
}
