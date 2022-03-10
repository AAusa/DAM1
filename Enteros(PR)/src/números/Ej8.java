/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		int contador = 0;
		int producto = 1;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		contador=n-1;
		producto=n;
		if (n>0) {
			for (contador=n-1; contador>=1;contador--) {
				producto=producto*contador;
			}
			System.out.println("El factorial es: " + producto);
			}
		}		
	}
