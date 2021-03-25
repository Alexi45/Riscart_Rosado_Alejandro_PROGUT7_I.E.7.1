package Ejercicio1;

import java.util.Scanner;

/**
 * Clase padre usuario.
 * 
 * @author Ale
 *
 */
public class Usuario {

	Scanner sc = new Scanner(System.in);

	private int mensajes = 0;
	private String email;
	private String nick;
	private int papelera = 0;

	public Usuario() {

	}

	public Usuario(String email, String nick) {
		this.email = email;
		this.nick = nick;
	}

	public int getMensajes() {
		return mensajes;
	}

	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}

	public int getPapelera() {
		return papelera;
	}

	// Con este método vamos incrementar en 1 los mensajes.
	public void incrementarMensaje() {
		System.out.println("Mensajes incrementados con éxito");
		mensajes++;
	}

	// Con este método vamos decrementar en 1 los mensajes.
	public void decrementarMensaje() {
		System.out.println("Mensajes decrementados con éxito");
		mensajes--;
	}

	// Modificamos el email
	public void modificarEmail() {
		String nemail = null;
		try {
			System.out.println("Introduzca el email: ");
			nemail = sc.nextLine();
			setEmail(nemail);
		} catch (Exception e) {
			System.err.println("Dato invalido");
		}
	}

	// Mandamos mensaje a papelera
	public void mandarPapelera() {
		System.out.println("Mensaje mandado a la papelera");
		papelera++;
		mensajes--;
	}

	public void modificarNick() {
		try {
			System.out.println("Introduce el nuevo nombre: ");
			String name = sc.next();
			setNick(name);
		} catch (Exception e) {
			System.err.println("Dato invalido");
		}
	}

	@Override
	public String toString() {
		return "email: " + email + ", nick: " + nick + ", mensajes: " + mensajes + ", papelera: " + papelera;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + mensajes;
		result = prime * result + ((nick == null) ? 0 : nick.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mensajes != other.mensajes)
			return false;
		if (nick == null) {
			if (other.nick != null)
				return false;
		} else if (!nick.equals(other.nick))
			return false;
		return true;
	}

}
