package testeProjeto.testePro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testeProjeto.testePro.model.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	public List<Fornecedor> findAllByLojaContainingIgnoreCase (String loja);

}
