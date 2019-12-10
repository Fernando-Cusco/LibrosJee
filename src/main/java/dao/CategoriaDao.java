package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Categoria;;


public class CategoriaDao {
	@Inject
	private EntityManager em;
	
	public void crearCategoria(Categoria categoria) {
		System.out.println("DAO "+categoria.toString());
		em.persist(categoria);
	}
	
	public void actualizarCategoria(Categoria categoria) {
		em.merge(categoria);
	}
	
	public void eliminarCategoria(int id) {
		em.remove(buscarCategoria(id));
	}
	
	public Categoria buscarCategoria(int id) {
		return em.find(Categoria.class, id);
	}
	
	public List<Categoria> listarCategorias() {
		String jpql = "select c  from Categoria c";
		Query query = em.createQuery(jpql, Categoria.class);
		return query.getResultList();
	}
}
