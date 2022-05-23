package ejercicio1;
/*
 * Recoge la inf. de un tfno movil.
 * @extends Telefono
 */
public class Movil extends Telefono {
	private String tipo = "movil";
	/*
	 * Asigna los parametros atributos propios de la clase
	 * @param propietario
	 * @param numero
	 */
	public Movil(Contacto propietario, String numero) {
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
