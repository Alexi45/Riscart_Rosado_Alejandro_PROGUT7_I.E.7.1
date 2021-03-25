package Ejercicio1;

/**
 * 
 * @author Ale
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionMain {

	public static void main(String[] args) {

		Map<String, Admin> adminMap = new HashMap();
		Map<String, Moderadores> modMap = new HashMap();

		adminMap.put("ale@gmail.com", new Admin("ale@gmail.com", "Ale"));
		adminMap.put("bas@gmail.com", new Admin("bas@gmail.com", "Alvaro"));
		modMap.put("alexand@gmail.com", new Moderadores("alexand@gmail.com", "Ale"));
		modMap.put("ba@gmail.com", new Moderadores("ba@gmail.com", "Alvaro"));

		Gestion g = new Gestion(modMap, adminMap);

		g.acceder();
	}

}
