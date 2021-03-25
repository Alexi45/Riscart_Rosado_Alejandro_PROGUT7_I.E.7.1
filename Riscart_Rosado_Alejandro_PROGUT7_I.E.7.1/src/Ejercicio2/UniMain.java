package Ejercicio2;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase Main
 * 
 * @author esmer
 *
 */
public class UniMain {

	public static void main(String[] args) {

		Map<String, Estudiante> estudi = new HashMap();
		Map<String, Profesor> prof = new HashMap();
		Universidad uni = new Universidad(estudi, prof);

		estudi.put("77822787X", new Estudiante(1111, "Javier", "Esmerado", "77822787X",
				new Direccion("Don Alonso Quijano", "Sevilla", 41930, "España")));
		estudi.put("123456789A", new Estudiante(1112, "Nadia", "Gutierrez", "123456789A",
				new Direccion("Arcoiris", "Sevilla", 41930, "España")));
		prof.put("987654321B", new Profesor(true, "Lando", "Vela", "987654321B",
				new Direccion("JavaLove", "Sevilla", 41980, "EclipseCountry")));
		prof.put("192837465C", new Profesor(false, "Matilda", "Manzanares", "192837465C",
				new Direccion("HTMLLove", "Sevilla", 41980, "VSCodeCountry")));

		uni.acces();

	}

}