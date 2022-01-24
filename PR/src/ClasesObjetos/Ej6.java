package ClasesObjetos;

import java.util.Scanner;

public class Ej6 {
		/**
		 * @param P numero positivo
		 * @param Q numero positivo
		 * @return el mínimo común múltiplo entre P y Q 
		 * PLANTEAMIENTO:
		 * mcm

		   Se pide P
	       Se pide Q

	       Si P>Q
				Si (P * 1...) % Q == 0
	        		comun = P*1		
		   Fin si
		   Sino
				Si (Q * 1...) % P == 0
	        		comun = Q*1
		   Fin sino
		 */
	public static int mcm(int P, int Q) {
		int contador=1;
		int comun=0;
		if(Q>P) {
			while(comun==0) {
				if((P*contador)%Q==0) {
					comun=P*contador;
				}
				contador++;
			}
		}
		else {
			while(comun==0) {
				if((Q*contador)%P==0) {
					comun=Q*contador;
				}
				contador++;
			}
		}
		
		return comun;
	}
	public static void main(String[] args) {
		int P=0;
		int Q=0;
		int comun=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce P:");
		P=teclado.nextInt();
		System.out.println("Introduce Q:");
		Q=teclado.nextInt();
		comun=mcm(P,Q);
		System.out.println("El m.c.m. de "+P+" y "+Q+" es: "+comun);

	}

}
