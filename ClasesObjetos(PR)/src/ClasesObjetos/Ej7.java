package ClasesObjetos;

import java.util.Scanner;

public class Ej7 {
		/**
		 * PLANTEAMIENTO:
		 * Pide r
		   Pide opcion
			
		   Elige entre opcion
				1
					resultado=2*pi*r
					
				2
					resultado=pi*r*r
				3
					resultado=4/3*PI*r*r*r
			
			return resultado

		 */
	public static double circulo(int radio, int opcion) {
		double resultado=0;
		final double Pi=3.14159;
		switch(opcion) {
		case 1:
			resultado=2*Pi*radio;break;
		case 2:
			resultado=Pi*radio*radio;break;
		case 3:
			resultado=4/3*Pi*radio*radio*radio;break;
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		int radio=0;
		double resultado=0;
		int opcion=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce radio:");
		radio=teclado.nextInt();
		System.out.println("Introduce opción (1,2 o 3):");
		opcion=teclado.nextInt();
		resultado=circulo(radio,opcion);
		System.out.println("El resultado de la opción "+opcion+" es "+resultado);

	}

}
