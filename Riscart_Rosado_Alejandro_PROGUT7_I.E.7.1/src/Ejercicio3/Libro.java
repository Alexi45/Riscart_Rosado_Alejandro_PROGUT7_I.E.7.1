package Ejercicio3;


import java.sql.Date;
import java.util.Map;

/**
 * Clase Libro
 * 
 * @author Ale
 *
 */
public class Libro extends General implements Prestable {
	/**
	 * Atributo principal de la clase
	 */
	private boolean prestado = false;

	/**
	 * Constructor 
	 * 
	 * @param codigo
	 * @param titulo
	 * @param anoPublicacion
	 * @param prestado
	 */
	public Libro(int codigo, String titulo, int anoPublicacion) {
		super(codigo, titulo, anoPublicacion);
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	/**
	 * Método para saber el año de publicación
	 */
	@Override
	public void knowDate() {
		System.out.println("Esta libro se publicó en el año " + getAnoPublicacion());
	}

	/**
	 * Método para obtener el código 
	 */
	@Override
	public void knowCod() {
		System.out.println("El código de este libro es " + getCodigo());
	}

	@Override
	public String toString() {
		return "Codigo: " + getCodigo() + ", Titulo: " + getTitulo() + ", Año de Publicacion: " + getAnoPublicacion()
				+ ", prestado: " + prestado;
	}

	@Override
	/**
	 * Método que cambia el estado del libro a prestado
	 */
	public void prestar() {
		setPrestado(true);
		System.out.println("El libro ha sido prestado!!");
		System.out.println("Disfrutalo!!!");
	}

	/**
	 * Método que cambia el estado del libro a devuelto
	 */
	@Override
	public void devolver() {
		setPrestado(false);
		System.out.println("El libro ha sido devuelto!!");
	}

	/**
	 * Método para saber si un libro está prestado
	 */
	@Override
	public boolean prestado() {
		if (prestado == true) {
			return true;
		}else {
			return false;
		}
	}
}

