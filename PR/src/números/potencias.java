/**
 * n --> base
 * e --> exponente maximo
 * for(i=1;i<=e;i++)
 * resultado --> n^i
 * Hay q multiplicar la base por si misma i veces.
 */
package números;

import java.util.Scanner;

public class potencias {


	public static void main(String[] args) {
		int n;
		int e;
		int resultado;
		
		System.out.println("Introduzca la base: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		System.out.println("Introduzca el máximo exponente: ");
		e = teclado.nextInt();
		
		for(int i=1;i<=e;i++) {
			resultado = (int) Math.pow(n,i);
			System.out.println(resultado);
		}
	}


}
