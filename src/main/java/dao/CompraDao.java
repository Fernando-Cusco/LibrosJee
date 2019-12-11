package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Compra;

/**
 * 
 * @author fernandocuscomejia
 *
 */
public class CompraDao {
	@Inject
	private EntityManager em;
	
	/**
	 * 
	 * @param compra, guarda una compra
	 */
	public void crearCompra(Compra compra) {
		em.persist(compra);
	}
	
	/**
	 * 
	 * @param compra, actualizar una compra de la db
	 */
	public void actualizarCompra(Compra compra) {
		em.merge(compra);
	}
	
	/**
	 * 
	 * @param id, eliminar una compra
	 */
	public void eliminarCompra(int id) {
		em.remove(buscarCompra(id));
	}
	
	/**
	 * 
	 * @param id, busca una compra sobre la db
	 * @return
	 */
	public Compra buscarCompra(int id) {
		em.find(Compra.class, id);
		return null;
	}
}
