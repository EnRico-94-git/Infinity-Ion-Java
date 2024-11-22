package br.com.infinityion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infinityion.model.Solucao;

public interface SolucaoRepository extends JpaRepository<Solucao, Integer> {
}
