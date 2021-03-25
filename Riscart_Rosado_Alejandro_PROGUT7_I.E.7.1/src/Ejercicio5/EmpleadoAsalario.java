package Ejercicio5;


/**
 * Clase emplado asalariado.
 * 
 * @author Ale
 *
 */
public class EmpleadoAsalario extends Empleado {

	private Double salarioSemanal;

	public EmpleadoAsalario(String primerNombre, String apellidoPaterno, Integer numSS, Double salarioSemanal) {
		super(primerNombre, apellidoPaterno, numSS);
		this.salarioSemanal = salarioSemanal;
	}

	public Double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(Double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	/**
	 * Método para cambiar el valor del salario semanal.
	 * 
	 * @param salario
	 */
	public void establecer(Double salario) {
		setSalarioSemanal(salario);
	}

	/**
	 * Método heredado de Empleado.
	 */
	@Override
	public void ingresos() {
		System.out.println("El ingreso semanal es de : " + salarioSemanal + "€.");
	}

	@Override
	public String toString() {
		return "Salario Semanal=" + salarioSemanal + ", Nombre: " + getPrimerNombre()
				+ ", Apellido:" + getApellidoPaterno() + ", NumSS:" + getNumSS();
	}
	
	

}

