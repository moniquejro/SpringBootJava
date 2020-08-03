package farmacia10.farmacia10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import farmacia10.farmacia10.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);

}
