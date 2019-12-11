package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
		return em.find(Libro.class, id);
	}
	
	public Libro buscarLibros(int id) {
		String jpql = "SELECT l FROM Libro l JOIN FETCH l where l.id = :codigo";
		Query query = em.createQuery(jpql, Libro.class);
		query.setParameter("codigo", id);
		Libro libro = (Libro) query.getSingleResult();
		return libro;
	}
	
	public List<Libro> listarLibros() {
		String jpql = "select l from Libro l";
		Query query = em.createQuery(jpql, Libro.class);
		List<Libro> libroz = query.getResultList();
		for(Libro l: libroz) {
			l.getAutores().size();
		}
		return libroz;
	}
	
}
