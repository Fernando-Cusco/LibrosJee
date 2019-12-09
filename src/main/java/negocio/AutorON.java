package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.AutorDao;
import modelo.Autor;

@Stateless
public class AutorON {
	@Inject
	private AutorDao autDao;
	
	/*CRUD AUTORES*/
	public void crearAutor(Autor autor) {
		autDao.crearAutor(autor);
	}
	
	public void actualizarActor(Autor autor) {
		autDao.actualizarActor(autor);
	}
	
	public void eliminarAutor(int id) {
		autDao.eliminarAutor(id);
	}
	
	public void buscarAutor(int id) {
		autDao.buscarAutor(id);
	}
}
