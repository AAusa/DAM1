package ejercicio1;
/*
 * Recoge la inf. de un tfno fax.
 * @extends Telefono
 */
public class Fax extends Telefono {
	private String tipo = "fax";

	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param propietario
	 * @param numero
	 */
	public Fax(Contacto propietario, String numero) {
		super(propietario, numero);
	}
	/*
	 * metodo de escritura de informacion del objeto
	 * @return info
	 */
	@Override
	public String informacion() {
		return super.informacion() + " " + tipo;
	}
}
