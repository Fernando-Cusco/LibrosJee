package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.ClienteDao;
import modelo.Cliente;
@Stateless
public class ClienteON {

	@Inject
	private ClienteDao usuDao;
	
	/*CRUD USUARIOS*/
	public void crearUsuario(Cliente usuario) {
		usuDao.crearUsuario(usuario);
	}
	
	public void actualizarUsuario(Cliente usuario) {
		usuDao.actualizarUsuario(usuario);
	}
	
	public void eliminarUsuario(int id) {
		usuDao.eliminarUsuario(id);
	}
	
	public Cliente buscarUsuario(int id) {
		return usuDao.buscarUsuario(id);
	}
	
	public List<Cliente> listaUsuarios() {
		return usuDao.listarUsuarios();
	}
}
