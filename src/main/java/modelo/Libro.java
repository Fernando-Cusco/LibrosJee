package modelo;


import java.io.Serializable;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Entity
public class Libro implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "id")
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
	

	
	
	@JoinTable(
			name = "libros_autores",
			joinColumns = @JoinColumn(name = "fk_libro", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "fk_autot", nullable = false)
			)
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Autor> autores;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "libro")
//	private List<Voto> votos;
	
	
	@OneToOne
	@JoinColumn(name = "detalle_id")
	private Detalle detalle;
	
	
	public void addAuthor(Autor a) {
		System.out.println("AUTOR NUEVO "+a.toString());
		if (this.autores == null) {
			this.autores = new ArrayList<Autor>();
		}
		this.autores.add(a);
	}
	
	
	
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
	
//	public List<Categoria> getCategorias() {
//		return categorias;
//	}
//	public void setCategorias(List<Categoria> categorias) {
//		this.categorias = categorias;
//	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
//	
//	public List<Voto> getVotos() {
//		return votos;
//	}
//	public void setVotos(List<Voto> votos) {
//		this.votos = votos;
//	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public Detalle getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
	
	
//	/**
//	 * 
//	 * @param al, agregamos un libroautor 
//	 */
//	public void agregarLibroAutor(AutorLibro al) {
//		if(this.autoresLibros == null) {
//			this.autoresLibros = new ArrayList<AutorLibro>();
//		}
//		this.autoresLibros.add(al);
//	}
//	
//	/**
//	 * 
//	 * @param tl, agregamps un tipolibro 
//	 */
//	public void addTipoLibro(AutorLibro tl) {
//		if(this.autoresLibros==null)
//			this.autoresLibros = new ArrayList<>();
//		this.autoresLibros.add(tl);
//		
//	}
	

	
}
