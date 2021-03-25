package Ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class CatalogoMain {

	public static void main(String[] args) {

		Map<Integer, Escultura> esculturas = new HashMap();
		Map<Integer, Pinturas> pinturas = new HashMap();
		
		esculturas.put(1112, new Escultura("Monaco", 1112, "Fernando Alonso", "2006", "Oro", 1.5d));
		esculturas.put(1113, new Escultura("Monza", 1113, "Carlos Sainz", "2020", "Plata", 1d));
		esculturas.put(1114, new Escultura("Charles Lecrec", 1114, "Spa", "2019", "Oro", 1.5d));
		pinturas.put(1115, new Pinturas("LvH", 1115, "Lewis Hamilton", "2019", 120, "Cabellete"));
		pinturas.put(1116, new Pinturas("VB", 1116, "Valteri Bottas", "2020", 250, "Tripode"));
		pinturas.put(1117, new Pinturas("CP", 1117, "Checo Pérez", "2020", 180, "Podio"));
		
		Catalogo c = new Catalogo(esculturas, pinturas);
		c.acceso();
		
	}

}
