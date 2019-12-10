package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;


import modelo.Cliente;
import modelo.Direccion;
import negocio.ClienteON;
import negocio.DireccionON;

@ManagedBean
@ViewScoped
public class ClienteMB {
	
	private String id;
	private String direccion;
	private Cliente usuario;
	private List<Cliente> usuarios;
	private List<Direccion> direcciones;
	
	@Inject
	private ClienteON gestion;
	@Inject
	private DireccionON direc;
	
	
	@PostConstruct
	public void init() {
		usuario = new Cliente();
		direcciones = direc.listarDirecciones();
		listar();
	}

	
	public String crearUsuario() {
		gestion.crearUsuario(usuario);
		usuario = null;
		listar();
		return null;
	}
	
	public void listar() {
		usuarios = gestion.listaUsuarios();
	}
	
	public void buscar() {
		if( id != null) {
			usuario = gestion.buscarUsuario(Integer.parseInt(id));
		} else {
			return;
		}
	}
	
	public String eliminar(int id) {
		gestion.eliminarUsuario(id);
		System.out.println("id------ "+id);
		listar();
		return null;
	}
	
	public String actualizar() {
		gestion.actualizarUsuario(usuario);
		return "cliente?faces-redirect=true";
	}
	
	
	public String redirect(Cliente usuario) {
		return "clientebuscar?faces-redirect=true&id="+usuario.getId();
	}
	
	public void agregarDirecciones() {
		usuario.agregarDireccion(new Direccion());
		
	}
	
	public String guardar() {
		return null;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}


	public List<Cliente> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Cliente> usuarios) {
		this.usuarios = usuarios;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<Direccion> getDirecciones() {
		return direcciones;
	}


	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	
	

}
