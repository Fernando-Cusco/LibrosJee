package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import dao.DireccionDao;
import modelo.Direccion;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Stateless
public class DireccionON {
	
	@Inject
	private DireccionDao dicDao;
	
	/**
	 * 
	 * @param direccion, llama al crear direccion dao
	 */
	public void crearDireccion(Direccion direccion) {
		dicDao.crearDireccion(direccion);
	}
	
	/**
	 * 
	 * @param direccion, llama al actualizar direccion dao
	 */
	public void actualizar(Direccion direccion) {
		dicDao.actualizar(direccion);
	}
	
	/**
	 * 
	 * @param id, llama al eliminar direccion dao
	 */
	public void eliminar(int id) {
		dicDao.eliminar(id);
	}
	
	/**
	 * 
	 * @param id, llama al crear direccion dao
	 * @return, devuelve una Direccion encontrada
	 */
	public Direccion buscarDireccion(int id) {
		return dicDao.buscarDireccion(id);
	}
	
	/**
	 * 
	 * @return, llama al listar direccion dao
	 */
	public List<Direccion> listarDirecciones() {
		return dicDao.listarDirecciones();
	}
}
