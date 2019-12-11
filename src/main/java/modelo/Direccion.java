package modelo;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Entity
public class Direccion {

	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private String ciudad;
	@NotNull
	private String calles;

	@OneToOne
	@JoinColumn(name = "direcciones_id")
	@JsonIgnore
	private Cliente cliente;

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", ciudad=" + ciudad + ", calles=" + calles + ", cliente=" + cliente + "]";
	}
	
	
}
