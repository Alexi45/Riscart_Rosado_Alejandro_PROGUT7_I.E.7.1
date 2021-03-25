package Ejercicio2;

public class Profesor extends Persona {

	/**
	 * Atributos
	 */
	private boolean office = false;

	/**
	 * Constructor por defecto
	 */
	public Profesor() {
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param office
	 * @param name
	 * @param surname
	 * @param nif
	 * @param direction
	 */
	public Profesor(boolean office, String name, String surname, String nif, Direccion direction) {
		super(name, surname, nif, direction);
		this.office = office;
	}

	public boolean isOffice() {
		return office;
	}

	public void setOffice(boolean office) {
		this.office = office;
	}

	@Override
	public String toString() {
		return "office: " + office + ", Name:" + getName() + ", Surname: " + getSurname() + ", Nif: " + getNif()
				+ ", Direction(): " + getDirection();
	}

}