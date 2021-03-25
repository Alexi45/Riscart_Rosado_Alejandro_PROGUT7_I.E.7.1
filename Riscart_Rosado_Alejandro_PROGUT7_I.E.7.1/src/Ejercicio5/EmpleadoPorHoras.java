package Ejercicio5;


/**
 * Clase empleado por horas.
 * 
 * @author Ale
 *
 */
public class EmpleadoPorHoras extends Empleado {

	private Double sueldoPorHoras;
	private Double horasTrabajadas;

	public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, Integer numSS, Double suledoPorHoras,
			Double horasTrabajadas) {
		super(primerNombre, apellidoPaterno, numSS);
		this.sueldoPorHoras = suledoPorHoras;
		this.horasTrabajadas = horasTrabajadas;
	}

	public Double getsSueldoPorHoras() {
		return sueldoPorHoras;
	}

	public void setSueldoPorHoras(Double suledoPorHoras) {
		if (sueldoPorHoras > 0) {
			this.sueldoPorHoras = suledoPorHoras;
		} else {
			System.err.println("[ERROR]: El sueldo por horas no puede ser negativo.");
		}
	}

	public Double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Double horasTrabajadas) {
		if (horasTrabajadas >= 0 && horasTrabajadas <= 168) {
			this.horasTrabajadas = horasTrabajadas;
		} else {
			System.err.println("[ERROR]: Las horas trabajadas no pueden ser inferiores a 0 ni superar 168.");
		}
	}

	public void obtener() {
		System.out.println("Sueldo por horas: " + sueldoPorHoras + ", horas trabajadas: " + horasTrabajadas);
	}

	/**
	 * Método para modificar las horas y el sueldo del trabajador.
	 * 
	 * @param sueldo
	 * @param horas
	 */
	public void establecer(Double sueldo, Double horas) {
		setHorasTrabajadas(horas);
		setSueldoPorHoras(sueldo);
	}

	@Override
	public void ingresos() {
		if (horasTrabajadas >= 40) {
			System.out.println("Sueldo: " + (sueldoPorHoras * horasTrabajadas));
		} else if (horasTrabajadas < 40) {
			Double x = horasTrabajadas - 40;
			x *= 1.5;
			System.out.println("Sueldo: " + ((horasTrabajadas + x) * sueldoPorHoras));
		}
	}

	@Override
	public String toString() {
		return "Sueldo por Horas: " + sueldoPorHoras + ", Horas Trabajadas: " + horasTrabajadas
				+ ", Primer Nombre: " + getPrimerNombre() + ", Apellido Paterno: " + getApellidoPaterno()
				+ ", NumSS: " + getNumSS();
	}
	
	

}
