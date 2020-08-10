package farmacia10.farmacia10.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import farmacia10.farmacia10.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario); //refere-se ao atributo usuario, na model Usuario

}
