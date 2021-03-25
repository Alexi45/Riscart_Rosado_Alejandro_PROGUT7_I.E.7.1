package Ejercicio3;


import java.util.Map;
import java.util.Scanner;

import org.junit.validator.PublicClassValidator;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

import org.junit.validator.PublicClassValidator;

/**
 * Clase para la implementación de métodos.
 * 
 * @author Ale
 *
 */
public class Biblioteca {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Libro> libros;
	Map<Integer, Revista> revistas;

	public Biblioteca(Map<Integer, Libro> libros, Map<Integer, Revista> revistas) {
		super();
		this.libros = libros;
		this.revistas = revistas;
	}

	/**
	 * Método para saber los libros que están prestados
	 * 
	 * @param g
	 */
	public void cuentaPrestados() {
		System.out.println("Libros prestados ");
		libros.values().stream().filter(l -> l.prestado() == true).map(l -> l.toString()).forEach(System.out::println);

	}

	/**
	 * Método para obtener los titulos de libros y revistas publicaciones antes de
	 * la fecha indicada.
	 * 
	 */
	public void publicacionesAnteriores() {
		System.out.println("Introduzca año ");
		int ano = sc.nextInt();
		System.out.println("Las publicaciones publicadas antes de " + ano + " son: ");
		libros.values().stream().filter(l -> l.getAnoPublicacion() < ano).map(l -> l.toString())
				.forEach(System.out::println);

		revistas.values().stream().filter(l -> l.getAnoPublicacion() < ano).map(l -> l.toString())
				.forEach(System.out::println);

	}

	/**
	 * Método para terminar el programa
	 */
	public void exit() {
		System.out.println("Adios");
		System.exit(1);
	}

	/**
	 * Método para mostrar todos los datos
	 */
	public void mostrarDatos() {
		libros.values().stream().forEach(System.out::println);
		revistas.values().stream().forEach(System.out::println);
	}

	/**
	 * Método prestar los libros
	 */
	public void prestarLibro() {
		try {
			System.out.println("Libros disponibles");
			libros.values().stream().filter(l -> l.prestado() == false).map(l -> l.toString())
					.forEach(System.out::println);
			System.out.println("Ponga codigo del libro ");
			int num = sc.nextInt();
			Libro l = libros.get(num);
			l.prestar();

		} catch (Exception e) {
			System.err.println("Error");
		}
	}

	/**
	 * Método devolver los libros
	 */
	public void devolverLibro() {
		try {
			System.out.println("Libros para devolver");
			libros.values().stream().filter(l -> l.prestado() == true).map(l -> l.toString())
					.forEach(System.out::println);
			System.out.println("Ponga codigo del libro ");
			int num = sc.nextInt();
			Libro l = libros.get(num);
			l.devolver();

		} catch (Exception e) {
			System.err.println("Error");
		}
	}

	/**
	 * Método para generalizar el programa.
	 */
	public void acceso() {
		do {
			menu();
			int num = sc.nextInt();
			switch (num) {
			case 1:
				mostrarDatos();
				break;
			case 2:
				prestarLibro();
				break;
			case 3:
				devolverLibro();
				break;
			case 4:
				cuentaPrestados();
				break;
			case 5:
				publicacionesAnteriores();
				break;
			case 6:
				exit();
			}
		} while (true);

	}

	/**
	 * Método con el menú
	 */
	private void menu() {
		System.out.println("Buenas");
		System.out.println("Qué operación desea realizar: ");
		System.out.println("1. Mostrar los datos");
		System.out.println("2. Prestar u  libro");
		System.out.println("3. Devolver libro");
		System.out.println("4. Mostrar libros prestados");
		System.out.println("5. Mostrar publicaciones ");
		System.out.println("6. Salir");
	}

}
