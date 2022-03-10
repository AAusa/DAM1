package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params notaEx1, notaMedia, notaEx2
 * Calcular notaEx2	notaEx2 = notaMedia - notaEx1 * 0,3 / 0,7
 */
public class Ej5 {
	public static double calculoNota(double notaEx1, double notaMedia) {
		double notaEx2;
		notaEx2 = (notaMedia - (notaEx1 * 0.3)) / 0.7;
		return notaEx2;
	}
	public static void main(String[] args) {
		double notaEx1;
		double notaEx2;
		double notaMedia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce notaEx1:");
		notaEx1=teclado.nextDouble();
		System.out.println("Introduce notaMedia:");
		notaMedia=teclado.nextDouble();
		notaEx2=calculoNota(notaEx1, notaMedia);
		System.out.println("La notaEx2 tiene que ser: "+notaEx2);

	}

}
