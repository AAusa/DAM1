package ejercicio1;
/*
 * Recoge la inf. de un tfno movil de empresa.
 * @extends Movil
 */
public class MovilTrabajo extends Movil {
	private String tipo = "movilTrabajo";
	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param propietario
	 * @param numero
	 */
	public MovilTrabajo(Contacto propietario, String numero) {
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
