package ejercicio1;
/*
 * Recoge la inf. de una mujer.
 * @extends Contacto
 */

public class Mujer extends Contacto {
	String sexo = "mujer";
	String separador = "; ";
	int numHijos;
	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param nombre
	 * @param apellido
	 * @param numHijos
	 */
	public Mujer(String nombre, String apellido, int numHijos) {
		super(nombre, apellido);
		this.numHijos = numHijos;
	}
	/*
	 * metodo de escritura de informacion del objeto
	 * @return info
	 */
	@Override
	public String informacion() {
		return super.informacion() + separador + sexo + separador + "numHijos: " + numHijos + separador;
	}

}
