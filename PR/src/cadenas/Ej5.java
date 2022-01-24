package cadenas;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[]args) {
		String cadena;
		int longitud;	
		String contPar = "";
		String contImpar = "";
		
		System.out.println("Introduzca un texto: ");
		Scanner teclado = new Scanner(System.in);
		cadena = teclado.nextLine();
		longitud = cadena.length();
		if (longitud<=80) {
			for (int i=0;i<longitud;i++) {
				
				if (i%2==0) {
					contPar+=cadena.charAt(i);
					
					
				}
				else {
					contImpar+=cadena.charAt(i);
				}
				
			}
			System.out.println(contImpar+" es la cadena impar");
			System.out.println(contPar+" es la cadena par");
		}
		
		
		else {
			System.out.println("error");
		}
	}

}
