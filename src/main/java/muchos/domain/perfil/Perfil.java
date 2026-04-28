package muchos.domain.perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor 
@Getter @Setter @EqualsAndHashCode(of = "idPerfil")  
@Builder
@Entity
@Table(name="PERFILES")
public class Perfil{
	@Id
	@Column(name="ID_PERFIL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPerfil;
	private String nombre;
	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + "]";
	}
	
	

}
