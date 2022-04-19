package ej4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Restaurante r = new Restaurante();
		Scanner teclado = new Scanner(System.in);
		boolean seguir = true;
		while(seguir) {
			System.out.println("¿Cuántos sois?");
			r.rellenar(teclado.nextInt());
			r.imprimir();
			seguir = teclado.nextBoolean();
		}
		/**
		 * try {
				nPersonas = teclado.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Solo introducir num");
			}
		*/
		 
	}

}
