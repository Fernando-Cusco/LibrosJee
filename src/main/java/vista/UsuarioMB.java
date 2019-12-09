package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Usuario;
import negocio.UsuarioON;

@ManagedBean
public class UsuarioMB {
	
	private Usuario usuario;
	private List<Usuario> usuarios;
	
	@Inject
	private UsuarioON gestion;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
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
	
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
