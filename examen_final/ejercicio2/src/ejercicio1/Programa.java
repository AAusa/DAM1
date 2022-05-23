package ejercicio1;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	/*
	 * Valida el numero de tfno. con codigo de pais
	 * @return true (si es valido)
	 * @return false (si NO es valido)
	 */
	public static boolean validarTfnoLargo(String numero) {
		final int LONGTFNOLARGO = 13;
		boolean tfnoValido = false;
		for(int i = 0; i < LONGTFNOLARGO; i++) {
			if(i == 0 && numero.charAt(i) == '+') {
				tfnoValido = true;
			}
			else if(i == 3 && numero.charAt(i) == '_') {
				tfnoValido = true;
			}
			else if(numero.charAt(i) >= '0' &&
					numero.charAt(i) <= '9') {
				tfnoValido = true;
			}
		}
		return tfnoValido;
	}
	/*
	 * Valida el numero de tfno. sin codigo de pais
	 * @return true (si es valido)
	 * @return false (si NO es valido)
	 */
	public static boolean validarTfnoCorto(String numero) {
		final int LONGTFNOCORTO = 9;
		boolean tfnoValido = false;
		for(int i = 0; i < LONGTFNOCORTO; i++) {
			if(numero.charAt(i) >= '0' &&
					numero.charAt(i) <= '9') {
				tfnoValido = true;
			}
		}
		return tfnoValido;
	}
	/*
	 * Muestra un menu y realiza las operaciones necesarias
	 * para implementar sus funcionalidades.
	 * @param String[] args
	 * @return false (si NO es valido)
	 * @exception InputMismatchException
	 * @exception Exception
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Agenda agenda = new Agenda();
		agenda.recuperarContactos();
		boolean salir = false;
		int opcion;
		String nombre, apellido;
		String numero;
		int tipoTfno;
		Contacto contacto = null;
		Telefono tfno = null;
		String[] listadoTfnos;
		String infoTfnos;



		while (!salir) {
			try {
				System.out.println("1.- Annadir contacto a la agenda.");
				System.out.println("2.- Borrar contacto de la agenda.");
				System.out.println("3.- Lista contactos de la agenda.");
				System.out.println("4.- Buscar por nombre.");
				System.out.println("5.- Annadir telefono a contacto.");
				System.out.println("6.- Borrar telefono de un contacto.");
				System.out.println("7.- Buscar por telefono.");
				System.out.println("8.- Asignar sexo.");
				System.out.println("0.- Salir.");
				opcion = teclado.nextInt();
				switch(opcion) {
				case 0:
					salir = true;
					agenda.guardarTfnos();
					System.out.println("Telefonos guardados");
					break;
				case 1:
					System.out.println("Nombre:");
					nombre = teclado.next();
					System.out.println("Apellido:");
					apellido = teclado.next();
					contacto = new Contacto(nombre, apellido);

					System.out.println("Numero de tfno.:");

					numero = teclado.next();
					if(Programa.validarTfnoCorto(numero) || Programa.validarTfnoLargo(numero)) {
						System.out.println("Tfno. validado");
					}
					else {
						System.out.println("Tfno. incorrecto");
					}

					System.out.println("Elige el tipo de tfno.");
					System.out.println("1. Movil");
					System.out.println("2. MovilTrabajo");
					System.out.println("3. Fijo");
					System.out.println("4. Fax");
					System.out.println("5. Otro");
					tipoTfno = teclado.nextInt();

					switch(tipoTfno) {
					case 1:
						tfno = new Movil(contacto, numero);
						break;
					case 2:
						tfno = new MovilTrabajo(contacto, numero);
						break;
					case 3:
						tfno = new Fijo(contacto, numero);
						break;
					case 4:
						tfno = new Fax(contacto, numero);
						break;
					case 5:
						tfno = new Otro(contacto, numero);
						break;
					default:
						throw new Exception("Debes elegir un tipo de tfno.");
					}
					if(agenda.registrarContacto(tfno)) {
						System.out.println("Tfno. reg. correctamente");
					}
					else {
						System.out.println("Error al registrar");
					}
					break;
				case 2:
					System.out.println("Introduce el apellido");
					apellido = teclado.next();

					if (agenda.eliminarContacto(apellido)) {
						System.out.println("El contacto se elimino correctamente");
					} else {
						System.out.println("El contacto no se elimino correctamente");
					}
					break;
				case 3:

					listadoTfnos = agenda.listadoTfnos();
					for (int i = 0; i < listadoTfnos.length; i++) {
						System.out.println(listadoTfnos[i]);
					}
					break;
				case 4:
					System.out.println("Introduce el apellido");
					apellido = teclado.next();

					infoTfnos = agenda.informacionContacto(apellido);
					if (infoTfnos != null) {
						System.out.println(infoTfnos);
					} else {
						System.out.println("El contacto no existe");
					}

					break;
				case 5:
					System.out.println("Nombre:");
					nombre = teclado.next();
					System.out.println("Apellido:");
					apellido = teclado.next();
					contacto = new Contacto(nombre, apellido);

					System.out.println("Numero de tfno.:");
					numero = teclado.next();

					System.out.println("Elige el tipo de tfno.");
					System.out.println("1. Movil");
					System.out.println("2. MovilTrabajo");
					System.out.println("3. Fijo");
					System.out.println("4. Fax");
					System.out.println("5. Otro");
					tipoTfno = teclado.nextInt();

					switch(tipoTfno) {
					case 1:
						tfno = new Movil(contacto, numero);
						break;
					case 2:
						tfno = new MovilTrabajo(contacto, numero);
						break;
					case 3:
						tfno = new Fijo(contacto, numero);
						break;
					case 4:
						tfno = new Fax(contacto, numero);
						break;
					case 5:
						tfno = new Otro(contacto, numero);
						break;
					default:
						throw new Exception("Debes elegir un tipo de tfno.");
					}
					if(agenda.registrarTfno(tfno)) {
						System.out.println("Tfno. reg. correctamente");
					}
					else {
						System.out.println("Error al registrar");
					}
					break;
				case 6:
					System.out.println("Introduce el numero");
					numero = teclado.next();

					if (agenda.eliminarTfno(numero)) {
						System.out.println("El contacto se elimino correctamente");
					} else {
						System.out.println("El contacto no se elimino correctamente");
					}
					break;
				case 7:
					System.out.println("Introduce el numero");
					numero = teclado.next();

					if (agenda.buscarTfno(numero) != null) {
						listadoTfnos = agenda.listadoTfnoConcreto(numero);
						for (int i = 0; i < listadoTfnos.length; i++) {
							System.out.println(listadoTfnos[i]);
						}

					} else {
						System.out.println("El contacto no esta");
					}
					break;
				case 8:
					agenda.asignarSexo();
					break;
				}

			} catch (InputMismatchException e) {
				teclado.next();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}

}
