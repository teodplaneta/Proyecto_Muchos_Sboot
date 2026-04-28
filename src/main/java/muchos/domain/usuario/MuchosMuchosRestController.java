package muchos.domain.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import muchos.domain.producto.Producto;
import muchos.domain.producto.ProductoRepository;

@RestController
@CrossOrigin(origins = "*")
public class MuchosMuchosRestController {
	@Autowired
	private UsuarioRepository urepo;
	
	@Autowired
	private ProductoRepository prepo;
	
	@GetMapping("/usuarios")
	
	public List<Usuario> usuarios(){
		return urepo.findAll();
	}
	
	@GetMapping("/favorito-alta/{idUsuario}/{codigoBarras}")
	
	public String altaFavorito(@PathVariable Integer idUsuario, 
									@PathVariable Long codigoBarras){
		Usuario usuario = urepo.findById(idUsuario).orElse(null);
		Producto producto = prepo.findById(codigoBarras).orElse(null);
		
		usuario.addProducto(producto);
		urepo.save(usuario);
		return "favorito salvado";
		
		
	
	}
	
@GetMapping("/favorito-elim/{idUsuario}/{codigoBarras}")
	
	public String deleteFavorito(@PathVariable Integer idUsuario, 
									@PathVariable Long codigoBarras){
		Usuario usuario = urepo.findById(idUsuario).orElse(null);
		Producto producto = prepo.findById(codigoBarras).orElse(null);
		
		usuario.eliminarProducto(producto);
		urepo.save(usuario);
		return "favorito eliminado";
		
		
	
	}
}
