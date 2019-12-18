package negocio;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.AutorDao;
import dao.LibroDao;
import modelo.Autor;
import modelo.Libro;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Stateless
public class LibroON {
	
	@Inject
	private LibroDao libDao;
	@Inject
	private AutorDao adao;
	

	/*CRUD LIBROS*/
	/**
	 * 
	 * @param libro, llama al crear libro dao
	 */
	public void crearLibro(Libro libro) {
		libDao.crearLibro(libro);
	}
	
	/**
	 * 
	 * @param libro, llama al actualizar libro dao
	 */
	public void actualizarLibro(Libro libro) {
		libDao.actualizarLibro(libro);
	}
	
	/**
	 * 
	 * @param id, llama al eliminar libro dao
	 */
	public void eliminarLibro(int id) {
		libDao.eliminarLibro(id);
	}
	
	/**
	 * 
	 * @param id, llama al buscarLibro libro dao
	 */
	public Libro buscarLibro(int id) {
		return libDao.buscarLibro(id);
	}
	
	/**
	 * 
	 * @return, llama al listar libro dao
	 */
	public List<Libro> listarLibros() {
		return libDao.listarLibros();
	}
	
	/**
	 * 
	 * @return, llama al listar libro dao
	 */
	public List<Libro> getListadoLibrosAutor(){
		return libDao.getLibrosAutor();
	}
	
	/**
	 * 
	 * @return, llama al listar libro dao
	 */
	public List<Autor> getListadoAutorLibros(){
		return adao.getAutoresLibros();
	}
}








