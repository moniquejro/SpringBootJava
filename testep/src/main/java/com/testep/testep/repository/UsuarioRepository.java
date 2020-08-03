package com.testep.testep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.testep.testep.model.UsuarioM;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioM, Long>{
	public List<UsuarioM> findAllBynomeContainingIgnoreCase (String nome);

}
