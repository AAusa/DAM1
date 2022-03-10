/**
 * 11) Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.
 */
package números;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		int numero;
		int resultado;
		boolean primo=false;
		int contador = 0;
		int i=1;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
			
		
		while(primo==false) {
			contador = 0;
			
			
			
			for (i=1; i < numero; i++) {
				resultado = numero % i;
				if (resultado == 0) {
						contador++;
				}
			}
			
			if (contador == 1) {
				System.out.println("el proximo primo es " + numero);
				numero--;
				if (numero==1) {
					primo=true;
				}
			}
			else {
				numero--;
			}
		}
		
	}

}
