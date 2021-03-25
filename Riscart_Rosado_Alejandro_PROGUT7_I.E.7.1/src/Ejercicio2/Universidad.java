package Ejercicio2;

import static org.hamcrest.CoreMatchers.instanceOf;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import org.junit.validator.PublicClassValidator;

import Ejercicio1.Moderadores;

/**
 * Clase Universidad para crear y montar todos los métodos restantes.
 * 
 * @author esmer
 *
 */
public class Universidad {

	Scanner sc = new Scanner(System.in);
	Map<String, Estudiante> estudiante;
	Map<String, Profesor> profesor;

	public Universidad(Map<String, Estudiante> estudi, Map<String, Profesor> profesor) {
		this.estudiante = estudi;
		this.profesor = profesor;
	}

	/**
	 * En este método vamos a agrupar el resto de los métodos.
	 */
	public void acces() {
		System.out.println("---->BIENVENIDO<----");
		System.out.println("En que tipo de cuenta desea acceder: ");
		System.out.println("1.- Estudiante");
		System.out.println("2.- Profesor");
		System.out.println("3.- Salir");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			estudiante();
			break;
		case 2:
			profesor();
			break;
		default:
			exit();
		}
	}

	/**
	 * Método para la opción de salir.
	 */
	public void exit() {
		System.out.println("HASTA PRONTO!!!");
		System.exit(1);
	}

	/**
	 * Método general para el estudiante.
	 */
	public void estudiante() {
		// Vamos a pedir a usuario que nos introduzca el dni para poder saber cual es su
		// cuenta.
		System.out.println("Introduzca su dni: ");
		String n = sc.next();
		// TODO: no mete el valor del objeto
		Estudiante estudi = estudiante.get(n);
		do {
			if (estudi != null) {
				System.out.println("-->Bienvenido " + estudi.getName() + "<--");
				System.out.println("Qué operación desea realizar: ");
				System.out.println("1.- Ver datos");
				System.out.println("2.- Ver tipo de clase");
				System.out.println("3.- Añadir usuario");
				System.out.println("4.- Eliminar usuario");
				System.out.println("5.- Salir");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					showPerson(estudi);
					break;
				case 2:
					shoyIdentity(estudi);
					break;
				case 3:
					addPersona(estudi);
					break;
				case 4:
					removePersona(estudi);
					break;
				default:
					exit();
				}

			} else {
				System.err.println("[ERROR]: Usuario incorrecto");
				exit();
			}
		} while (true);
	}

	/**
	 * Método para mostrar personas
	 */
	public void showPerson(Persona p) {
		if (p instanceof Estudiante) {
			estudiante.values().stream().forEach(System.out::println);
		} else {
			profesor.values().stream().forEach(System.out::println);
		}
	}

	/**
	 * Método para añadir cualquier tipo de persona.
	 * 
	 * @param p
	 */
	public void addPersona(Persona p) {
		if (p instanceof Estudiante) {
			try {
				System.out.println("Introduzca su dni: ");
				String nif = sc.next();
				System.out.println("Introduzca su nombre: ");
				String nom = sc.next();
				System.out.println("Introduzca su apellido: ");
				String ape = sc.next();
				System.out.println("Introduzca su id de estudiante: ");
				int id = sc.nextInt();
				System.out.println("Introduzca su direccion: ");
				System.out.println("Calle: ");
				String c = sc.next();
				System.out.println("Ciudad: ");
				String ciudad = sc.next();
				System.out.println("Codigo postal: ");
				int cp = sc.nextInt();
				System.out.println("Pais: ");
				String pais = sc.next();
				estudiante.values().parallelStream().findAny().filter(l -> l.getNif().equals(nif))
						.ifPresentOrElse(l -> {
							System.out.println("Lo sentimos el correo seleccionado ya está en uso!!");
						}, () -> {
							Direccion d = new Direccion(c, ciudad, cp, pais);
							estudiante.put(nif, new Estudiante(id, nom, ape, nif, d));
						});
			} catch (Exception e) {
				System.err.println("[ERROR]: Ha introducido algún valor erróneo.");
				exit();
			}
		} else {
			try {
				System.out.println("Introduzca su dni: ");
				String nif = sc.next();
				System.out.println("Introduzca su nombre: ");
				String nom = sc.next();
				System.out.println("Introduzca su apellido: ");
				String ape = sc.next();
				System.out.println("Introduzca si tiene despacho(true - false): ");
				Boolean office = sc.nextBoolean();
				System.out.println("Introduzca su direccion: ");
				System.out.println("Calle: ");
				String c = sc.next();
				System.out.println("Ciudad: ");
				String ciudad = sc.next();
				System.out.println("Codigo postal: ");
				int cp = sc.nextInt();
				System.out.println("Pais: ");
				String pais = sc.next();
				profesor.values().parallelStream().findAny().filter(l -> l.getNif().equals(nif)).ifPresentOrElse(l -> {
					System.out.println("Lo sentimos el correo seleccionado ya está en uso!!");
				}, () -> {
					Direccion d = new Direccion(c, ciudad, cp, pais);
					profesor.put(nif, new Profesor(office, nom, ape, nif, d));
				});
			} catch (Exception e) {
				System.err.println("[ERROR]: Ha introducido algún valor erróneo.");
				exit();
			}
		}
	}

	/**
	 * Método para eliminar cualquier persona
	 */
	public void removePersona(Persona p) {
		if (p instanceof Estudiante) {
			System.out.println("Introduce el dni del usuario que desea eliminar: ");
			String dni = sc.next();
			estudiante.remove(dni);
		} else {
			System.out.println("Introduce el dni del usuario que desea eliminar: ");
			String dni = sc.next();
			profesor.remove(dni);
		}
	}

	/**
	 * Método general para el estudiante.
	 */
	public void profesor() {
		// Vamos a pedir a usuario que nos introduzca el dni para poder saber cual es su
		// cuenta.
		System.out.println("Introduzca su dni: ");
		String nif = sc.next();
		Profesor prof = profesor.get(nif);
		do {
			if (prof != null) {
				System.out.println("-->Bienvenido " + prof.getName() + "<--");
				System.out.println("Qué operación desea realizar: ");
				System.out.println("1.- Ver datos");
				System.out.println("2.- Ver tipo de clase");
				System.out.println("3.- Añadir usuario");
				System.out.println("4.- Eliminar usuario");
				System.out.println("5.- Salir");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					showPerson(prof);
					break;
				case 2:
					showPerson(prof);
					break;
				case 3:
					addPersona(prof);
					break;
				case 4:
					removePersona(prof);
					break;
				default:
					exit();
				}

			} else {
				System.err.println("[ERROR]: Usuario incorrecto");
				exit();
			}
		} while (true);
	}

	/**
	 * Método para mostrar el método indentidad
	 */
	public void shoyIdentity(Persona p) {
		p.identify(p);
	}

}