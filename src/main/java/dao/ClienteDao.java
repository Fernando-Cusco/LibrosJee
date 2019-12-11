package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Cliente;

/**
 * 
 * @author fernandocuscomejia
 *
 */
public class ClienteDao {
	@Inject
	private EntityManager em;
	
	/**
	 * 
	 * @param usuario, guarda un usuario sobre la db.
	 */
	public void crearUsuario(Cliente usuario) {
		em.persist(usuario);
	}
	
	/**
	 * 
	 * @param usuario, actualiza un cliente
	 */
	public void actualizarUsuario(Cliente usuario) {
		em.merge(usuario);
	}
	
	/**
	 * 
	 * @param id, elimina un cliente por su id
	 */
	public void eliminarUsuario(int id) {
		em.remove(buscarUsuario(id));
	}
	

	/**
	 * 
	 * @param id, busca un cliente por el id
	 * @return, devuelve el cliente encontrado
	 */
	public Cliente buscarUsuario(int id) {
		String jpql = "SELECT c FROM Cliente c JOIN FETCH c where c.id = :codigo";
		Query query = em.createQuery(jpql, Cliente.class);
		query.setParameter("codigo", id);
		Cliente cliente = (Cliente) query.getSingleResult();
		return cliente;
	}
	
	/**
	 * 
	 * @return, devuelve la lista de clientes de la db.
	 */
	public List<Cliente> listarUsuarios() {
		String jpql= "select u from Cliente u";
		Query query = em.createQuery(jpql, Cliente.class);
		List<Cliente> clientez = query.getResultList();
		for(Cliente c: clientez) {
			c.getDirecciones().size();
		}
		return clientez;
	}
	
	/**
	 * 
	 * @param correo, parametros para el login de usuario
	 * @param password
	 * @return, devuelve el tipo de usuario que es.
	 */
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
