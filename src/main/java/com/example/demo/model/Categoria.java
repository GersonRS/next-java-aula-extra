package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String name;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "categoria_id")
  private Set<Produto> listaProdutos;

  public Categoria(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Categoria() {
  }

  /**
   * @return long return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

}
