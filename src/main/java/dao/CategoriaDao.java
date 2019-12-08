package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Categoria;;

public class CategoriaDao {
	@Inject
	private EntityManager em;
	
	public void crearCategoria(Categoria categoria) {
		em.persist(categoria);
	}
	
	public void actualizarCategoria(Categoria categoria) {
		em.merge(categoria);
	}
	
	public void eliminarCategoria(int id) {
		em.remove(buscarCategoria(id));
	}
	
	public Categoria buscarCategoria(int id) {
		em.find(Categoria.class, id);
		return null;
	}
}
