package muchos.domain.familia;

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
@Getter @Setter @EqualsAndHashCode(of = "idFamilia") 
@Builder
@Entity
@Table(name="FAMILIAS")
public class Familia {
	@Id
	@Column(name="ID_FAMILIA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFamilia;
	private String descripcion;
	@Override
	public String toString() {
		return "Familia [idFamilia=" + idFamilia + ", descripcion=" + descripcion + "]";
	}
	
	
}
