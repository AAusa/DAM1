/**
* 10) Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso
*(o que es mayor).
*/
package números;

import java.util.Scanner;

public class Ej10 {

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
				primo=true;
			}
			else {
				numero++;
			}
		}
	}		
}
