package restful;



import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import modelo.Libro;
import negocio.LibroON;

@Path("libros")
public class ApiService {
	
	@Inject
	private LibroON srv;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Libro> obtenerLibros() {
		List<Libro> libros = new ArrayList<Libro>();
		try {
			libros = this.srv.listarLibros();
		} catch (Exception e) {
			libros.add(null);
		}
		return libros;
	}
	
	@GET
	@Path("/buscar")
	@Produces({MediaType.APPLICATION_JSON})
	public Libro buscar(@QueryParam("id") int id) {
		Libro l = new Libro();
		try {
			l = srv.buscarLibro(id);
		} catch (Exception e) {
			System.out.println("ERROR "+e.getMessage());
			l = null;
		}
		return l;
	}
	
}
