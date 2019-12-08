package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Autor;
import modelo.Categoria;
import modelo.Compra;
import modelo.Libro;
import modelo.Usuario;
import modelo.Voto;
import negocio.GestionLibroON;

@ManagedBean
public class LibrosMB {
	
	private Libro libro;
	private Autor autor;
	private Categoria categoria;
	private Usuario usuario;
	private Voto voto;
	private Compra compra;
	
	@Inject
	private GestionLibroON gestion;
	
	@PostConstruct
	public void init() {
		libro = new Libro();
		autor = new Autor();
		categoria = new Categoria();
		usuario = new Usuario();
		voto = new Voto();
		compra = new Compra();
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Voto getVoto() {
		return voto;
	}

	public void setVoto(Voto voto) {
		this.voto = voto;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public String crearLibro() {
		gestion.crearLibro(libro);
		return null;
	}
	
	public String crearCategoria() {
		System.out.println("MAB "+categoria.toString());
		gestion.crearCategoria(categoria);
		return null;
	}
	
	
}
