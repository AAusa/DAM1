package ejercicio1;

import java.io.EOFException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @author Alvaro
 * Clase encargada de albergar todas las operaciones a realizar en una
 * agenda de contactos.
 */

public class Agenda {
	List<Telefono> telefonos; //Lista de tfnos. de la agenda
	String[] infoTfnos;

	public Agenda() {
		telefonos = new ArrayList<Telefono>();
	}

	/*
	 * Registra el contacto con el tfno. 
	 * Ya se entiende que en una agenda de tfnos. 
	 * cuando se annade un contacto es implicitamente
	 * con un tfno.
	 * @return true cuando se annade
	 * @return false cuando NO se annade
	 */
	public boolean registrarContacto(Telefono t) {
		Telefono existe = buscarContacto(t.propietario.getApellido());
		if (existe != null) {
			System.out.println("Ya existe el contacto");
			return false;
		}

		telefonos.add(t);
		return true;

	}


	/*
	 * Dado un apellido busca si el apellido de un propietario de un
	 * tfno. tiene este apellido.
	 * @return objeto de la clase Telefono (si coinciden los apellidos)
	 */
	private Telefono buscarContacto(String apellido) {
		for (Telefono t: telefonos) {
			if (t.propietario.getApellido().equals(apellido)) {
				return t;
			}
		}
		return null;
	}
	/*
	 * Dado un numero busca si el numero de telefono esta registrado.
	 * @return objeto de la clase Telefono (si coinciden los numeros)
	 */
	public Telefono buscarTfno(String numero) {
		for (Telefono t: telefonos) {
			if (t.numero.equals(numero)) {
				return t;
			}
		}
		return null;
	}
	/*
	 * Lee los objetos contenidos en el archivo hasta que termina 
	 * la lectura
	 * @exception FileNotFoundException
	 * @exception EOFException
	 * @exception IOException
	 * @exception ClassNotFoundException
	 */
	public void recuperarContactos(){
		/*
		 * Al poner entre parentesis el fichero al terminar el try
		 * se cierra.
		 */
		try (ObjectInputStream lecturaObjetos = new ObjectInputStream(new FileInputStream("agenda.dat"))) {
			while(true){
				Telefono telefono = (Telefono)lecturaObjetos.readObject();
				registrarContacto(telefono);
			}

		} catch (FileNotFoundException ex) {
			System.out.println("No hay fichero");
		} catch (EOFException ex) {
			System.out.println("Contactos añadidos del fichero");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} 

	}

	/*
	 * Devuelve la inf. de los registros en la agenda ordenada por 
	 * ordenAlfabetico.
	 * @return infoTfnos(vector)
	 */
	public String[] listadoTfnos() {
		infoTfnos = new String[telefonos.size()];
		for (int i = 0; i < infoTfnos.length; i++) {
			infoTfnos[i] = telefonos.get(i).informacion();
		}
		Arrays.sort(infoTfnos);
		return infoTfnos;
	}

	/*
	 * Introducido un apellido se elimina el contacto (y el tfno.
	 * asociado) de la agenda.
	 * @return true si se elimina
	 * @return true si no se elimina
	 */
	public boolean eliminarContacto(String apellido){
		Telefono c = this.buscarContacto(apellido);
		if(c != null){
			for (Telefono tfno: telefonos) {
				if(tfno.propietario.getApellido().equals(apellido)){
					telefonos.remove(tfno);
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Devuelve la inf. de un contacto especifico 
	 * marcado por su apellido
	 * @return inf. del contacto si esta
	 * @return null si no esta el contacto
	 */

	public String informacionContacto(String apellido) {

		Telefono t = buscarContacto(apellido);
		if (t != null) {
			return t.informacion();
		}
		return null;
	}

	/*
	 * Registra el tfno a un contacto creado previamente.
	 * @return true si se crea
	 * @return true si no
	 * 
	 */
	public boolean registrarTfno(Telefono t) {
		Telefono existe = buscarContacto(t.propietario.getApellido());
		if (existe != null) {
			System.out.println("Ya existe el contacto");
			telefonos.add(t);
			return true;
		}
		return false;

	}

	/*
	 * Elimina el tfno correspondiente al numero dado.
	 * @return true si se borra
	 * @return true si no
	 * 
	 */
	public boolean eliminarTfno(String numero){
		Telefono c = buscarTfno(numero);
		if(c != null){
			for (Telefono tfno: telefonos) {
				if(tfno.numero.equals(numero)){
					telefonos.remove(tfno);
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Devuelve la inf. del tfno. en la agenda 
	 * dando por su numero
	 * @return infoTfnos(vector)
	 */
	public String[] listadoTfnoConcreto(String numero) {
		infoTfnos = new String[telefonos.size()]; // por si acaso

		String[] infoTfnos = new String[telefonos.size()];
		for (int i = 0; i < infoTfnos.length; i++) {
			if(telefonos.get(i).numero.equals(numero)) {
				infoTfnos[i] = telefonos.get(i).informacion();
			}

		}
		return infoTfnos;
	}

	/*
	 * Escribe los objetos contenidos en una coleccion en un fichero
	 * la lectura
	 * @exception FileNotFoundException
	 * @exception EOFException
	 * @exception IOException
	 * @exception ClassNotFoundException
	 */
	public void guardarTfnos(){
		/*
		 * Al poner entre parentesis el fichero al terminar el try
		 * se cierra.
		 */
		try (ObjectOutputStream escribirObjeto = new ObjectOutputStream(new FileOutputStream("agenda.dat"))) {
			for (Telefono tfno : telefonos) {
				escribirObjeto.writeObject(tfno);
			}

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} 

	}




}
