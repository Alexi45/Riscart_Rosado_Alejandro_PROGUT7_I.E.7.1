package Ejercicio1;

import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author Ale
 *
 */

import org.w3c.dom.UserDataHandler;

public class Gestion {

	Scanner sc = new Scanner(System.in);
	private Map<String, Moderadores> Moders;
	private Map<String, Admin> Administradores;

	public Gestion(Map<String, Moderadores> moders, Map<String, Admin> administradores) {
		super();
		Moders = moders;
		Administradores = administradores;
	}

	public Map<String, Moderadores> getModers() {
		return Moders;
	}

	public void setModers(Map<String, Moderadores> moders) {
		Moders = moders;
	}

	public Map<String, Admin> getAdministradores() {
		return Administradores;
	}

	public void setAdministradores(Map<String, Admin> administradores) {
		Administradores = administradores;
	}

	public void mostrarCuentasAdmin() {
		if (Administradores.isEmpty()) {
			System.out.println("Ninguna cuenta creada");
			
		} else {
			Administradores.values().stream().forEach(System.out::println);
		}
	}

	public void mostrarCuentasMod() {
		if (Moders.isEmpty()) {
			System.out.println("Ninguna cuenta creada");
		
		} else {
			Moders.values().stream().forEach(System.out::println);
		}
	}

	public void addAdmin() {
		String email;
		String nick;
		try {
			System.out.println("Introduzca nombre de cuenta ");
			nick = sc.next();
			System.out.println("Introduce correo electronico de nueva cuenta ");
			email = sc.next();
			Administradores.values().parallelStream().findAny().filter(l -> l.getEmail().equals(email))
					.ifPresentOrElse(l -> {
						System.out.println("Ya esta en uso");
					}, () -> {
						Administradores.put(email, new Admin(email, nick));
					});
		} catch (Exception e) {
			System.err.println("Dato no valido");
		}

	}

	public void removeAdmin() {
		String email;
		try {
			mostrarCuentasAdmin();
			System.out.println("Introduce email de cuenta que desea eliminar ");
			email = sc.next();
			if (Administradores.isEmpty()) {
				System.out.println("Ninguna cuenta creada");
				
			} else {
				Administradores.remove(email);
				System.out.println("Cuenta eliminada con éxito");
			}

		} catch (Exception e) {
			System.err.println("Dato no valido");
		}
	}

	public void addMod() {
		String email;
		String nick;
		try {
			System.out.println("Introduce email de cuenta moderador ");
			nick = sc.next();
			System.out.println("Introduce correo para cuenta nueva");
			email = sc.next();
			Moders.values().parallelStream().findAny().filter(l -> l.getEmail().equals(email)).ifPresentOrElse(l -> {
				System.out.println("Dato no valido ya esta en uso");
			}, () -> {
				Moders.put(email, new Moderadores(email, nick));
			});
		} catch (Exception e) {
			System.err.println("Dato no valido");
		}
	}

	public void removeMod() {
		String email;
		try {
			mostrarCuentasMod();
			System.out.println("Introduce email de cuenta que desea eliminar  ");
			email = sc.next();
			if (Moders.isEmpty()) {
				System.out.println("Ninguna cuenta creada");
		
			} else {
				if (Moders.containsKey(email)) {
					Moders.remove(email);
					System.out.println("Cuenta eliminada con éxito");
				} else {
					System.out.println("El usuario introducido no existe!!");
				}
			}

		} catch (Exception e) {
			System.err.println("Dato no valido");
		}
	}

	public void incrementarMensaje(Usuario user) {
		user.incrementarMensaje();
	}

	public void decrementarMensaje(Usuario user) {
		user.decrementarMensaje();
	}

	public void modificarEmail(Usuario user) {
		user.modificarEmail();
	}

	public void mandarPapeleraMod(Usuario user) {
		user.mandarPapelera();
	}

	public void cambiarNick(Admin adm) {
		adm.cambiarNick();
	}

	public void bannear(Admin adm) {
		adm.bannear();
	}

	public void showModAcc() {
		Moders.values().stream().forEach(System.out::println);
	}

	public void showAdminAcc() {
		Administradores.values().stream().forEach(System.out::println);
	}

