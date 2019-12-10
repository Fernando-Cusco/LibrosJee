package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Direccion;

public class DireccionDao {
	
	@Inject
	private EntityManager em;
	
	public void crearDireccion(Direccion direccion) {
		em.persist(direccion);
	}
	
	public void actualizar(Direccion direccion) {
		em.merge(direccion);
	}
	
	public void eliminar(int id) {
		em.remove(id);
	}
	
	public Direccion buscarDireccion(int id) {
		return em.find(Direccion.class, id);
	}
	
	public List<Direccion> listarDirecciones() {
		String jpql = "select d  from Direccion d";
		Query query = em.createQuery(jpql, Direccion.class);
		return query.getResultList();
	}
	
}
