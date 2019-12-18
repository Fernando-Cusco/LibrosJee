package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.ClienteDao;
import modelo.Cliente;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Stateless
public class ClienteON {

	@Inject
	private ClienteDao usuDao;
	
	/*CRUD USUARIOS*/
	/**
	 * 
	 * @param usuario, llamamos al metodo para crear usuario dao
	 */
	public void crearUsuario(Cliente usuario) {
		usuDao.crearUsuario(usuario);
	}
	
	/**
	 * 
	 * @param usuario, llamamos al metodo para actualizar usuario dao
	 */
	public void actualizarUsuario(Cliente usuario) {
		usuDao.actualizarUsuario(usuario);
	}
	
	/**
	 * 
	 * @param id, llamamos al metodo para eliminar usuario dao
	 */
	public void eliminarUsuario(int id) {
		usuDao.eliminarUsuario(id);
	}
	
	/**
	 * 
	 * @param id, llamamos al metodo para buscar un usuario dao
	 * @return, devuelve una categoria
	 */
	public Cliente buscarUsuario(int id) {
		return usuDao.buscar(id);
	}
	
	/**
	 * 
	 * @return, llamamos al metodo para listar usuario dao
	 */
	public List<Cliente> listaUsuarios() {
		return usuDao.listarUsuarios();
	}
	
	/**
	 * 
	 * @param correo, llama al login del dao para autentificar el usuario
	 * @param password
	 * @return
	 */
	public String login(String correo, String password) {
		return usuDao.login(correo, password);
	}
}
