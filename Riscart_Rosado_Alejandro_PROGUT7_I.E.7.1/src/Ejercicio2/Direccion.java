package Ejercicio2;

public class Direccion {

	/**
	 * Atributos principales
	 */
	private String calleString;
	private String ciudad;
	private int cp;
	private String pais;

	/**
	 * Constructor vacío
	 */
	public Direccion() {

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param calleString
	 * @param ciudad
	 * @param cp
	 * @param pais
	 */
	public Direccion(String calleString, String ciudad, int cp, String pais) {
		this.calleString = calleString;
		this.ciudad = ciudad;
		this.cp = cp;
		this.pais = pais;
	}

}