package com.testep.testep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testep.testep.model.ProdutorM;

@Repository
public interface ProdutorMrepository extends JpaRepository<ProdutorM, Long> {
	public List<ProdutorM> findAllByfornecedorContainingIgnoreCase (String fornecedor);

}
