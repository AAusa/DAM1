package ejercicio1;
/*
 * Recoge la inf. de un hombre.
 * @extends Contacto
 */
public class Hombre extends Contacto {
	String sexo = "hombre";
	boolean barba;
	String separador = "; ";
	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param nombre
	 * @param apellido
	 * @param barba
	 */
	public Hombre(String nombre, String apellido, boolean barba) {
		super(nombre, apellido);
		this.barba = barba;
	}

	/*
	 * metodo de escritura de informacion del objeto
	 * @return info
	 */
	@Override
	public String informacion() {
		return super.informacion() + separador + sexo + separador + ((barba == true) ? "Barba si" : "Barba no") + separador;
	}
}
