package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Autor;
import modelo.Libro;
import negocio.AutorON;

@ManagedBean
public class AutorMB {
	
	private Autor autor;
	
	@Inject
	private AutorON gestion;
	
	private List<Autor> autores;
	
	@PostConstruct
	public void init() {
		autor = new Autor();
		listar();
	}

	public void listar() {
		autores = gestion.listaAutores();
	}
	
	public String crear() {
		gestion.crearAutor(autor);
		autor = null;
		listar();
		return null;
	}
	
	
	public void agregarLibrosAutor() {
		
	}
	
	
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
}
