package Ejercicio5;

import java.util.spi.AbstractResourceBundleProvider;

/**
 * Clase padre abstracta
 * 
 * @author Ale
 *
 */
public abstract class Empleado {

	private String primerNombre;
	private String apellidoPaterno;
	private Integer numSS;

	public Empleado(String primerNombre, String apellidoPaterno, Integer numSS) {
		super();
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numSS = numSS;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public Integer getNumSS() {
		return numSS;
	}

	public void setNumSS(Integer numSS) {
		this.numSS = numSS;
	}

	/**
	 * Método para obtener los atributos.
	 * 
	 * @return
	 */
	public void obtener() {
		System.out.println("Nombre: " + primerNombre + "Apellido: " + apellidoPaterno + "Numero SS: " + numSS);
	}

	/**
	 * Métodop para modificar los atributos.
	 * 
	 * @param nombre
	 * @param apellido
	 * @param numSS
	 */
	public void establecer(String nombre, String apellido, Integer numSS) {
		setApellidoPaterno(apellido);
		setNumSS(numSS);
		setPrimerNombre(nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + primerNombre + "Apellido: " + apellidoPaterno + "Numero SS: " + numSS;
	}
	
	public abstract void ingresos();

}
