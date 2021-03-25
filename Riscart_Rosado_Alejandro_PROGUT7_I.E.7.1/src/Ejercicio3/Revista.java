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
	 * Método para saber el año de publicación 
	 */
	@Override
	public void knowDate() {
		System.out.println("Esta revista se publicó en el año " + getAnoPublicacion());
	}

	/**
	 * Método para obtener el código 
	 */
	@Override
	public void knowCod() {
		System.out.println("El código de esta revista es " + getCodigo());
		
	}

	@Override
	public String toString() {
		return "Numero Revista: " + numRevista + ", Codigo: " + getCodigo() + ", Titulo: " + getTitulo()
				+ ", Año de Publicacion: " + getAnoPublicacion();
	}

}

