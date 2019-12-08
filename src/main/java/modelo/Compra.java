package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "compras")
public class Compra implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@NotNull	
	private int cantidad;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "compra", referencedColumnName = "id")
	private List<Libro> libro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Libro> getLibro() {
		return libro;
	}
	public void setLibro(List<Libro> libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", cantidad=" + cantidad + ", usuario=" + usuario + ", libro="
				+ libro + "]";
	}
	
	
}
