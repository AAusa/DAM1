
/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej5 {

	/** SE NECESITA:
	 *	 contador -> cuenta de numeros introducidos
	 * 	 acumulador -> numero introducido
	 *	 auxiliar -->  numero introducido
	 * hacer 
	 *	 leer auxiliar
	 *	 sumar auxiliar al acumulador
	 *	 aumentar acumulador
	 *
	 * 
	 */
	public static void main(String[] args) {
		int n = 0;
		int suma = 0;
		int contador = 0;
		do {
			System.out.println("Introduzca un numero: ");
			Scanner teclado = new Scanner(System.in);
			n = teclado.nextInt();
			suma += n;
			contador++;
		}
		while (n!=0);{
		System.out.println("Contador: " + contador);
		System.out.println("Suma: " + suma);
		}
	}
				
}
