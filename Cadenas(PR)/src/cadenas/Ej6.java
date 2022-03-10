package cadenas;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[]args) {
		String cadena;
		int longitud;	
		int vocal=0;
		int num=0;
		int consonante=0;
		System.out.println("Introduzca un texto: ");
		Scanner teclado = new Scanner(System.in);
		cadena = teclado.nextLine();
		longitud = cadena.length();
		if (longitud<=80) {
			
			for(int i=0;i<longitud;i++) {
				switch(cadena.charAt(i)) {
					case 'a':case 'e': case 'i':case 'o':case 'u':{
						vocal++;	
					}break;
					
					case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':{
						num++;	
					}break;
					default:{
						consonante++;
					}
				
				}	
			}
			System.out.println(vocal + " vocales");
			System.out.println(num + " numeros");
			System.out.println(consonante + " consonantes u espacio");
			
		}
		
		else {
			System.out.println("error");
		}
	}

}
