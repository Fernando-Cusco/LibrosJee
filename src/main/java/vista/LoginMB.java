package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;


import negocio.ClienteON;

@ManagedBean
public class LoginMB {

	private String correo;
	private String password;
	private String mensaje;
	
	
	@Inject
	private ClienteON login;
	
	@PostConstruct
	public void init() {
		correo = new String();
		password = new String();
		mensaje = new String();
	}
	
	public String login() {
		mensaje = login.login(correo, password);
		return "";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
