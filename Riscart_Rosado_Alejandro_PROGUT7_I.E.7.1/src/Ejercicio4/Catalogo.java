package Ejercicio4;

import java.io.Serial;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.sound.midi.Soundbank;
import javax.swing.text.AbstractDocument.BranchElement;

import org.w3c.dom.ls.LSOutput;

/**
 * 
 * @author esmer
 *
 */
public class Catalogo {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Escultura> esculturas;
	Map<Integer, Pinturas> pinturas;

	public Catalogo(Map<Integer, Escultura> esculturas, Map<Integer, Pinturas> pinturas) {
		super();
		this.esculturas = esculturas;
		this.pinturas = pinturas;
	}

	/**
	 * Método para añadir obras.
	 */
	public void addObra() {
		try {
			System.out.println("Qué tipo de obra deseas añadir: ");
			System.out.println("1.- Escultura");
			System.out.println("2.- Pintura");
			System.out.println("3.- Salir");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				addEscultura();
				break;
			case 2:
				addPintura();
				break;
			default:
				exit();
				break;
			}

		} catch (Exception e) {
			System.err.println("[ERROR]: Ha introducido algún valor erróneo.");
		}
	}

	/**
	 * Método generado con el extract method, el cual usamos para añadir una
	 * pintura. Lo añado en un método a parte para no tener tántas líenas en el
	 * método de addObra.
	 */
	private void addPintura() {
		try {
			System.out.println("Introduce el titulo de la pintura: ");
			String titulo = sc.nextLine();
			sc.nextLine();
			System.out.println("Introduce el número de inventario: ");
			int numInve = sc.nextInt();
			System.out.println("Introduce el nombre del autor; ");
			String autor = sc.nextLine();
			sc.nextLine();
			System.out.println("Introduce el año de creación de la escultura: ");
			String ano = sc.nextLine();
			System.out.println("Introduce la superficie de la pintura: ");
			double superficie = sc.nextDouble();
			System.out.println("Introduce el tipo de soporte: ");
			String soporte = sc.next();

			if (pinturas.containsKey(numInve)) {
				System.out.println("Esta obra ya está añadida.");
			} else {
				pinturas.put(numInve, new Pinturas(titulo, numInve, autor, ano, superficie, soporte));
				System.out.println("Escultura añadida con éxito.");
			}
		} catch (Exception e) {
			System.err.println("[ERROR]: Ha introducido algún valor erróneo.");
		}
	}

	/**
	 * Método generado con el extract method, el cual usamos para añadir una
	 * escultura. Lo añado en un método a parte para no tener tántas líenas en el
	 * método de addObra.
	 */
	private void addEscultura() {
		try {
			System.out.println("Introduce el titulo de la escultura: ");
			String titulo = sc.nextLine();
			sc.nextLine();
			System.out.println("Introduce el número de inventario: ");
			int numInve = sc.nextInt();
			System.out.println("Introduce el nombre del autor; ");
			String autor = sc.nextLine();
			sc.nextLine();
			System.out.println("Introduce el año de creación de la escultura: ");
			String ano = sc.nextLine();
			System.out.println("Introduce el material de la escultura: ");
			String material = sc.next();
			System.out.println("Introduce la altura de la escultura");
			double altura = sc.nextDouble();

			if (esculturas.containsKey(numInve)) {
				System.out.println("Esta obra ya está añadida.");
			} else {
				esculturas.put(numInve, new Escultura(titulo, numInve, autor, ano, material, altura));
				System.out.println("Escultura añadida con éxito.");
			}
		} catch (Exception e) {
			System.err.println("[ERROR]: Ha introducido algún valor erróneo.");
		}
	}

	/**
	 * Método para salir del programa.
	 */
	public void exit() {
		System.out.println("HASTA PRONTO!!!");
		System.exit(1);
	}

	/**
	 * Método para eliminar obras.
	 */
	public void removeObra() {
		try {
			System.out.println("Qué tipo de obra deseas eliminar: ");
			System.out.println("1.- Escultura");
			System.out.println("2.- Pintura");
			System.out.println("3.- Salir");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				removeEscultura();
				break;
			case 2:
				removePintura();
				break;
			default:
				exit();
				break;
			}

		} catch (Exception e) {
			System.err.println("[ERROR]: Ha introducido algún valor erróneo.");
		}
	}

	/**
	 * Método para eliminar las pinturas.
	 */
	private void removePintura() {
		System.out.println("Estas son las pinturas disponibles: ");
		showPinturas();
		System.out.println("Introduzca el número de inventario de la pintura que desea eliminar: ");
		int n2 = sc.nextInt();
		if (pinturas.containsKey(n2)) {
			pinturas.remove(n2);
			System.out.println("Pintura eliminada con éxito!!!");
		} else {
			System.err.println("[ERROR]: La obra seleccionada no se encuentra disponible");
		}
	}

	/**
	 * Método para eliminar las esculturas.
	 */
	private void removeEscultura() {
		System.out.println("Estas son las esculturas disponibles: ");
		showEscultura();
		System.out.println("Introduzca el número de inventario de la escultura que desea eliminar: ");
		int n = sc.nextInt();
		if (esculturas.containsKey(n)) {
			esculturas.remove(n);
			System.out.println("Escultura eliminada con éxito!!!");
		} else {
			System.err.println("[ERROR]: La obra seleccionada no se encuentra disponible");
		}
	}

	/**
	 * Método para mostrar las esculturas.
	 */
	public void showEscultura() {
		System.out.println("--Esculturas--");
		esculturas.values().stream().forEach(System.out::println);
	}

	/**
	 * Método para mostrar las pinturas.
	 */
	public void showPinturas() {
		System.out.println("--Pinturas--");
		pinturas.values().stream().forEach(System.out::println);
	}

	/**
	 * Método para buscar una obra.
	 */
	public void searchObra() {
		System.out.println("Estas son las obras disponibles: ");
		showEscultura();
		showPinturas();
		System.out.println("Introduce el numero de inventario de la obra que desea buscar: ");
		int num = sc.nextInt();
		if (esculturas.containsKey(num)) {
			Escultura e = esculturas.get(num);
			System.out.println(e.muestra());
		} else if (pinturas.containsKey(num)) {
			Pinturas p = pinturas.get(num);
			System.out.println(p.muestra());
		} else {
			System.err.println("[ERROR]: El número introducido no coincide con ninguna obra.");
		}
	}

	/**
	 * Método para obtener el numero de inventario de la escultura más alta.
	 */
	public void masAlta() {
		System.out.println("Buscando la escultura más alta........");
		Escultura maxAltura = esculturas.values().stream().max((x, y) -> x.getAltura().compareTo(y.getAltura())).get();
		System.out.println("El número de inventario de la escultura más alta es " + maxAltura.getNumInvetario());
	}

	/**
	 * Método para obtener la suma de las superficies de las pinturas del museo.
	 */
	public double superficie() {
		System.out.println("Calculando la suma total........");
		System.out.println("La suma total de las superficies es: ");
		return pinturas.values().stream().mapToDouble(l -> l.getSuperficie()).sum();
	}

	/**
	 * Método de unión.
	 */
	public void acceso() {
		do {
			menu();
			int num = sc.nextInt();
			switch (num) {
			case 1:
				addObra();
				break;
			case 2:
				removeObra();
				break;
			case 3:
				showObras();
				break;
			case 4:
				searchObra();
				break;
			case 5:
				System.out.println(superficie());
				break;
			case 6:
				masAlta();
				break;
			default:
				exit();
				break;
			}
		} while (true);
	}

	private void menu() {
		System.out.println("--->BIENVENIDO<---");
		System.out.println("Qué acción desea realizar: ");
		System.out.println("1.- Añadir obra.");
		System.out.println("2.- Eliminar obra.");
		System.out.println("3.- Ver obras.");
		System.out.println("4.- Buscar obra.");
		System.out.println("5.- Superficie.");
		System.out.println("6.- Más alta.");
		System.out.println("7.- Salir");
	}

	public void showObras() {
		showEscultura();
		showPinturas();
	}
}