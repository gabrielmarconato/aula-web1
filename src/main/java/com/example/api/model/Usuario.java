package com.example.api.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String login;
  private String senha;
  private String nome;

  public long getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getNome() {
    return nome;
  }

  public String getSenha() {
    return senha;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
