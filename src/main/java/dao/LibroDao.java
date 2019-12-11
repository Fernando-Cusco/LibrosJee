package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Libro;;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Stateless
public class LibroDao {
	@Inject
	private EntityManager em;
	
	/**
	 * 
	 * @param libro, guarda un libro sobre la db.
	 */
	public void crearLibro(Libro libro) {
		em.persist(libro);
	}
	
	/**
	 * 
	 * @param libro, actualiza un libro
	 */
	public void actualizarLibro(Libro libro) {
		em.merge(libro);
	}
	
	/**
	 * 
	 * @param id, elimina un libro por su id
	 */
	public void eliminarLibro(int id) {
		em.remove(buscarLibro(id));
	}
	
	/**
	 * 
	 * @param id, busca un libro
	 * @return, devuelve un libro
	 */
	public Libro buscarLibro1(int id) {
		return em.find(Libro.class, id);
	}
	
	/**
	 * 
	 * @param id, busca un libro por su id
	 * @return, devuelve un libro encontrado
	 */
	public Libro buscarLibro(int id) {
		String jpql = "SELECT l FROM Libro l JOIN FETCH l where l.id = :codigo";
		Query query = em.createQuery(jpql, Libro.class);
		query.setParameter("codigo", id);
		Libro libro = (Libro) query.getSingleResult();
		return libro;
	}
	
	/**
	 * 
	 * @return, devuelve una lista de libros
	 */
	public List<Libro> listarLibros() {
		String jpql = "select l from Libro l";
		Query query = em.createQuery(jpql, Libro.class);
		List<Libro> libroz = query.getResultList();
//		for(Libro l: libroz) {
//			l.getAutores().size();
//		}
		return libroz;
	}
	
	/**
	 * 
	 * @return, devolvemos una lista de librosautores
	 */
	public List<Libro> getLibrosAutor(){
		String jpql = "SELECT l FROM Libro l ";
		
		Query q = em.createQuery(jpql, Libro.class);
		
		List<Libro> libros = q.getResultList();
		
		return libros;
	}
	
	/**
	 * 
	 * @return, devuelve una lista de libros tipo
	 */
	public List<Libro> getLibrosTipo(){
		String jpql = "SELECT l FROM Libro l ";
		
		Query q = em.createQuery(jpql, Libro.class);
		
		List<Libro> libros = q.getResultList();
		for (Libro libro : libros) {
		libro.getAutoresLibros().size();
		}
		
		return libros;
	}
	
}
