package com.BoasPraticas.pratica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BoasPraticas.pratica.model.postVeiculo;

@Repository
public interface praticaRepository  extends JpaRepository<postVeiculo, Long> {

	public List<postVeiculo> findAllByTipoContainingIgnoreCase (String tipo);
	public List<postVeiculo> findAllByModeloContainingIgnoreCase (String modelo);
	
}
