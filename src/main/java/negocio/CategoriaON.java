package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.CategoriaDao;
import modelo.Categoria;

/**
 * 
 * @author fernandocuscomejia
 *
 */
@Stateless
public class CategoriaON {
	
	@Inject
	private CategoriaDao catDao;

	/*CRUD CATEGORIAS*/
	/**
	 * 
	 * @param categoria, llamamos al metodo para crear categoria dao
	 */
	public void crearCategoria(Categoria categoria) {
		catDao.crearCategoria(categoria);
	}
	
	/**
	 * 
	 * @param categoria, llamamos al metodo para actualizar categoria dao
	 */
	public void actualizarCategoria(Categoria categoria) {
		catDao.actualizarCategoria(categoria);
	}
	
	/**
	 * 
	 * @param id, llamamos al metodo para eliminar categoria dao
	 */
	public void eliminarCategoria(int id) {
		catDao.eliminarCategoria(id);
	}
	
	/**
	 * 
	 * @param id, llamamos al metodo para buscar categoria dao
	 * @return, devuelve una categoria encontrada
	 */
	public Categoria buscarCategoria(int id) {
		return catDao.buscarCategoria(id);
	}
	
	/**
	 * 
	 * @return, llamamos al metodo para listar categoria dao
	 */
	public List<Categoria> listarCategorias() {
		return catDao.listarCategorias();
	}
}
