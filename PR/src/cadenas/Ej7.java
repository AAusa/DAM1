package cadenas;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		String cadena;
		int longitud;	
		int minus=0;
		int num=0;
		int mayus=0;
		System.out.println("Introduzca un texto: ");
		Scanner teclado = new Scanner(System.in);
		cadena = teclado.nextLine();
		longitud = cadena.length();
		if (longitud<=80) {
			
			for(int i=0;i<longitud;i++) {
				switch(cadena.charAt(i)) {
					case 'a': case 'b': case 'c': case 'd':case 'e': case 'f': case 'g': case 'h': case 'i': case 'j': case 'k': case 'l': case 'm': case 'n': case 'ñ': case 'o': case 'q': case 'r': case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'y': case 'z':{
						minus++;	
					}break;
					
					case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':{
						num++;	
					}break;
					default:{
						mayus++;
					}
				
				}	
			}
			System.out.println(minus + " minusculas");
			System.out.println(num + " numeros");
			System.out.println(mayus + "entre mayusculas u espacios");
			
		}
		
		else {
			System.out.println("error");
		}

	}

}
