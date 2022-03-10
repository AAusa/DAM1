/**
 * 
 */
package prueba;

import java.util.Scanner;

/**
 * @author Álvaro
 *
 */
public class EjVector {
		
	public String leeHueco() {
		int [] primerVector = new int[10];
		for(int i=0;i < primerVector.length; i++) {
			System.out.println("Introduce num:");
			Scanner teclado = new Scanner(System.in);
			primerVector[i] = teclado.nextInt();
		}
		String mensaje = "";
		for(int i=0;i < primerVector.length; i++) {
			System.out.println("El componente nº "+i+" es "+primerVector[i]);
		}
		return mensaje;
	}
}
