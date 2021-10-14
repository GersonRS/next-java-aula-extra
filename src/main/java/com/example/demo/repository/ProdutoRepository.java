package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
  List<Produto> findByName(String name);
}
