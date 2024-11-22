package br.com.infinityion.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.infinityion.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
