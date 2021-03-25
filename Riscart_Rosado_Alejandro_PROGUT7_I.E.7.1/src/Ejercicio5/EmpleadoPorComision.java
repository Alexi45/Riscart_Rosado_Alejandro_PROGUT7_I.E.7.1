package Ejercicio5;


/**
 * Clase empleado por comision.
 * 
 * @author Ale
 *
 */
public class EmpleadoPorComision extends Empleado {

	private Double volumenVentas;
	private Double tarifa;

	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, Integer numSS, Double volumenVentas,
			Double tarifa) {
		super(primerNombre, apellidoPaterno, numSS);
		this.volumenVentas = volumenVentas;
		this.tarifa = tarifa;
	}

	public Double getVolumenVentas() {
		return volumenVentas;
	}

	public void setVolumenVentas(Double volumenVentas) {
		this.volumenVentas = volumenVentas;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public void establecer(Double volumen, Double tarifa) {
		this.volumenVentas = volumen;
		this.tarifa = tarifa;
	}

	public void obtener() {
		System.out.println("Volumen de ventas: " + volumenVentas + ", tarifa: " + tarifa);
	}

	@Override
	public String toString() {
		return "volumenVentas:" + volumenVentas + ", tarifa:" + tarifa + ", Primer Nombre:"
				+ getPrimerNombre() + ", Apellido Paterno:" + getApellidoPaterno() + ", NumSS:" + getNumSS();
	}

	@Override
	public void ingresos() {
		System.out.println("Los ingresos son : " + tarifa * volumenVentas);
	}

}

