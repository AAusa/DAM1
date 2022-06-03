package ejercicio1;
/*
 * Recoge la inf. de un tfno fijo.
 * @extends Telefono
 */
public class Fijo extends Telefono {
	private String tipo = "fijo";
	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param propietario
	 * @param numero
	 */
	public Fijo(Contacto propietario, String numero) {
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
