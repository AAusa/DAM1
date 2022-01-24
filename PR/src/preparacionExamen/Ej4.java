package preparacionExamen;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[]args) {
		/**EXPLICACION:
		 * Si cada caracter cumple el filtro indicado, la palabra es correcta
		 */
		//VARIABLES:
		String frase="";
		String palabra="";
		int longitud_palabra=0;
		char caracter=0;
		int correcto=0;
		int incorrecto=0;
		int posicion_palabra=0;
		int posicion_mas_palabras=0;
		int aparece=0;
		//SE PIDE POR PANTALLA FRASE:
		Scanner teclado=new Scanner(System.in);
		System.out.println("Frase:");
		frase=teclado.nextLine();
		
		//SE PIDE POR PANTALLA PALABRA:
		System.out.println("Palabra:");
		palabra=teclado.nextLine();
			
		//FILTRO DE PALABRA:
		longitud_palabra=palabra.length();
		for(int i=0;i<longitud_palabra;i++) {
			caracter=palabra.charAt(i);
			if((caracter>='a'&&caracter<='z'||caracter=='ñ')||(caracter>='A'&&caracter<='Z'||caracter=='Ñ')||(caracter>='0'&&caracter<='9')) {
				correcto+=1;
			}
			else {
				incorrecto+=1;	
			}
		}
		if(correcto==longitud_palabra) {
			System.out.println("palabra correcta");
			//OBTENER LA POSICION DE LA PALABRA EN LA FRASE:
			posicion_palabra=frase.indexOf(palabra);
			if(posicion_palabra!=-1) {
				System.out.println("La palabra está en la frase");
				aparece=1;
				posicion_mas_palabras=posicion_palabra;
				while(posicion_mas_palabras!=-1) {
					posicion_mas_palabras=frase.indexOf(palabra,posicion_mas_palabras+1);
					if(posicion_mas_palabras!=-1) {
						aparece+=1;
					}
				}
				System.out.println("Nº de veces que la palabra aparece "+aparece);
			}
			else {
				System.out.println("La palabra no está en la frase");
			}
		}
		else {
			System.out.println("palabra incorrecta");
		}
		}
	}
