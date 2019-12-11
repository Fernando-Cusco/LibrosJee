package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Autor;import modelo.Libro;

@Stateless
public class AutorDao {
	@Inject
	private EntityManager em;
	
	public void crearAutor(Autor autor) {
		em.persist(autor);
	}
	
	public void actualizarActor(Autor autor) {
		em.merge(autor);
	}
	
	public void eliminarAutor(int id) {
		em.remove(buscarAutor(id));
	}
	
//	public Autor buscarAutor(int id) {
//		return em.find(Autor.class, id);
//	}
	
	public Autor buscarAutor(int id) {
		String jpql = "SELECT a FROM Autor a JOIN FETCH a where a.id = :codigo";
		Query query = em.createQuery(jpql, Autor.class);
		query.setParameter("codigo", id);
		Autor autor = (Autor) query.getSingleResult();
		return autor;
	}
	
	public List<Autor> listarAutores() {
		String jpql = "select a from Autor a";
		Query query = em.createQuery(jpql, Autor.class);
		List<Autor> autorez = query.getResultList();
		return autorez;
	}
	public List<Autor> getAutoresLibros(){
		String jpql = "SELECT a FROM Autor a ";		
		Query query = em.createQuery(jpql, Autor.class);
		
		List<Autor> lista = query.getResultList();
		return lista;
	}
}
