package modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class AutorLibro {
	
	@Id
	@GeneratedValue
	int id;
	@NotNull
	@OneToOne
	private Autor autor;
	@NotNull
	@OneToOne
	private Libro libro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	

}