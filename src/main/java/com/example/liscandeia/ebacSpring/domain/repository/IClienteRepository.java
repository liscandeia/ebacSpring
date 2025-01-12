package com.example.liscandeia.ebacSpring.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.liscandeia.ebacSpring.domain.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{
}
