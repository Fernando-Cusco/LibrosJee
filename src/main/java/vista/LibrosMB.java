package vista;



import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import modelo.Autor;
import modelo.AutorLibro;
import modelo.Categoria;
import modelo.Libro;
import negocio.AutorON;
import negocio.LibroON;

@ManagedBean
@ViewScoped
public class LibrosMB {
	
	private Libro libro=new Libro();
	private List<Libro> libros;
	private List<Autor> listadoAutoresLibros;
	
	@Inject
	private LibroON gestion;
	
	@Inject
	private AutorON gestiona;
	
	@PostConstruct
	public void init() {
		libros = gestion.getListadoLibrosAutor();
		listadoAutoresLibros=gestion.getListadoAutorLibros();
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
	
	public String eliminar(int id) {
		gestion.eliminarLibro(id);
		listar();
		return null;
	}
	
	public void agregarAutorLibro() {
		libro.agregarLibroAutor(new AutorLibro());
	}
	
	public String redirect() {
		return "";
	}
	
//	public String agregarCategoria() {
//		
//		libro.agregarCategoria(new Categoria());
//		return null;
//	}
	
	
	public String buscarAutor(AutorLibro al) {
		System.out.println(al.getTemp()+" AUTORLIBRO");
		try {
			Autor at = gestiona.buscarAutor(al.getTemp());
			al.setAutor(at);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
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
