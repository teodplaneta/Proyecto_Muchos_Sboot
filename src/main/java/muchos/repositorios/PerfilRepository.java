package muchos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import muchos.modelo.entidades.Perfil;

public interface PerfilRepository  extends JpaRepository<Perfil, Integer>{

}
