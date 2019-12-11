package modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author fernandocuscomejia
 *
 */

@Entity
public class Voto {
	
	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private int likes;
	
	@OneToOne
	@JoinColumn(name = "voto_id")
	private Cliente usuario;
//	@OneToOne
//	@JoinColumn(name = "libro_id")
//	private Libro libro;
	
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
	public Cliente getUsuario() {
		return usuario;
	}
	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}
//	public Libro getLibro() {
//		return libro;
//	}
//	public void setLibro(Libro libro) {
//		this.libro = libro;
//	}
//	@Override
//	public String toString() {
//		return "Voto [id=" + id + ", likes=" + likes + ", usuario=" + usuario + ", libro=" + libro + "]";
//	}
	
	

}
