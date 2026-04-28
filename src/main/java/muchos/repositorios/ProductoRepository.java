package muchos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import muchos.modelo.entidades.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Long>{

}
