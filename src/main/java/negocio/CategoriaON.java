package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.CategoriaDao;
import modelo.Categoria;

@Stateless
public class CategoriaON {
	
	@Inject
	private CategoriaDao catDao;

	/*CRUD CATEGORIAS*/
	public void crearCategoria(Categoria categoria) {
		catDao.crearCategoria(categoria);
	}
	
	public void actualizarCategoria(Categoria categoria) {
		catDao.actualizarCategoria(categoria);
	}
	
	public void eliminarCategoria(int id) {
		catDao.eliminarCategoria(id);
	}
	
	public Categoria buscarCategoria(int id) {
		return catDao.buscarCategoria(id);
	}
	
	public List<Categoria> listarCategorias() {
		return catDao.listarCategorias();
	}
}
