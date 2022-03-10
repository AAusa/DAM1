package números;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		int suma = 0;
		// Leo los nº A y B, extremos d los que debo sumar
		
		System.out.println("Introduzca el numero menor: ");
		a = teclado.nextInt();
		System.out.println("Introduzca el numero mayor: ");
		b = teclado.nextInt();

		for (int contador = a+1; contador < b ; contador++ )
		suma += contador;
		System.out.println("La suma es: " + suma);
		
	
	}
}
