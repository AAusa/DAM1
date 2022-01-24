/**
 * 
 */
package números;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {

		int respuesta;
		int base;
		int altura;
		int resultado;
		
		System.out.println("Introduzca un numero: ");
		System.out.println("1 para el area del triangulo");
		System.out.println("2 para el area del cuadrado");
		System.out.println("3 para el area del rectangulo");
		Scanner teclado = new Scanner(System.in);
		respuesta = teclado.nextInt();
		
		while(respuesta!=0) {
			
			switch(respuesta) {	
				case 1:
					System.out.println("introduce primero base");
					base = teclado.nextInt();
					System.out.println("introduce altura");
					altura = teclado.nextInt();
					resultado= base*altura/2;
					System.out.println("el area es: " + resultado); break;
				case 2:
					System.out.println("introduce el lado");
					base = teclado.nextInt();
					resultado= base*base;
					System.out.println("el area es: " + resultado); break;
				case 3:
					System.out.println("introduce la base");
					base = teclado.nextInt();
					System.out.println("introduce altura");
					altura = teclado.nextInt();
					resultado= base*altura;
					System.out.println("el area es: " + resultado); 
			}
			System.out.println("Introduzca otro numero o 0 para salir: ");
			respuesta = teclado.nextInt();
					
		}

	}

}
