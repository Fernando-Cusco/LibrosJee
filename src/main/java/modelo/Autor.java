package modelo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 
 * @author fernandocuscomejia
 *
 */

@Entity
@Table(name = "autores")
public class Autor{
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@NotNull
	@Size(min = 10, max = 25)
	private String nombres;
	
	
	@NotNull
	@Size(min = 5, max = 15)
	private String nacionalidad;
	
	@NotNull
	private int numeroPublicacion;
	
	@ManyToMany(mappedBy = "autores")
	private List<Libro> libros;

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

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	
	

//	public void agregarLibros(Libro libro) {
//		if(libros == null) {
//			libros = new ArrayList<>();
//		}
//		libros.add(libro);
//	}
//	

	

}
