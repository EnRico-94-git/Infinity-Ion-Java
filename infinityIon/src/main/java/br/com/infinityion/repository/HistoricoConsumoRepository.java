package br.com.infinityion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infinityion.model.Historico_Consumo;

public interface HistoricoConsumoRepository extends JpaRepository<Historico_Consumo, Integer> {
}
