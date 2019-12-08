package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Column(length = 10)
	private String cedula;
	
	@NotNull
	private String nombres;
	
	@NotNull
	private String apellidos;
	
	@NotNull
	private String correo;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@NotNull
	private String password;
	
	private boolean permisoCliente;
	
	private boolean permisoAdministrador;
	
	@NotNull
	private String Preferencia;
	
	
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public boolean isPermisoCliente() {
		return permisoCliente;
	}
	public void setPermisoCliente(boolean permisoCliente) {
		this.permisoCliente = permisoCliente;
	}
	public boolean isPermisoAdministrador() {
		return permisoAdministrador;
	}
	public void setPermisoAdministrador(boolean permisoAdministrador) {
		this.permisoAdministrador = permisoAdministrador;
	}
	public String getPreferencia() {
		return Preferencia;
	}
	public void setPreferencia(String preferencia) {
		Preferencia = preferencia;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + ", password=" + password
				+ ", permisoCliente=" + permisoCliente + ", permisoAdministrador=" + permisoAdministrador
				+ ", Preferencia=" + Preferencia + "]";
	}
	
}
