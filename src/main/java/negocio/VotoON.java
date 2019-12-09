package negocio;

import javax.inject.Inject;

import dao.VotoDao;
import modelo.Voto;

public class VotoON {
	
	@Inject
	private VotoDao votDao;
	
	
	/*CRUD VOTO*/
	public void crearVoto(Voto voto) {
		votDao.crearVoto(voto);
	}
	
	public void actualizarVoto(Voto voto) {
		votDao.actualizarVoto(voto);
	}
	
	public void eliminarVoto(int id) {
		votDao.eliminarVoto(id);
	}
	
	public void buscarVoto(int id) {
		votDao.buscarVoto(id);
	}

}
