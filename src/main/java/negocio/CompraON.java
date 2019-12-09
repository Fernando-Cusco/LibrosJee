package negocio;

import javax.inject.Inject;

import dao.CompraDao;
import modelo.Compra;

public class CompraON {

	@Inject
	private CompraDao comDao;
	
	/*CRUD COMPRAS*/
	public void crearCompra(Compra compra) {
		comDao.crearCompra(compra);
	}
	
	public void actualizarCompra(Compra compra) {
		comDao.actualizarCompra(compra);
	}
	
	public void eliminarCompra(int id) {
		comDao.eliminarCompra(id);
	}
	
	public void buscarCompra(int id) {
		comDao.buscarCompra(id);
	}
}
