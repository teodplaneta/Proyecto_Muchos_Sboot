package muchos.domain.producto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import muchos.domain.familia.Familia;

@AllArgsConstructor @NoArgsConstructor 
@Getter @Setter @EqualsAndHashCode(of = "codigoBarras")  
@Builder
@Entity
@Table(name="PRODUCTOS")
public class Producto {
	@Id
	@Column(name="CODIGO_BARRAS")
	private Long codigoBarras;
	private String  nombre;
	@Column(name="DESCRIPCION_LARGA")
	private  String  descripcionLarga;
	private  Integer stock;
	@Column(name="PRECIO_VENTA")
	private  Double precioVenta;
	@ManyToOne
	@JoinColumn(name="ID_FAMILIA")
	private  Familia familia;
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", descripcionLarga="
				+ descripcionLarga + ", stock=" + stock + ", precioVenta=" + precioVenta + ", familia=" + familia + "]";
	}
	
	
}
