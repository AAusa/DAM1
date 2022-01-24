/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej4for {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int numero;
		int resultado;
		int contador = 0;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
			for (i=1; i < numero; i++) {
				resultado = numero % i;
				if (resultado == 0) {
						contador++;
				}
			}
			
			if (contador == 1) {
				System.out.println("primo");	
			}
			else {
				System.out.println("No primo");
			}
				
		}
				
	}
