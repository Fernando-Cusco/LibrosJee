package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Autor;

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
	
	public Autor buscarAutor(int id) {
		em.find(Autor.class, id);
		return null;
	}
}
