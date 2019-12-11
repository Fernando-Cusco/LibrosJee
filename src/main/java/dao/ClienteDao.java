package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Cliente;

public class ClienteDao {
	@Inject
	private EntityManager em;
	
	public void crearUsuario(Cliente usuario) {
		em.persist(usuario);
	}
	
	public void actualizarUsuario(Cliente usuario) {
		em.merge(usuario);
	}
	
	
	public void eliminarUsuario(int id) {
		em.remove(buscarUsuario(id));
	}
	
//	public Cliente buscarUsuario(int id) {
//		return em.find(Cliente.class, id);
//	}
	
	public Cliente buscarUsuario(int id) {
		String jpql = "SELECT c FROM Cliente c JOIN FETCH c where c.id = :codigo";
		Query query = em.createQuery(jpql, Cliente.class);
		query.setParameter("codigo", id);
		Cliente cliente = (Cliente) query.getSingleResult();
		return cliente;
	}
	
	public List<Cliente> listarUsuarios() {
		String jpql= "select u from Cliente u";
		Query query = em.createQuery(jpql, Cliente.class);
		List<Cliente> clientez = query.getResultList();
		for(Cliente c: clientez) {
			c.getDirecciones().size();
		}
		return clientez;
	}
	
	
	public String login(String correo, String password) {
		String flag = "";
		String jpql = "select c from Cliente c where c.correo = :correo and c.password = :password";
		Query query = em.createQuery(jpql, Cliente.class);
		query.setParameter("correo", correo);
		query.setParameter("password", password);
		try {
			Cliente cliente = (Cliente) query.getSingleResult();
			if(cliente != null) {
				if(cliente.isPermisoAdministrador()) {
					flag = "admin";
				} else {
					flag = "cliente";
				}
			} else {
				flag = "Datos Incorrectos";
			}
		} catch (NoResultException e) {
			// TODO: handle exception
		}
		return flag;
	}
	
}
