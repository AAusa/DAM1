package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params hora, min, seg
 * Calcular los seg. hasta medianoche
 * Pide hora 9
		Pide min 1

   Mientras hora != 24
		Si min < 60
			min++
			s+=60
		Sino
			Si min == 60
				min=0 
				hora++
				s+=60
		

 */
public class Ej10 {
	public static int contadorSeg(int hora, int min) {
		int seg=0;
		if(min>=0 && min<=59 && hora>=1 && hora<=24){
			while(hora!=24) {
				if(min < 59) {
					min++;
					seg+=60;
				}
				
				else {
					if(min == 59) {
						min=0;
						hora++;
						seg+=60;
					}
				}
			}
		}
		return seg;
	}
	public static void main(String[] args) {
		int hora=0;
		int seg=0;
		int min=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce hora:");
		hora=teclado.nextInt();
		System.out.println("Introduce min:");
		min=teclado.nextInt();
		seg=contadorSeg(hora,min);
		System.out.println("El tiempo transcurrido son: "+seg+" segundos");

	}

}
