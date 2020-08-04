package com.minhaRedeSocial.minhaRedeSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaRedeSocial.minhaRedeSocial.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);

}
