package correcci�nExamen;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[]args) {
		/**
		 * Introduce un n� entero
		 * Inicializa un contador = 0
		 * Incializa un contadorAteriscos = 1
		 * Mientras el contador no sea el n� introducido
		 * 		
		 *		Espacios a pintar = n� introducido - linea en la que se encuentra
		 * 		Mientras el contador no sea el n� introducido
		 * 			Se pintan tantos espacios como haya en la variable
		 * 		Fin mientras
		 * 
		 * 		Mientras contadorAsteriscos sea menor o igual que la l�nea en la que se encuentra
		 * 			Pinta *
		 * 		Fin mientras
		 * 
		 * 		Se pintan saltos de l�nea
		 * Fin mientras
		 */
		int introducido=0;	
		int cadaLinea=0;
		int nEspacios=0;
		int cadaEspacio=0;
		int cadaAsterisco=0;

		Scanner teclado=new Scanner(System.in);
		System.out.println("n�:");
		introducido=teclado.nextInt();

		if(introducido<0) {

			//CONTADOR DE CADA SALTO DE L�NEA:
			for(cadaLinea=1;cadaLinea<=introducido;cadaLinea++) {
				nEspacios=introducido-cadaLinea;

				//CONTADOR DE ESPACIOS:
				for(cadaEspacio=1;cadaEspacio<=nEspacios;cadaEspacio++) {
					System.out.print(" ");
				}

				//CONTADOR DE *:
				cadaAsterisco=1;
				for(cadaAsterisco=1;cadaAsterisco<=cadaLinea;cadaAsterisco++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Introduce un n� > que 0");
		}


	}
}
