package vista;



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Libro;
import negocio.LibroON;

@ManagedBean
public class LibrosMB {
	
	private Libro libro;
	
	@Inject
	private LibroON gestion;
	
	@PostConstruct
	public void init() {
		libro = new Libro();
		
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	
	
}
