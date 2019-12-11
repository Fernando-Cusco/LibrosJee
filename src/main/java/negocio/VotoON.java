package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.VotoDao;
import modelo.Voto;

/**
 * 
 * @author fernandocuscomejia
 *
 */
@Stateless
public class VotoON {
	
	@Inject
	private VotoDao votDao;
	
	
	/*CRUD VOTO*/
	/**
	 * 
	 * @param voto, llama al crear voto dao
	 */
	public void crearVoto(Voto voto) {
		votDao.crearVoto(voto);
	}
	
	/**
	 * 
	 * @param voto, llama al actualizar voto dao
	 */
	public void actualizarVoto(Voto voto) {
		votDao.actualizarVoto(voto);
	}
	
	/**
	 * 
	 * @param id, llama al eliminar voto dao
	 */
	public void eliminarVoto(int id) {
		votDao.eliminarVoto(id);
	}
	
	/**
	 * 
	 * @param id, llama al buscarVoto voto dao
	 */
	public void buscarVoto(int id) {
		votDao.buscarVoto(id);
	}

}
