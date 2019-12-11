package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Voto;;

/**
 * 
 * @author fernandocuscomejia
 *
 */
public class VotoDao {
	@Inject
	private EntityManager em;
	
	/**
	 * 
	 * @param voto, guarda un voto
	 */
	public void crearVoto(Voto voto) {
		em.persist(voto);
	}
	
	/**
	 * 
	 * @param voto, actualiza un voto
	 */
	public void actualizarVoto(Voto voto) {
		em.merge(voto);
	}
	
	/**
	 * 
	 * @param id, elimina un voto por el id
	 */
	public void eliminarVoto(int id) {
		em.remove(buscarVoto(id));
	}
	
	/**
	 * 
	 * @param id, buscar un voto por el id
	 * @return, devuelve el voto encontrado
	 */
	public Voto buscarVoto(int id) {
		em.find(Voto.class, id);
		return null;
	}
}
