package com.example.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Usuario;

@RestController
@RequestMapping
public class IndexController {

  @GetMapping(value = "/", produces = "application/json")
  public ResponseEntity<Usuario> init() {
    Usuario usuario = new Usuario();
    usuario.setId(1l);
    usuario.setLogin("asaasas@asa.com");
    usuario.setNome("asdasd");
    usuario.setSenha("123123");

    return new ResponseEntity(usuario, HttpStatus.OK);
  }

  @GetMapping(value = "/get2", produces = "application/json")
  public ResponseEntity init2() {
    Usuario usuario1 = new Usuario();
    Usuario usuario2 = new Usuario();

    usuario1.setId(1);
    usuario1.setLogin("guilherme");
    usuario1.setLogin("gui1");
    usuario1.setSenha("123123");

    usuario2.setId(2);
    usuario2.setNome("gabriel");
    usuario2.setLogin("gabriel02");
    usuario2.setSenha("123");

    List<Usuario> list = new ArrayList<Usuario>();
    list.add(usuario1);
    list.add(usuario2);

    return new ResponseEntity(list, HttpStatus.OK);
  }
}
