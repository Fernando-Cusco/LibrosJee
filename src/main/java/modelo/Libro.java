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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "libros")
public class Libro implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String descripcion;
	
	@Size(min = 5, max = 20)
	private String titulo;
	
	
	private String portada;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechaPublicacion;
	
	@NotNull
	private int paginas;
	
	@NotNull
	private Double precio;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "libro", referencedColumnName = "id")
	private List<Categoria> categoria;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public List<Categoria> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", descripcion=" + descripcion + ", titulo=" + titulo + ", portada=" + portada
				+ ", fechaPublicacion=" + fechaPublicacion + ", paginas=" + paginas + ", precio=" + precio
				+ ", categoria=" + categoria + "]";
	}
	
	

}
