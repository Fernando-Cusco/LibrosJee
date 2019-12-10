package modelo;


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
public class Libro{
	
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
	
	@NotNull
	private int stock;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "libro", referencedColumnName = "id")
	private List<Categoria> categoria;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "libro", referencedColumnName = "id")
	private List<AutorLibro> autores;
	
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "libro", referencedColumnName = "id")
	private List<Voto> votos;
	
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public List<AutorLibro> getAutores() {
		return autores;
	}
	public void setAutores(List<AutorLibro> autores) {
		this.autores = autores;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	
	
}
