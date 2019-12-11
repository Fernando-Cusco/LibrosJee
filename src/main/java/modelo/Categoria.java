package modelo;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Categoria{
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min = 5, max = 15)
	private String nombre;
	
//	@OneToOne
//	@JoinColumn(name = "libros_id")
//	@JsonIgnore
//	private Libro libro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//	public Libro getLibro() {
//		return libro;
//	}
//	public void setLibro(Libro libro) {
//		this.libro = libro;
//	}
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
	public void addLibros() {
		
	}

}
