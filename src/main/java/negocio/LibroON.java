package negocio;


import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.LibroDao;
import modelo.Libro;


@Stateless
public class LibroON {
	
	@Inject
	private LibroDao libDao;
	

	/*CRUD LIBROS*/
	public void crearLibro(Libro libro) {
		libDao.crearLibro(libro);
	}
	
	public void actualizarLibro(Libro libro) {
		libDao.actualizarLibro(libro);
	}
	
	public void eliminarLibro(int id) {
		libDao.eliminarLibro(id);
	}
	
	public void buscarLibro(int id) {
		libDao.buscarLibro(id);
	}
	
}








