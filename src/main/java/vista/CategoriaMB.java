package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Categoria;
import negocio.CategoriaON;

/**
 * 
 * @author fernandocuscomejia
 *
 */
@ManagedBean
public class CategoriaMB {
	
	private String id;
	private Categoria categoria;
	private List<Categoria> categorias;
	
	
	@Inject
	private CategoriaON gestion;
	
	@PostConstruct
	public void init() {
		categoria = new Categoria();
		listar();
		
	}

	/**
	 * 
	 * @return, llama al crear del On
	 */
	public String crearCategoria() {
		gestion.crearCategoria(categoria);
		categoria = null;
		listar();
		
		return null;
	}
	
	/**
	 * llama al listar del On
	 */
	public void listar() {
		categorias = gestion.listarCategorias();
	}
	
	/**
	 * 
	 * @param id, elimina unca categoria
	 * @return
	 */
	public String eliminar(int id) {
		gestion.eliminarCategoria(id);
		listar();
		return null;
	}
	
	/**
	 * Busca una categoria
	 */
	public void buscar() {
		System.out.println("BUSCANDO "+id);
		if( id != null) {
			categoria = gestion.buscarCategoria(Integer.parseInt(id));
		} else {
			return;
		}
	}
	
	/**
	 * 
	 * @param categoria, redirijimos para actualizar una categoria
	 * @return
	 */
	public String redirect(Categoria categoria) {
		System.out.println("ID: "+id);
		return "categoriabuscar?faces-redirect=true&id="+categoria.getId();
	}
	
	/**
	 * 
	 * @return, redirije a la anterior
	 */
	public String actualizar() {
		gestion.actualizarCategoria(categoria);
		return "categorias?faces-redirect=true";
	}

	
	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	
}
