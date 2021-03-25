package Ejercicio4;

import java.sql.Date;

/**
 * 
 * @author esmer
 *
 */
public class Pinturas extends Obra {

	private double superficie;
	private String soporte;

	/**
	 * Constructor con herencia de la clase Obra.
	 * 
	 * @param titulo
	 * @param numInvetario
	 * @param autor
	 * @param ano
	 * @param altura
	 * @param anchura
	 * @param soporte
	 */
	public Pinturas(String titulo, int numInve, String autor, String ano, double superficie, String soporte) {
		super(titulo, numInve, autor, ano);
		this.superficie = superficie;
		this.soporte = soporte;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((soporte == null) ? 0 : soporte.hashCode());
		long temp;
		temp = Double.doubleToLongBits(superficie);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/**
	 * Método muestra.
	 */
	public String muestra() {
		return toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pinturas other = (Pinturas) obj;
		if (soporte == null) {
			if (other.soporte != null)
				return false;
		} else if (!soporte.equals(other.soporte))
			return false;
		if (Double.doubleToLongBits(superficie) != Double.doubleToLongBits(other.superficie))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Superficie: " + superficie + ", Soporte: " + soporte + ", Titulo: " + getTitulo() + ", NumInvetario: "
				+ getNumInvetario() + ", Autor: " + getAutor() + ", Año: " + getAno();
	}

}
