package Ejercicio4;

import java.sql.Date;

/**
 * 
 * @author esmer
 *
 */
public class Escultura extends Obra {

	private String material;
	private Double altura;

	/**
	 * Constructor con herencia de la clase "Obra".
	 * 
	 * @param titulo
	 * @param numInvetario
	 * @param autor
	 * @param ano
	 * @param material
	 * @param altura
	 */
	public Escultura(String titulo, int numInve, String autor, String ano, String material, Double altura) {
		super(titulo, numInve, autor, ano);
		this.material = material;
		this.altura = altura;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	/**
	 * Método muestra.
	 */
	public String muestra() {
		return toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escultura other = (Escultura) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Material: " + material + ", Altura=" + altura + ", Titulo: " + getTitulo()
				+ ", NumInvetario: " + getNumInvetario() + ", Autor: " + getAutor() + ", Año: " + getAno();
	}

	
	
}