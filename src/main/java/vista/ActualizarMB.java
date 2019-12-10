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
	
	
	private Categoria categoria;
	
	@Inject
	private CategoriaON gestion;
	
	@PostConstruct
	public void init() {
		categoria = new Categoria();
		buscar();
	}
	public String buscar() {
		categoria = gestion.buscarCategoria(this.id);
		return null;
	}
	public String actualizar() {
		//Categoria
		categoria = gestion.buscarCategoria(this.id);
		System.out.println(this.id);
		if(categoria != null) {
			gestion.actualizarCategoria(categoria);
		}
		return "categorias";
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
