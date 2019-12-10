package modelo;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "direcciones")
public class Direccion {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String ciudad;
	@NotNull
	private String calles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalles() {
		return calles;
	}
	public void setCalles(String calles) {
		this.calles = calles;
	}
	
	

}
