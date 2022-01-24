package ClasesObjetos2.Ej1;

/**
 * @author Álvaro
 *
 */
public class DiscoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Disco disco1 = new Disco ("sol", 4, 10, "11/01/2022");
		System.out.println(disco1.getTitulo()+" "+disco1.getnCanciones()+" "+disco1.getPrecio()+" "+disco1.getFechaCompra()+".");
		disco1.setTitulo("luna");
		System.out.println(disco1.getTitulo());
	}

}
