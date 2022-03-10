package ClasesObjetos;

import java.util.Scanner;

public class Ej3 {
	static int factorial (int n) {
		int contador = 0;
		int producto = 1;
		contador=n-1;
		producto=n;
		if (n>0) {
			for (contador=n-1; contador>=1;contador--) {
				producto=producto*contador;
			}
		}
		return producto;
	}		
	
	public static void main (String[]args) {
		int producto;
		int n = 0;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		producto = factorial(n);
		System.out.println("El factorial es "+producto);
	}
}
