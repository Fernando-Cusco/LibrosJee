package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;

import modelo.Categoria;
import negocio.CategoriaON;

@ManagedBean
public class ActualizarMB {
	@ManagedProperty(value = "#{param.id}")
	private int id;
	
	
	
	private Categoria categoriaUpdate;
	
	@Inject
	private CategoriaON gestion;
	
	@PostConstruct
	public void init() {
		categoriaUpdate = new Categoria();
		buscar(id);
	}
	public String buscar(int id) {
		categoriaUpdate = gestion.buscarCategoria(id);
		return null;
	}
	public String actualizar() {
		System.out.println("ID "+id);
		Categoria c = gestion.buscarCategoria(id);
		if(c != null) {
			gestion.actualizarCategoria(c);
		}
		return "categorias";
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categoria getCategoriaUpdate() {
		return categoriaUpdate;
	}

	public void setCategoriaUpdate(Categoria categoriaUpdate) {
		this.categoriaUpdate = categoriaUpdate;
	}
	
	
}
