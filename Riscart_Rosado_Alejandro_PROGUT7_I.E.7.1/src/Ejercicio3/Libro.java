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
	 * M�todo para saber el a�o de publicaci�n
	 */
	@Override
	public void knowDate() {
		System.out.println("Esta libro se public� en el a�o " + getAnoPublicacion());
	}

	/**
	 * M�todo para obtener el c�digo 
	 */
	@Override
	public void knowCod() {
		System.out.println("El c�digo de este libro es " + getCodigo());
	}

	@Override
	public String toString() {
		return "Codigo: " + getCodigo() + ", Titulo: " + getTitulo() + ", A�o de Publicacion: " + getAnoPublicacion()
				+ ", prestado: " + prestado;
	}

	@Override
	/**
	 * M�todo que cambia el estado del libro a prestado
	 */
	public void prestar() {
		setPrestado(true);
		System.out.println("El libro ha sido prestado!!");
		System.out.println("Disfrutalo!!!");
	}

	/**
	 * M�todo que cambia el estado del libro a devuelto
	 */
	@Override
	public void devolver() {
		setPrestado(false);
		System.out.println("El libro ha sido devuelto!!");
	}

	/**
	 * M�todo para saber si un libro est� prestado
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

