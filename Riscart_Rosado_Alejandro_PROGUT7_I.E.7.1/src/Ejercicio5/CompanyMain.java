package Ejercicio5;


import java.util.HashMap;
import java.util.Map;

/**
 * Clase Main
 * 
 * @author ale
 *
 */
public class CompanyMain {

	public static void main(String[] args) {

		Map<Integer, Empleado> empleados = new HashMap();
		
		empleados.put(210, new EmpleadoAsalario("Santiago", "gert", 210, 1500d));
		empleados.put(211, new EmpleadoPorHoras("bertu", "bunt", 211, 1300d, 43d));
		empleados.put(212, new EmpleadoPorComision("acacio", "rodriguez", 212, 320d, 200d));
		empleados.put(213, new EmpleadoBaseMasComision("manuel", "vuti", 213, 220d, 210d));
		
		Company ebe = new Company(empleados);
		
		ebe.acceder();

	}

}
