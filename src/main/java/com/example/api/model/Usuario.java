package com.example.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String email;
  private String senha;
  private String nome;
  private LocalDateTime nascimento;
  private String CPF;
  private float valorConta;


  @OneToMany(mappedBy = "usuario", orphanRemoval = true, cascade = CascadeType.ALL)
  private List<Operacao> operacoes = new ArrayList<Operacao>();

  public long getId() {
    return id;
  }

  public String getEmail() {
    return email;
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

  public void setEmail(String email) {
    this.email = email;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public List<Operacao> getOperacoes() {
    return operacoes;
  }

  public void setOperacoes(List<Operacao> operacoes) {
    this.operacoes = operacoes;
  }

  public String getCPF() {
      return CPF;
  }

  public void setCPF(String cPF) {
      CPF = cPF;
  }

  public LocalDateTime getNascimento() {
      return nascimento;
  }

  public void setNascimento(LocalDateTime nascimento) {
      this.nascimento = nascimento;
  }

  public float getValorConta() {
      return valorConta;
  }

  public void setValorConta(float valorConta) {
      this.valorConta = valorConta;
  }
  
}
