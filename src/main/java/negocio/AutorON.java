package negocio;

import java.util.List;

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
	
	public Autor buscarAutor(int id) {
		return autDao.buscarAutor(id);
	}
	
	public List<Autor> listaAutores() {
		return autDao.listarAutores();
	}
}
