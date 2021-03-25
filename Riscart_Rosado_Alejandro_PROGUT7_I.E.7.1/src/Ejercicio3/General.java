package Ejercicio3;

import java.sql.Date;
/**
 * Clase Abstracta
 * @author ale
 */

public abstract class General {

	private int codigo;
	private String titulo;
	private int anoPublicacion;

	/**
	 * Constructor 
	 * 
	 * @param codigo
	 * @param titulo
	 * @param anoPublicacion
	 */
	public General(int codigo, String titulo, int anoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	
	public abstract void knowCod();
	
	public abstract void knowDate();

}
