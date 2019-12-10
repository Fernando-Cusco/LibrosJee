package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Autor;
import negocio.AutorON;

@ManagedBean
public class AutorMB {
	
	private Autor autor;
	
	@Inject
	private AutorON gestion;
	
	@PostConstruct
	public void init() {
		autor = new Autor();
	}

	
	public String crear() {
		gestion.crearAutor(autor);
		return null;
	}
	
	
	
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
