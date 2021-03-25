package Ejercicio4;

import java.sql.Date;

import org.junit.validator.PublicClassValidator;

/**
 * Clase artista
 * 
 * @author Ale
 *
 */
public class Artista {

	private String nombre;
	private String lugarNacimiento;
	private String fechaNacimiento;
	private String fechaMortalidad;

	public Artista(String nombre, String lugarNacimiento, String fechaNacimiento, String fechaMortalidad) {
		this.nombre = nombre;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaMortalidad = fechaMortalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaMortalidad() {
		return fechaMortalidad;
	}

	public void setFechaMortalidad(String fechaMortalidad) {
		this.fechaMortalidad = fechaMortalidad;
	}

}
