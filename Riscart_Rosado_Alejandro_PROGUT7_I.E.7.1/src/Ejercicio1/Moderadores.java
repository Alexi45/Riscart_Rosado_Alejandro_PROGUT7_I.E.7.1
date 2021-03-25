package Ejercicio1;

/**
 * 
 * @author Ale
 *
 */
public class Moderadores extends Usuario {
/**
 * Clase moderadores herendando de la clase padre Usuario
 */
	static private int papelera = 0;

	public Moderadores() {
	
	}

	public Moderadores(String email, String nick) {
		super(email, nick);
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}

	public int getPapelera() {
		return papelera;
	}

//	public void mandarPapelera() {
//		++papelera;
//		decrementarMensaje();
//	}

}
