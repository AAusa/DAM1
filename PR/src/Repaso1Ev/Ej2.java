package Repaso1Ev;

import java.util.Scanner;

public class Ej2 {
	public static int operacion(int P, int Q, int opcion) {
		int comun;
		if(opcion==1) {
			comun=P+Q;
		}
		else {
			if(opcion==2){
				comun=P-Q;
			}
			else {
				if(opcion==3) {
					comun=P*Q;
				}
				else {
					comun=P/Q;
				}
			}
		}
		
		return comun;
	}
	public static void main(String[] args) {
		int P=0;
		int Q=0;
		int opcion=0;
		int comun=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce P:");
		P=teclado.nextInt();
		System.out.println("Introduce Q:");
		Q=teclado.nextInt();
		System.out.println("Introduce 1(+), 2(-), 3(*) o 4(/):");
		opcion=teclado.nextInt();
		comun=operacion(P,Q,opcion);
		System.out.println("El resultado es: "+comun);

	}

}
