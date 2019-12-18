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
/**
 * 
 * @author fernandocuscomejia
 *
 */
@ManagedBean
@ViewScoped
public class LibrosMB {
	
	private Libro libro=new Libro();
	private List<Libro> libros;
	
	
	@Inject
	private LibroON gestion;
	
	@Inject
	private AutorON gestiona;
	
	@PostConstruct
	public void init() {
		libros = gestion.getListadoLibrosAutor();
		
		listar();
	}
	
	
	/**
	 * 
	 * @return, creamos un libro
	 */
	public String crearLibro() {
		gestion.crearLibro(libro);
		libro = null;
		listar();
		return null;
	}
	
	/**
	 * Listamos los libros
	 */
	public void listar() {
		libros = gestion.listarLibros();
	}
	
	/**
	 * 
	 * @param id, eliminamos el libro
	 * @return
	 */
	public String eliminar(int id) {
		gestion.eliminarLibro(id);
		listar();
		return null;
	}
	
	/**
	 * Agregamos un autor al libro
	 */
	public void agregarAutorLibro() {
		libro.addAuthor(new Autor());
	}
	
	public String redirect() {
		return "";
	}
	
//	public String agregarCategoria() {
//		
//		libro.agregarCategoria(new Categoria());
//		return null;
//	}
	
	/**
	 * 
	 * @param al, buscamos un Autor, para agregar al libro
	 * @return
	 */
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
