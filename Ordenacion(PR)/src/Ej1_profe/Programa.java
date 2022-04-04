package Ej1_profe;
/**
 * Conductor para comprobar el funcionamiento del TAD enteros
 */

import java.util.Random;

/**
 * @author alu
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	static private void imprimir (PilaEnteros l) {
		PilaEnteros aux = new PilaReferencia();
		while (l.size() > 0) {
			aux.push(l.pop());
		}
		while (aux.size() > 0) {
			int x = aux.pop();
			l.push(x);
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// número máximo de elementos a usar
		final int MAXOPREACIONES = 150;
		
		Random r = new Random(123456);
		PilaEnteros p = new PilaVector();	
		
		
		for(int i = 0; i < MAXOPREACIONES; i++) {
			int x = r.nextInt();
			boolean meter = r.nextBoolean();
			System.out.println("Operación "+i+": "+(meter ? "meter" : "sacar"));
			if (meter || i < 20) {
				p.push(x);
			}
			else {
				p.pop();
			}
		}
		imprimir(p);
	}
	

}
