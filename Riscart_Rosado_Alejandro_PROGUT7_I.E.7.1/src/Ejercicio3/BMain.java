package Ejercicio3;

import java.util.HashMap;
import java.util.Map;
public class BMain {

	public static void main(String[] args) {

		Map<Integer, Libro> libros = new HashMap<>();
		Map<Integer, Revista> revistas = new HashMap<>();

		libros.put(1010, new Libro(1010, "Charles you are p1", 2012));
		libros.put(1011, new Libro(1011, "Detective esqueleto", 2009));
		libros.put(1012, new Libro(1012, "El elfo oscuro", 2004));
		revistas.put(3030, new Revista(1, 3030, "el hereje", 2020));
		revistas.put(3045, new Revista(2, 3045, "cazador de sombras", 2019));
		revistas.put(3060, new Revista(3, 3060, "la vida es belle", 1999));
		Biblioteca n = new Biblioteca(libros, revistas);
		n.acceso();
	}

}


