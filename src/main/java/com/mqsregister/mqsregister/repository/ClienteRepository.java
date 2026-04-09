package com.mqsregister.mqsregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mqsregister.mqsregister.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente save(Cliente cliente);
}

