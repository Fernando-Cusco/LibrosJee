package negocio;

import javax.ejb.Stateless;

import dao.AutorDao;
import dao.CategoriaDao;
import dao.CompraDao;
import dao.LibroDao;
import dao.UsuarioDao;
import dao.VotoDao;
import modelo.Autor;
import modelo.Categoria;
import modelo.Compra;
import modelo.Libro;
import modelo.Usuario;
import modelo.Voto;

@Stateless
public class GestionLibroON {
	
	private LibroDao libDao = new LibroDao();
	private AutorDao autDao = new AutorDao();
	private CategoriaDao catDao = new CategoriaDao();
	private CompraDao comDao = new CompraDao();
	private UsuarioDao usuDao = new UsuarioDao();
	private VotoDao votDao = new VotoDao();
	
	/*CRUD LIBROS*/
	public void crearLibro(Libro libro) {
		libDao.crearLibro(libro);
	}
	
	public void actualizarLibro(Libro libro) {
		libDao.actualizarLibro(libro);
	}
	
	public void eliminarLibro(int id) {
		libDao.eliminarLibro(id);
	}
	
	public void buscarLibro(int id) {
		libDao.buscarLibro(id);
	}
	
	/*CRUD AUTORES*/
	public void crearAutor(Autor autor) {
		autDao.crearAutor(autor);
	}
	
	public void actualizarActor(Autor autor) {
		autDao.actualizarActor(autor);
	}
	
	public void eliminarAutor(int id) {
		autDao.eliminarAutor(id);
	}
	
	public void buscarAutor(int id) {
		autDao.buscarAutor(id);
	}
	
	/*CRUD CATEGORIAS*/
	public void crearCategoria(Categoria categoria) {
		catDao.crearCategoria(categoria);
	}
	
	public void actualizarCategoria(Categoria categoria) {
		catDao.actualizarCategoria(categoria);
	}
	
	public void eliminarCategoria(int id) {
		catDao.eliminarCategoria(id);
	}
	
	public void buscarCategoria(int id) {
		catDao.buscarCategoria(id);
	}
	
	/*CRUD COMPRAS*/
	public void crearCompra(Compra compra) {
		comDao.crearCompra(compra);
	}
	
	public void actualizarCompra(Compra compra) {
		comDao.actualizarCompra(compra);
	}
	
	public void eliminarCompra(int id) {
		comDao.eliminarCompra(id);
	}
	
	public void buscarCompra(int id) {
		comDao.buscarCompra(id);
	}
	
	/*CRUD USUARIOS*/
	public void crearUsuario(Usuario usuario) {
		usuDao.crearUsuario(usuario);
	}
	
	public void actualizarUsuario(Usuario usuario) {
		usuDao.actualizarUsuario(usuario);
	}
	
	public void eliminarUsuario(int id) {
		usuDao.eliminarUsuario(id);
	}
	
	public void buscarUsuario(int id) {
		usuDao.buscarUsuario(id);
	}
	
	/*CRUD VOTO*/
	public void crearVoto(Voto voto) {
		votDao.crearVoto(voto);
	}
	
	public void actualizarVoto(Voto voto) {
		votDao.actualizarVoto(voto);
	}
	
	public void eliminarVoto(int id) {
		votDao.eliminarVoto(id);
	}
	
	public void buscarVoto(int id) {
		votDao.buscarVoto(id);
	}
}








