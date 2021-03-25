package Ejercicio4;


import java.sql.Date;

/**
 * Clase de las obras artísticas
 * 
 * @author esmer
 *
 */
public class Obra {

	private String titulo;
	private int numInvetario;
	private String autor;
	private String ano;

	public Obra(String titulo, int numInve, String autor, String ano) {
		super();
		this.titulo = titulo;
		this.numInvetario = numInve;
		this.autor = autor;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumInvetario() {
		return numInvetario;
	}

	public void setNumInvetario(int numInvetario) {
		this.numInvetario = numInvetario;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}

