package Ejercicio5;


import Ejercicio3.BMain;

/**
 * Clase empleado base mas comision.
 * 
 * @author Ale
 *
 */
public class EmpleadoBaseMasComision extends Empleado {

	private Double volumenVentas;
	private Double tarifaComision;
	private Double salarioBase = 1500.0;

	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, Integer numSS, Double volumenVentas,
			Double tarifaComision) {
		super(primerNombre, apellidoPaterno, numSS);
		this.volumenVentas = volumenVentas;
		this.tarifaComision = tarifaComision;
	}

	public Double getVolumenVentas() {
		return volumenVentas;
	}

	public void setVolumenVentas(Double volumenVentas) {
		this.volumenVentas = volumenVentas;
	}

	public Double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(Double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void establecer(Double volumenVetnas, Double tarifa) {
		setVolumenVentas(volumenVetnas);
		setTarifaComision(tarifa);
		
	}
	
	public void obtener() {
		System.out.println("Volumen de ventas: " + volumenVentas + ", Tarifa: " + tarifaComision + "Salario: " + salarioBase);
	}
	
	
	@Override
	public String toString() {
		return "Volumen Ventas:" + volumenVentas + ", Tarifa Comision:" + tarifaComision
				+ ", Salario Base:" + salarioBase + ", Primer Nombre:" + getPrimerNombre()
				+ ", Apellido Paterno:" + getApellidoPaterno() + ", NumSS:" + getNumSS();
	}

	@Override
	public void ingresos() {
		System.out.println("Los ingresos son: " + (tarifaComision * volumenVentas) + salarioBase);
	}
	
	

}