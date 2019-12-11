package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.AutorDao;
import modelo.Autor;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Stateless
public class AutorON {
	@Inject
	private AutorDao autDao;
	
	/*CRUD AUTORES*/
	/**
	 * 
	 * @param autor, llamamos al metodo para crear un autor dao
	 */
	public void crearAutor(Autor autor) {
		autDao.crearAutor(autor);
	}
	
	/**
	 * 
	 * @param autor, llamamos al metodo para actualizar un autor dao
	 */
	public void actualizarActor(Autor autor) {
		autDao.actualizarActor(autor);
	}
	
	/**
	 * 
	 * @param id, llamamos al metodo para eliminar un autor dao
	 */
	public void eliminarAutor(int id) {
		autDao.eliminarAutor(id);
	}
	
	/**
	 * 
	 * @param id, llamamos al metodo para buscar un autor dao
	 * @return, devuelve un Autor
	 */
	public Autor buscarAutor(int id) {
		return autDao.buscarAutor(id);
	}
	
	/**
	 * 
	 * @return, llamamos al metodo para listar todos los autores dao
	 */
	public List<Autor> listaAutores() {
		return autDao.listarAutores();
	}
}
