package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Libro;;


public class LibroDao {
	@Inject
	private EntityManager em;
	
	public void crearLibro(Libro libro) {
		em.persist(libro);
	}
	
	public void actualizarLibro(Libro libro) {
		em.merge(libro);
	}
	
	public void eliminarLibro(int id) {
		em.remove(buscarLibro(id));
	}
	
	public Libro buscarLibro(int id) {
		em.find(Libro.class, id);
		return null;
	}
}
