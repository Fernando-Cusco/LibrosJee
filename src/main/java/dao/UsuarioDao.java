package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Usuario;

public class UsuarioDao {
	@Inject
	private EntityManager em;
	
	public void crearUsuario(Usuario usuario) {
		em.persist(usuario);
	}
	
	public void actualizarUsuario(Usuario usuario) {
		em.merge(usuario);
	}
	
	public void eliminarUsuario(int id) {
		em.remove(buscarUsuario(id));
	}
	
	public Usuario buscarUsuario(int id) {
		em.find(Usuario.class, id);
		return null;
	}
	
	public List<Usuario> listarUsuarios() {
		String jpql= "select u from Usuario u";
		Query query = em.createQuery(jpql, Usuario.class);
		return query.getResultList();
	}
}
