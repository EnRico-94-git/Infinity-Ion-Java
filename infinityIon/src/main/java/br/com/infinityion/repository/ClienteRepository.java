package br.com.infinityion.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infinityion.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
