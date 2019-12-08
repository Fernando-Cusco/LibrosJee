package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "votos")
public class Voto {
	
	@Id
	private int id;

	@NotNull
	private int likes;
	
	@NotNull
	private Usuario usuario;
	
	@NotNull
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
