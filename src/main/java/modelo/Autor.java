package modelo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
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
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "autor_id")
	private List<AutorLibro> autoresLibros;

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

	
	

	public List<AutorLibro> getAutoresLibros() {
		return autoresLibros;
	}

	public void setAutoresLibros(List<AutorLibro> autoresLibros) {
		this.autoresLibros = autoresLibros;
	}

//	public void agregarLibros(Libro libro) {
//		if(libros == null) {
//			libros = new ArrayList<>();
//		}
//		libros.add(libro);
//	}
//	

	

}
