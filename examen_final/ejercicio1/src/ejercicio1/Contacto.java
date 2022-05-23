package ejercicio1;

import java.io.Serializable;
import java.util.Comparator;
/*
 * @author Alvaro
 * Clase encargada de albergar los datos de un contacto.
 * @implements Imprimible, Serializable, Comparable<Contacto>
 * @implements Serializable
 * @implements Comparable<Contacto>
 */

public class Contacto implements Imprimible, Serializable, Comparable<Contacto> {
	private String nombre;
	private String apellido;
	private String separador = "; ";
	/*
	 * Asigna nombre y apellido en el constructor
	 * @param nombre
	 * @param apellido
	 */
	public Contacto(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	/*
	 * getters y setters de nombre y apellido con sus
	 * correspondientes parametros
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/*
	 * metodo de escritura de informacion del objeto
	 * @return info
	 */
	@Override
	public String informacion() {
		return nombre + " " + apellido + separador;
	}

	/*
	 * Compara los contactos por ordenAlfabetico
	 */
	@Override
	public int compareTo(Contacto o) {
		return apellido.compareTo(o.apellido);
	}



}
