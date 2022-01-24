/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		int divisor;
		int resultado;
		// TODO Auto-generated method stub
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		divisor=n;
		while (divisor >= 1) {			
			resultado = n % divisor;
			if (resultado == 0) {
				System.out.println("El divisor es: " + divisor);
			}
			divisor--;
			
		}
	}
}
