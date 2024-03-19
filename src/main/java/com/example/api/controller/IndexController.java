package com.example.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Usuario;
import com.example.api.repository.UsuarioRepository;

@RestController
@RequestMapping
public class IndexController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping(value = "/aaa", produces = "application/json")
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

  @GetMapping(value = "/usuario/{id}", produces = "application/json")
  public ResponseEntity<Usuario> get(@PathVariable(value = "id") Long id) {
    try {
      Optional<Usuario> usuario = usuarioRepository.findById(id);
  
      return new ResponseEntity(usuario.get(), HttpStatus.OK);
    } catch(Exception e) {
      return new ResponseEntity("No such user", HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping(value = "/", produces = "application/json")
  public ResponseEntity<List<Usuario>> getAll() {

    List<Usuario> list = (List<Usuario>) usuarioRepository.findAll();

    return new ResponseEntity(list, HttpStatus.OK);

  }
}
