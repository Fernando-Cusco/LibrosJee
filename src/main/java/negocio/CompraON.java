package negocio;

import javax.inject.Inject;

import dao.CompraDao;
import modelo.Compra;

/**
 * 
 * @author fernandocuscomejia
 *
 */
public class CompraON {

	@Inject
	private CompraDao comDao;
	
	/*CRUD COMPRAS*/
	/**
	 * 
	 * @param compra, llama al crear compra dao
	 */
	public void crearCompra(Compra compra) {
		comDao.crearCompra(compra);
	}
	
	/**
	 * 
	 * @param compra, llama al actualizar compra dao
	 */
	public void actualizarCompra(Compra compra) {
		comDao.actualizarCompra(compra);
	}
	
	/**
	 * 
	 * @param id, llama al eliminar compra dao
	 */
	public void eliminarCompra(int id) {
		comDao.eliminarCompra(id);
	}
	
	/**
	 * 
	 * @param id, llama al buscar compra compra dao
	 */
	public void buscarCompra(int id) {
		comDao.buscarCompra(id);
	}
}
