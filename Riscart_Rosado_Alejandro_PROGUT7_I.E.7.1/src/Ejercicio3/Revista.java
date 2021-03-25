package Ejercicio3;


/**
 * Clase Revista
 * 
 * @author Ale
 *
 */
public class Revista extends General {
	/**
	 * Atributos 
	 */
	private int numRevista;

	/**
	 * Constructor 
	 * 
	 * @param numRevista
	 * @param codigo
	 * @param titulo
	 * @param anoPublicacion
	 */
	public Revista(int numRevista, int codigo, String titulo, int anoPublicacion) {
		super(codigo, titulo, anoPublicacion);
		this.numRevista = numRevista;
	}

	public int getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}

	/**
	 * M�todo para saber el a�o de publicaci�n 
	 */
	@Override
	public void knowDate() {
		System.out.println("Esta revista se public� en el a�o " + getAnoPublicacion());
	}

	/**
	 * M�todo para obtener el c�digo 
	 */
	@Override
	public void knowCod() {
		System.out.println("El c�digo de esta revista es " + getCodigo());
		
	}

	@Override
	public String toString() {
		return "Numero Revista: " + numRevista + ", Codigo: " + getCodigo() + ", Titulo: " + getTitulo()
				+ ", A�o de Publicacion: " + getAnoPublicacion();
	}

}

