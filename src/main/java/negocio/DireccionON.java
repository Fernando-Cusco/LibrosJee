package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import dao.DireccionDao;
import modelo.Direccion;

@Stateless
public class DireccionON {
	
	@Inject
	private DireccionDao dicDao;
	
	public void crearDireccion(Direccion direccion) {
		dicDao.crearDireccion(direccion);
	}
	
	public void actualizar(Direccion direccion) {
		dicDao.actualizar(direccion);
	}
	
	public void eliminar(int id) {
		dicDao.eliminar(id);
	}
	
	public Direccion buscarDireccion(int id) {
		return dicDao.buscarDireccion(id);
	}
	
	public List<Direccion> listarDirecciones() {
		return dicDao.listarDirecciones();
	}
}
