package vista;



import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Libro;
import negocio.LibroON;

@ManagedBean
public class LibrosMB {
	
	private Libro libro;
	private List<Libro> libros;
	
	@Inject
	private LibroON gestion;
	
	@PostConstruct
	public void init() {
		libro = new Libro();
		listar();
	}
	
	
	
	public String crearLibro() {
		gestion.crearLibro(libro);
		libro = null;
		listar();
		return null;
	}
	
	public void listar() {
		libros = gestion.listarLibros();
	}
	

	public List<Libro> getLibros() {
		return libros;
	}



	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}



	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	
	
}
