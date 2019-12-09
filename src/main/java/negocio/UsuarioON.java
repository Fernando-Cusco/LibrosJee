package negocio;

import javax.inject.Inject;

import dao.UsuarioDao;
import modelo.Usuario;

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
	
	public void buscarUsuario(int id) {
		usuDao.buscarUsuario(id);
	}
}
