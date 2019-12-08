package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Voto;;

public class VotoDao {
	@Inject
	private EntityManager em;
	
	public void crearVoto(Voto voto) {
		em.persist(voto);
	}
	
	public void actualizarVoto(Voto voto) {
		em.merge(voto);
	}
	
	public void eliminarVoto(int id) {
		em.remove(buscarVoto(id));
	}
	
	public Voto buscarVoto(int id) {
		em.find(Voto.class, id);
		return null;
	}
}
