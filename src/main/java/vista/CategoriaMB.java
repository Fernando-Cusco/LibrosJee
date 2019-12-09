package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Categoria;
import negocio.CategoriaON;

@ManagedBean
public class CategoriaMB {
	
	
	private Categoria categoria;
	private List<Categoria> categorias;
	
	
	@Inject
	private CategoriaON gestion;
	
	@PostConstruct
	public void init() {
		categoria = new Categoria();
		listar();
	}

	
	public String crearCategoria() {
		gestion.crearCategoria(categoria);
		categoria = null;
		listar();
		return null;
	}
	
	public void listar() {
		categorias = gestion.listarCategorias();
	}
	
	
	public String eliminar(int id) {
		gestion.eliminarCategoria(id);
		listar();
		return null;
	}
	
	
	public String redirect() {
		return "categoriabuscar";
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
