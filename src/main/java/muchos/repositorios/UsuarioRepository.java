package muchos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import muchos.modelo.entidades.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{

}