	public void changeEmail(Usuario user) {
		user.modificarNick();
	}

	public void acceder() {
		try {
			System.out.println("Cuenta que desea acceder");
			System.out.println("1. Moderadores");
			System.out.println("2. Administradores");
			System.out.println("3. Salir");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Introduce el email de el usuario moderador al que desea acceder: ");
				String email = sc.next();
				Moderadores mod = Moders.get(email);
				if (mod != null) {
					System.out.println("Bienvenido al menu");
				} else {
					System.out.println("No existe esa cuenta");
					System.out.println("1. ¿Desea crear una cuenta?");
					System.out.println("2. Salir");
					int x = sc.nextInt();
					switch (x) {
					case 1:
						System.out.println("Qué cuenta desea crear: ");
						System.out.println("1. Moderador");
						System.out.println("2. Administrador");
						System.out.println("3. Salir");
						int y = sc.nextInt();
						switch (y) {
						case 1:
							addMod();
							break;
						case 2:
							addAdmin();
							break;
						default:
							System.out.println("Adios");
							System.exit(0);
						}
						break;
					default:
						System.out.println("Adios");
						System.exit(0);
					}
				}
				do {
					System.out.println("Qué operacion desea realizar: ");
					System.out.println("1. Incrementar los mensajes");
					System.out.println("2. Decrementar los mensajes");
					System.out.println("3. Modificar el Email");
					System.out.println("4. Mandar un mensaje a la papelera");
					System.out.println("5. Modificar el nombre");
					System.out.println("6. Eliminar la cuenta");
					System.out.println("7. Mostrar cuentas de los moderadores");
					System.out.println("8. Salir");
					int x = sc.nextInt();
					switch (x) {
					case 1:
						incrementarMensaje(mod);
						break;
					case 2:
						decrementarMensaje(mod);
						break;
					case 3:
						modificarEmail(mod);
						break;
					case 4:
						mandarPapeleraMod(mod);
						break;
					case 5:
						modificarEmail(mod);
						break;
					case 6:
						removeMod();
						break;
					case 7:
						showModAcc();
						break;
					default:
						System.out.println("Adios");
						System.exit(0);
					}

				} while (true);
			case 2:
				System.out.println("Introduce el email de el usuario adminstrador al que desea acceder: ");
				String email2 = sc.next();
				Admin adm = Administradores.get(email2);
				if (adm != null) {
					System.out.println("Bienvenido al menu");
				} else {
					System.out.println("No existe esa cuenta");
					System.out.println("1. ¿Desea crear una cuenta?");
					System.out.println("2. Salir");
					int x = sc.nextInt();
					switch (x) {
					case 1:
						System.out.println("Qué cuenta desea crear: ");
						System.out.println("1. Moderador");
						System.out.println("2. Administrador");
						System.out.println("3. Salir");
						int y = sc.nextInt();
						switch (y) {
						case 1:
							addMod();
							break;
						case 2:
							addAdmin();
							break;
						default:
							System.out.println("Adios");
							System.exit(0);
						}
					default:
						System.out.println("Adios");
						System.exit(0);
					}
				}
				do {
					System.out.println("Qué operacion desea realizar: ");
					System.out.println("1. Incrementar los mensajes");
					System.out.println("2. Decrementar los mensajes");
					System.out.println("3. Modificar el Email");
					System.out.println("4. Mandar un mensaje a la papelera");
					System.out.println("5. Eliminar la cuenta");
					System.out.println("6. Banner usuario");
					System.out.println("7. Show adm acc");
					System.out.println("8. Salir");
					int x2 = sc.nextInt();
					switch (x2) {
					case 1:
						incrementarMensaje(adm);
						break;
					case 2:
						decrementarMensaje(adm);
						break;
					case 3:
						modificarEmail(adm);
						break;
					case 4:
						mandarPapeleraMod(adm);
						break;
					case 5:
						removeAdmin();
						break;
					case 6:
						bannear(adm);
						break;
					case 7:
						showAdminAcc();
						break;
					default:
						System.out.println("Adios");
						System.exit(0);
					}

				} while (true);
			default:
				System.out.println("Adios");
				System.exit(1);
			}
		} catch (Exception e) {

		}
	}

}
