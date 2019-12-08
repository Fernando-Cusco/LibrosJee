package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "autores")
public class Autor {
	
	@Id
	private int id;
	
	@NotNull
	@Size(min = 10, max = 25)
	private String nombres;
	
	@NotNull
	@Size(min = 10, max = 25)
	private String apellidos;
	
	@NotNull
	@Size(min = 5, max = 15)
	private String nacionalidad;
	
	@NotNull
	private int numeroPublicacion;
	
	
	private List<Libro> libroList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getNumeroPublicacion() {
		return numeroPublicacion;
	}
	public void setNumeroPublicacion(int numeroPublicacion) {
		this.numeroPublicacion = numeroPublicacion;
	}
	public List<Libro> getLibroList() {
		return libroList;
	}
	public void setLibroList(List<Libro> libroList) {
		this.libroList = libroList;
	}
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nacionalidad="
				+ nacionalidad + ", numeroPublicacion=" + numeroPublicacion + ", libroList=" + libroList + "]";
	}
	
	

}
