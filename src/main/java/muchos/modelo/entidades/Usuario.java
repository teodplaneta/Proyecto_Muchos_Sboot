package muchos.modelo.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor 
@Getter @Setter @EqualsAndHashCode(of = "idUsuario") 
@Builder
@Entity
@Table(name="USUARIOS")
public class Usuario {
	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String  email;
	private String  password;
	private String  nombre;
	private String  apellidos;
	private Integer enabled;
	@ManyToOne
	@JoinColumn(name="ID_PERFIL")
	private Perfil  perfil;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
				name="FAVORITOS"
				, joinColumns = @JoinColumn(name="ID_USUARIO")
				, inverseJoinColumns = @JoinColumn(name="CODIGO_BARRAS")
			)
	private List<Producto> favoritos;
	
	public void addProducto(Producto producto) {
		if (favoritos == null)
			favoritos = new ArrayList<>();
		if (!favoritos.contains(producto))
			favoritos.add(producto);
	}
	
	public void eliminarProducto(Producto producto) {
		if (favoritos != null)
			favoritos.remove(producto);
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", password=" + password + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", enabled=" + enabled + ", perfil=" + perfil + ", favoritos="
				+ favoritos + "]";
	}
	
	

}
