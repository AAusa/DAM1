package cadenas;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		String texto;
		int longitud;
		String minuscula;
		boolean resultado;
		System.out.println("Introduce una cadena menor de 80 caracteres: ");
		Scanner teclado = new Scanner(System.in);	
		texto = teclado.nextLine();
		longitud = texto.length();
		minuscula = texto.toLowerCase();
		if(longitud<=80) {
			for(int i=0;i<longitud;i++) {
				
				resultado = texto.charAt(i) == minuscula.charAt(i);
				if (resultado == true) {
					System.out.println(texto.charAt(i)+" es minuscula");
				}
				else {
					System.out.println(texto.charAt(i)+" es mayuscula");
				}
			}
		}
		else {
			System.out.println("error");
		}


	}

}
