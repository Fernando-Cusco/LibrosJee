package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Direccion;
import negocio.DireccionON;

@ManagedBean
public class DireccionMB {
	
	private Direccion direccion;
	
	@Inject
	private DireccionON gestion;
	
	@PostConstruct
	public void init() {
		direccion = new Direccion();
	}

	
	public String crear() {
		gestion.crearDireccion(direccion);
		return null;
	}
	
	
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
