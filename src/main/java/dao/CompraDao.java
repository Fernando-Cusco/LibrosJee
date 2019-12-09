package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Compra;

public class CompraDao {
	@Inject
	private EntityManager em;
	
	public void crearCompra(Compra compra) {
		em.persist(compra);
	}
	
	public void actualizarCompra(Compra compra) {
		em.merge(compra);
	}
	
	public void eliminarCompra(int id) {
		em.remove(buscarCompra(id));
	}
	
	public Compra buscarCompra(int id) {
		em.find(Compra.class, id);
		return null;
	}
}
