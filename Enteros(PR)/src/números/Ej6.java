/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		int sumaPos = 0;
		int sumaNeg = 0;
		
		int contador = 0;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();

		if (n % 2 == 0) {
			sumaPos = n;
		}
		else {
			sumaNeg = n;
		}
		
		while (n!=0) {
			System.out.println("Introduzca un numero: ");
			Scanner teclado1 = new Scanner(System.in);
			n = teclado1.nextInt();
			
			if (contador % 2 == 0) {
				sumaPos = sumaPos + n;
			}
			else {
				sumaNeg = sumaNeg + n;
			}
			contador++;
			
		}
		
		System.out.println("La suma de los números introducidos impares es " + sumaNeg);
		System.out.println("La suma de los números introducidos pares es " + sumaPos);
		System.out.println("Se han introducido " + contador + " números");
		
				
	}
}
