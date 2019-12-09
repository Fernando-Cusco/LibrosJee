package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "votos")
public class Voto implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private int likes;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Libro libro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Voto [id=" + id + ", likes=" + likes + ", usuario=" + usuario + ", libro=" + libro + "]";
	}
	
	

}
