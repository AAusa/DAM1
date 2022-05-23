package ejercicio1;

import java.io.Serializable;
/*
 * Clase abstracta para obligar la especializacion del telefono
 * entre las subclases.
 * Recoge la inf. de cualquier tipo de tfno.
 * @implements Imprimible
 * @implements Serializable
 */
public abstract class Telefono implements Imprimible, Serializable {
	String numero;
	String separador = "; "; //separa la inf. de informacion()
	Contacto propietario;

	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param propietario
	 * @param numero
	 */

	public Telefono(Contacto propietario, String numero) {
		this.propietario = propietario;
		this.numero = numero;
	}

	/*
	 * getters y setters de los atributos
	 */

	public String getSeparador() {
		return separador;
	}

	public void setSeparador(String separador) {
		this.separador = separador;
	}

	public Contacto getPropietario() {
		return propietario;
	}

	public void setPropietario(Contacto propietario) {
		this.propietario = propietario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	/*
	 * metodo de escritura de informacion del objeto
	 * @return info
	 */
	@Override
	public String informacion() {
		return propietario.informacion() + numero + separador;
	}
}
