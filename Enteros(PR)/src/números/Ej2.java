/**
 * Leer un n�mero N que debe filtrarse entre 1 y 10 y a continuaci�n calcular y
 * escribir la tabla de multiplicar de ese n�mero con formato
 * 
 */
package n�meros;

import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[] args) {
	int n;
	int i;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca el numero: ");
	n = teclado.nextInt();
	System.out.println("TABLA DE MULTIPLICAR DE " + n);
	
		for (i = 1; i <= 10; i++) {	
			System.out.println(n + " * " + i + " = " + n * i);

		}
		
	}	

}
