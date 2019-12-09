package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.UsuarioDao;
import modelo.Usuario;
@Stateless
public class UsuarioON {

	@Inject
	private UsuarioDao usuDao;
	
	/*CRUD USUARIOS*/
	public void crearUsuario(Usuario usuario) {
		usuDao.crearUsuario(usuario);
	}
	
	public void actualizarUsuario(Usuario usuario) {
		usuDao.actualizarUsuario(usuario);
	}
	
	public void eliminarUsuario(int id) {
		usuDao.eliminarUsuario(id);
	}
	
	public Usuario buscarUsuario(int id) {
		return usuDao.buscarUsuario(id);
	}
	
	public List<Usuario> listaUsuarios() {
		return usuDao.listarUsuarios();
	}
}
