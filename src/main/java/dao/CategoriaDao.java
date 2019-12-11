package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Categoria;;


/**
 * 
 * @author fernandocuscomejia
 *
 */
public class CategoriaDao {
	@Inject
	private EntityManager em;
	
	/**
	 * 
	 * @param categoria, guarda una categoria sobre la db.
	 */
	public void crearCategoria(Categoria categoria) {
		System.out.println("DAO "+categoria.toString());
		em.persist(categoria);
	}
	
	/**
	 * 
	 * @param categoria, actualizar una categoria de la db.
	 */
	public void actualizarCategoria(Categoria categoria) {
		em.merge(categoria);
	}
	
	/**
	 * 
	 * @param id, elimina una categoria por su id
	 */
	public void eliminarCategoria(int id) {
		em.remove(buscarCategoria(id));
	}
	
	/**
	 * 
	 * @param id, buscar una categoria por su id
	 * @return, devuelve una categoria
	 */
	public Categoria buscarCategoria(int id) {
		return em.find(Categoria.class, id);
	}
	
	/**
	 * 
	 * @return, devuelve todas ls categoria de la lista
	 */
	public List<Categoria> listarCategorias() {
		String jpql = "select c  from Categoria c";
		Query query = em.createQuery(jpql, Categoria.class);
		return query.getResultList();
	}
}
