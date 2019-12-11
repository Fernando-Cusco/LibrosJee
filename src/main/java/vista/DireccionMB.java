package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Direccion;
import negocio.DireccionON;

/**
 * 
 * @author fernandocuscomejia
 *
 */
@ManagedBean
public class DireccionMB {
	
	private Direccion direccion;
	
	@Inject
	private DireccionON gestion;
	
	@PostConstruct
	public void init() {
		direccion = new Direccion();
	}

	/**
	 * 
	 * @return, creamos una direccion
	 */
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
