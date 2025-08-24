package br.com.dio.gftspringwebrestapi.controller;

import br.com.dio.gftspringwebrestapi.model.Usuario;
import br.com.dio.gftspringwebrestapi.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepositorio repository;

    @GetMapping("/users")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }
}
