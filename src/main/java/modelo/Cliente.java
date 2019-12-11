package modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min = 10, max = 10)
	@Column(length = 10)
	private String cedula;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String nombres;
	@NotNull
	@Size(min = 7, max = 20)
	private String password;

	
	@NotNull
	@Email
	private String correo;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	
	private boolean permisoAdministrador;
	
	private String telefono;
	
	
	private boolean temporal;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "voto_id")
	private List<Voto> votos;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "direcciones_id")
	private List<Direccion> direcciones;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isPermisoAdministrador() {
		return permisoAdministrador;
	}
	public void setPermisoAdministrador(boolean permisoAdministrador) {
		this.permisoAdministrador = permisoAdministrador;
	}
	
	public boolean isTemporal() {
		return temporal;
	}
	public void setTemporal(boolean temporal) {
		this.temporal = temporal;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	
	/**
	 * 
	 * @param direccion, agrega una direccion al cliente
	 */
	public void agregarDireccion(Direccion direccion) {
		System.out.println("DIRECCION: "+direccion.toString());
		if(direcciones == null) {
			direcciones = new ArrayList<Direccion>();
		}
		this.direcciones.add(direccion);
	}
	
	
}
