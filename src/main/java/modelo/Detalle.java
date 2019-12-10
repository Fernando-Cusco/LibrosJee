package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
public class Detalle {
	
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private int cantidad;
	
	
	@OneToOne
	@JoinColumn(name = "detalle_id")
	private Libro libro;
	
	@OneToOne
	@JoinColumn(name = "detalle_id")
	private Compra compra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
}
