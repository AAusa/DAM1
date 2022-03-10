package Repaso1Ev;

import java.util.Scanner;

public class Ej1 {
		/**

		 */
	public static double pasoEuroPeseta(double euros) {
		double peseta;
		peseta=euros*166.366;
		return peseta;
	}
	public static void main(String[] args) {
		double euros=0;
		double peseta;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce €:");
		euros=teclado.nextInt();
		peseta=pasoEuroPeseta(euros);
		System.out.println(euros+" € son "+peseta+" pesetas");

	}

}

