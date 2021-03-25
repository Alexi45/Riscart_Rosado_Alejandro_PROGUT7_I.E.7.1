package Ejercicio5;

import java.awt.Menu;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import junit.extensions.TestSetup;

/**
 * Clase para generalizar los métodos.
 * 
 * @author Ale
 *
 */
public class Company {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Empleado> empleados = new HashMap();

	public Company(Map<Integer, Empleado> empleados) {
		super();
		this.empleados = empleados;
	}

	/**
	 * Método para meter empleados.
	 */
	public void addEmpleado() {
		menu();
		int num = sc.nextInt();
		switch (num) {
		case 1:
			addEmpleadoAsalariado();
			break;

		case 2:
			addEmpleadoPorHoras();
			break;
		case 3:
			addEmpleadoPorComision();
			break;
		case 4:
			addEmpleadoBaseMasComision();
		default:
			exit();
			break;
		}

	}

	/**
	 * Método para irse del programa.
	 */
	public void exit() {
		System.out.println("adios");
		System.exit(0);
	}

	/**
	 * Método para añadir los empleados base mas la comision.
	 */
	private void addEmpleadoBaseMasComision() {
		try {
			System.out.println("Introduzca el nombre:");
			String nombre2 = sc.next();
			System.out.println("Introduzca el primer apellido:");
			String apellido2 = sc.next();
			System.out.println("Introduzca el número de la Seguridad Social:");
			int tyu2 = sc.nextInt();
			System.out.println("Introduzca su numero de ventas: ");
			Double vv = sc.nextDouble();
			System.out.println("Introduzca la tarifa: ");
			Double tarifa = sc.nextDouble();
			if (empleados.containsKey(tyu2)) {
				System.err.println("error vuelva a intentarlo");
			} else {
				System.out.println("se esta añadiendo el empleado");
				empleados.put(tyu2, new EmpleadoBaseMasComision(nombre2, apellido2, tyu2, vv, tarifa));
				System.out.println("hecho");
			}
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para añadir empleados por comision.
	 */
	private void addEmpleadoPorComision() {
		try {
			System.out.println("Introduzca el nombre:");
			String nombre = sc.next();
			System.out.println("Introduzca el primer apellido:");
			String apellido = sc.next();
			System.out.println("Introduzca el número de la Seguridad Social:");
			int tyu = sc.nextInt();
			System.out.println("Introduzca el numero de ventas: ");
			Double vv = sc.nextDouble();
			System.out.println("Introduzca la tarifa: ");
			Double tarifa = sc.nextDouble();
			if (empleados.containsKey(tyu)) {
				System.err.println("error vuelva a intentarlo");
			} else {
				System.out.println("se esta añadiendo el empleado");
				empleados.put(tyu, new EmpleadoPorComision(nombre, apellido, tyu, vv, tarifa));
				System.out.println("hecho");
			}
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/*
	 * Método para añadir empleados por hora.
	 */
	private void addEmpleadoPorHoras() {
		try {
			System.out.println("Introduzca el nombre:");
			String nombre = sc.next();
			System.out.println("Introduzca el primer apellido:");
			String apellido = sc.next();
			System.out.println("Introduzca el número de la Seguridad Social:");
			int tyu = sc.nextInt();
			System.out.println("Introduzca el sueldo por hora: ");
			Double sph = sc.nextDouble();
			System.out.println("Introduzca las horas trabajadas: ");
			Double ht = sc.nextDouble();
			if (empleados.containsKey(tyu)) {
				System.err.println("error vuelva a intentarlo");
			} else {
				System.out.println("se esta añadiendo el empleado");
				empleados.put(tyu, new EmpleadoPorHoras(nombre, apellido, tyu, sph, ht));
				System.out.println("hecho");
			}
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para añadir empleados con dinero.
	 */
	private void addEmpleadoAsalariado() {
		try {
			System.out.println("Introduzca el nombre:");
			String nombre = sc.next();
			System.out.println("Introduzca el primer apellido:");
			String apellido = sc.next();
			System.out.println("Introduzca el número de la Seguridad Social:");
			int tyu = sc.nextInt();
			System.out.println("Introduce el salario semanal: ");
			Double salario = sc.nextDouble();
			if (empleados.containsKey(tyu)) {
				System.err.println("error vuelva a intentarlo");
			} else {
				System.out.println("se esta añadiendo el empleado");
				empleados.put(tyu, new EmpleadoAsalario(nombre, apellido, tyu, salario));
				System.out.println("hecho");
			}
		} catch (Exception e) {
			System.err.println("error.");
		}
	}

	/**
	 * Método para el menú sacarlo por pantalla.
	 */
	private void menu() {
		System.out.println("Seleccione un tipo de empleado:");
		System.out.println("1. Empleado Asalariado.");
		System.out.println("2. Empleado por horas.");
		System.out.println("3. Empleado por comision.");
		System.out.println("4. Empleado base más comsion.");
		System.out.println("5. Salir");
	}

	/**
	 * Método para mostrar los empleados.
	 */
	public void showEmpleados() {
		empleados.values().stream().forEach(System.out::println);
	}

	/**
	 * Método para eliminar los empleados.
	 */
	public void removeEmpleado() {
		try {
			System.out.println("Seleccione un empleado para eliminar: ");
			showEmpleados();
			System.out.println("Introduce el número de la Seguridad social para eliminar al empleado:");
			int tyu = sc.nextInt();
			if (empleados.containsKey(tyu)) {
				System.out.println("Eliminando");
				empleados.remove(tyu);
				System.out.println("Empleado eliminado");
			} else {
				System.err.println("Error vuelva a intentarlo");
			}
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Metodo para cambiar los datos del empleado.
	 */
	public void modificarEmpleado() {
		try {
			System.out.println("Qué empleado desea cambiar: ");
			showEmpleados();
			System.out.println("Introduce el numero de la Seguridad social para modificarlo.");
			int tyu = sc.nextInt();
			if (empleados.get(tyu) instanceof EmpleadoAsalario) {
				modificarEmpleadoAsalariado(tyu);
			} else if (empleados.get(tyu) instanceof EmpleadoPorHoras) {
				modificarEmpleadoPorHoras(tyu);			} else if (empleados.get(tyu) instanceof EmpleadoPorComision) {
				modificarEmpleadoPorComision(tyu);
			} else if (empleados.get(tyu) instanceof EmpleadoBaseMasComision) {
				modificarEmpleadoBaseMasComision(tyu);
			}
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para cambiar el empleado base mas la comision.
	 * 
	 * @param tyu
	 */
	private void modificarEmpleadoBaseMasComision(int tyu) {
		try {
			EmpleadoBaseMasComision ht = (EmpleadoBaseMasComision) empleados.get(tyu);
			System.out.println("Introduce el nuevo nombre: ");
			String nombre = sc.next();
			System.out.println("Introduce el nuevo apellido: ");
			String apellido = sc.next();
			System.out.println("Introduce el nuevo número de la Seguridad social : ");
			Integer numSS = sc.nextInt();
			System.out.println("introduce el nuevo numero de ventas: ");
			Double vv = sc.nextDouble();
			System.out.println("Introduce la nueva tarifa: ");
			Double tarifa = sc.nextDouble();
			System.out.println("");
			System.out.println("cambiando datos");
			ht.establecer(nombre, apellido, numSS);
			ht.establecer(vv, tarifa);
			System.out.println("Datos modificados");
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para modificar el empleado por comision.
	 * 
	 * @param tyu
	 */
	private void modificarEmpleadoPorComision(int tyu) {
		try {
			EmpleadoPorComision uy = (EmpleadoPorComision) empleados.get(tyu);
			System.out.println("Introduce el nuevo nombre: ");
			String nombre = sc.next();
			System.out.println("Introduce el nuevo apellido: ");
			String apellido = sc.next();
			System.out.println("Introduce el nuevo número de la Seguridad social : ");
			Integer numSS = sc.nextInt();
			System.out.println("introduce el nuevo numero de ventas: ");
			Double vv = sc.nextDouble();
			System.out.println("Introduce la nueva tarifa: ");
			Double tarifa = sc.nextDouble();
			System.out.println("cambiando datos");
			uy.establecer(nombre, apellido, numSS);
			uy.establecer(vv, tarifa);
			System.out.println("Datos modificados ");
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para modificar el empleado por horas.
	 * 
	 * @param tyu
	 */
	private void modificarEmpleadoPorHoras(int tyu) {
		try {
			EmpleadoPorHoras tu = (EmpleadoPorHoras) empleados.get(tyu);
			System.out.println("Introduce el nuevo nombre: ");
			String nombre = sc.next();
			System.out.println("Introduce el nuevo apellido: ");
			String apellido = sc.next();
			System.out.println("Introduce el nuevo número de la Seguridad social : ");
			Integer numSS = sc.nextInt();
			System.out.println("introduce el nuevo sueldo por horas: ");
			Double sueldo = sc.nextDouble();
			System.out.println("Introduce el nuevo número de horas trabajadas: ");
			Double horas = sc.nextDouble();
			System.out.println("cambiando datos");
			tu.establecer(nombre, apellido, numSS);
			tu.establecer(sueldo, horas);
			System.out.println("Datos modificados");
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para modificar el empleado asalariado.
	 * 
	 * @param tyu
	 */
	private void modificarEmpleadoAsalariado(int tyu) {
		try {
			EmpleadoAsalario tr = (EmpleadoAsalario) empleados.get(tyu);
			System.out.println("Introduce el nuevo nombre: ");
			String nombre = sc.next();
			System.out.println("Introduce el nuevo apellido: ");
			String apellido = sc.next();
			System.out.println("Introduce el nuevo número de la Seguridad social : ");
			Integer numSS = sc.nextInt();
			System.out.println("introduce el nuevo salario: ");
			Double salario = sc.nextDouble();
			System.out.println("cambiando datos");
			tr.establecer(nombre, apellido, numSS);
			tr.establecer(salario);
			System.out.println("Datos modificados");
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	/**
	 * Método para saber el salario de un empleado.
	 */
	public void calcularSalario() {
		try {
			System.out.println("De qué empleado deseas saber el salario: ");
			showEmpleados();
			System.out.println("Introduce el numero de la Seguridad social para saber el salario.");
			int tyu = sc.nextInt();
			if (empleados.get(tyu) instanceof EmpleadoAsalario) {
				EmpleadoAsalario tr = (EmpleadoAsalario) empleados.get(tyu);
				tr.ingresos();
			} else if (empleados.get(tyu) instanceof EmpleadoPorHoras) {
				EmpleadoPorHoras tu = (EmpleadoPorHoras) empleados.get(tyu);
				tu.ingresos();
			} else if (empleados.get(tyu) instanceof EmpleadoPorComision) {
				EmpleadoPorComision uy = (EmpleadoPorComision) empleados.get(tyu);
				uy.ingresos();
			} else if (empleados.get(tyu) instanceof EmpleadoBaseMasComision) {
				EmpleadoBaseMasComision ht = (EmpleadoBaseMasComision) empleados.get(tyu);
				ht.ingresos();
			}
		} catch (Exception e) {
			System.err.println("error");
		}
	}

	public void acceder() {
		System.out.println("Buenas");
		do {
			System.out.println("Que desea realizar: ");
			System.out.println("1. Añadir un empleado.");
			System.out.println("2. Listar los empleados.");
			System.out.println("3. Modificar los empleados.");
			System.out.println("4. Eliminar los empleados.");
			System.out.println("5. Mostrar el salario.");
			System.out.println("6. Salir");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				addEmpleado();
				break;
			case 2:
				showEmpleados();
				break;
			case 3:
				modificarEmpleado();
				break;
			case 4:
				removeEmpleado();
				break;
			case 5:
				calcularSalario();
				break;
			default:
				exit();
				break;
			}
		} while (true);
	}

}
