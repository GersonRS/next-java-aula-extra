package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

  @Autowired
  private ProdutoRepository repository;

  @GetMapping("/produtos")
  public List<Produto> listarProdutos() {
    return repository.findAll();
  }

  @GetMapping("/produtos/id/{varID}")
  public ResponseEntity<Produto> getProdutoByID(@PathVariable(value = "varID") long id) {

    Optional<Produto> produto = repository.findById(id);
    if (produto.isPresent()) {
      return new ResponseEntity<Produto>(produto.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/produtos/name/{varName}")
  public List<Produto> getProdutoByName(@PathVariable(value = "varName") String name) {
    return repository.findByName(name);
  }
}
