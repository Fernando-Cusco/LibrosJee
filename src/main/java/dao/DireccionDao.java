package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Direccion;

/**
 * 
 * @author fernandocuscomejia
 *
 */
public class DireccionDao {
	
	@Inject
	private EntityManager em;
	
	/**
	 * 
	 * @param direccion, crear una direccion sobre la db.
	 */
	public void crearDireccion(Direccion direccion) {
		em.persist(direccion);
	}
	
	/**
	 * 
	 * @param direccion, actualizar una direccion
	 */
	public void actualizar(Direccion direccion) {
		em.merge(direccion);
	}
	
	/**
	 * 
	 * @param id, elimina una direccion de la db.
	 */
	public void eliminar(int id) {
		em.remove(buscarDireccion(id));
	}
	
	/**
	 * 
	 * @param id, busca una direccion
	 * @return, devuelve un direccion de la db.
	 */
	public Direccion buscarDireccion(int id) {
		return em.find(Direccion.class, id);
	}
	
	/**
	 * 
	 * @return, devuelve una lista de direcciones
	 */
	public List<Direccion> listarDirecciones() {
		String jpql = "select d  from Direccion d";
		Query query = em.createQuery(jpql, Direccion.class);
		return query.getResultList();
	}
	
}
