package Ejercicio2;

public class Estudiante extends Persona {
	/**
	 * Unico atributo de la clase
	 */
	private int id;

	/**
	 * Constructor por defecto
	 */
	public Estudiante() {

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param id
	 * @param name
	 * @param surname
	 * @param nif
	 * @param direction
	 */
	public Estudiante(int id, String name, String surname, String nif, Direccion direction) {
		super(name, surname, nif, direction);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=: " + id + ", Name: " + getName() + ", Surname: " + getSurname() + ", Nif: " + getNif()
				+ ", Direction:" + getDirection();
	}

}