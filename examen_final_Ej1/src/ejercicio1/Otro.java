package ejercicio1;
/*
 * Recoge la inf. de un tfno otro.
 * @extends Telefono
 */
public class Otro extends Telefono {
	private String tipo = "otro";
	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param propietario
	 * @param numero
	 */
	public Otro(Contacto propietario, String numero) {
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
