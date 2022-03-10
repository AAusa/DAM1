package cadenas;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int opcion;
		int longitud;
		
		System.out.println("Introduzca un texto: ");
		Scanner teclado = new Scanner(System.in);
		
		cadena = teclado.nextLine();
		longitud = cadena.length();
		if(longitud<=80) {
			System.out.println("Minus-->1, Mayus-->2: ");
			opcion = teclado.nextInt();
			switch(opcion) {
				case 1: {
					System.out.println(cadena.toLowerCase()); break;
				}
				case 2: {
					System.out.println(cadena.toUpperCase()); break;
				}
				default:{
					System.out.println("error");	
				}
			}
		}
		else {
			System.out.println("error");	
		}

	}

}
