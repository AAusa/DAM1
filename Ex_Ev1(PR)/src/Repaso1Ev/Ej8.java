package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params h, g, t
 * Calcular el tiempo q tarda en caer un objeto
 */
public class Ej8 {
	public static double caidaObjeto(double h) {
		double t;
		final double G=9.81;
		t=Math.sqrt(2*h/G);
			
		return t;
	}
	public static void main(String[] args) {
		double h=0;
		double t=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la altura (h):");
		h=teclado.nextInt();
		t=caidaObjeto(h);
		System.out.println("El tiempo transcurrido son: "+t+" segundos");

	}

}
