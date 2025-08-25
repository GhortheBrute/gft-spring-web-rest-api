package br.com.dio.gftspringwebrestapi.controller;

import br.com.dio.gftspringwebrestapi.model.Usuario;
import br.com.dio.gftspringwebrestapi.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepositorio repository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getByUsername(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        repository.deleteById(id);
    }

    @PutMapping()
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
