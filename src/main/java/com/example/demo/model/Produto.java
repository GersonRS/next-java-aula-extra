package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String name;
  @Column
  private String description;
  @Column
  private double value;

  @ManyToOne
  @JoinColumn(name = "categoria_id")
  private Categoria categoria;

  
  public Produto() {
  }


  public Produto(long id, String name, String description, double value) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.value = value;
  }


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public double getValue() {
    return value;
  }


  public void setValue(double value) {
    this.value = value;
  }

  
}
