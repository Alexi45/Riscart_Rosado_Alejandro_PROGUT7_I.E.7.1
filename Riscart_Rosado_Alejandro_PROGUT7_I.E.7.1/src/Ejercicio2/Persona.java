package Ejercicio2;

public class Persona implements Humano {
	/**
	 * Atributos principales
	 */
	private String name;
	private String surname;
	private String nif;
	private Direccion direction;

	/**
	 * Constructor principal
	 * 
	 * @param name
	 * @param surname
	 * @param nif
	 * @param direction
	 */
	public Persona(String name, String surname, String nif, Direccion direction) {
		super();
		this.name = name;
		this.surname = surname;
		this.nif = nif;
		this.direction = direction;
	}

	public Persona() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Direccion getDirection() {
		return direction;
	}

	public void setDirection(Direccion direction) {
		this.direction = direction;
	}

	@Override
	public void identify(Persona p) {
		if (p instanceof Estudiante) {
			System.out.println("Su usuario es de tipo Estudiante");
		} else {
			System.out.println("Su usuario es de tipo Profesor");
		}
	}

}