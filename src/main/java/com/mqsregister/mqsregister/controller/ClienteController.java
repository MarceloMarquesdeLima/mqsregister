package com.mqsregister.mqsregister.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mqsregister.mqsregister.entity.Cliente;
import com.mqsregister.mqsregister.repository.ClienteRepository;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

	private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cliente> listar() {
        return (List<Cliente>) repository.findAll();
    }
    
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

}