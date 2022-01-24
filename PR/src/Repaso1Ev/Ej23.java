package Repaso1Ev;

import java.util.Scanner;
public class Ej23 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 *  Mientras num > 16
				hex += (num % 16)
				num = num / 16
			Fin mientras
			
			
			contador, para giro valores
		 */
		int num=0;
		int numIni=0;
		int opcion=0;
		int contador=0;
		String hexIncorrecto="";
		String hexCorrecto="";
		String octalIncorrecto="";
		String octalCorrecto="";
		String binarioIncorrecto="";
		String binarioCorrecto="";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número:");
		numIni=teclado.nextInt();
		System.out.println("Introduce una opción de conversión a: 1:binario, 2: octal, 3: hexadecimal:");
		opcion=teclado.nextInt();
		num = numIni;
		// BINARIO:
		if(num > 0 && opcion == 1) {
			while(num != 1) {
				if(num % 2 == 0) {
					binarioIncorrecto += 0;
					num = num / 2;
				}
				else {
					binarioIncorrecto += 1;
					num=(num-1) / 2;
				}
			}
			System.out.println("El número "+numIni+" en binario es: "+binarioCorrecto);
		}
		
		// OCTAL:
		if(num > 0 && opcion == 2) {
			while(num >= 1) {
				octalIncorrecto += (num % 8);
				num = num / 8;
			}
			for(contador = octalIncorrecto.length()-1; contador>=0; contador--) {
				octalCorrecto += octalIncorrecto.charAt(contador);
			}
			System.out.println("El número "+numIni+" en octal es: "+octalCorrecto);
		}
		
		// HEX:
		if(num > 0 && opcion == 3) {
			while(num >= 1) {
				if(num % 16 == 10) {
					hexIncorrecto += "A";
				}
				else if (num % 16 == 11) {
					hexIncorrecto += "B";
				}
				else if (num % 16 == 12) {
					hexIncorrecto += "C";
				}
				else if (num % 16 == 13) {
					hexIncorrecto += "D";
				}
				else if (num % 16 == 14) {
					hexIncorrecto += "E";
				}
				else if (num % 16 == 15) {
					hexIncorrecto += "F";
				}
				else {
					hexIncorrecto += (num % 16);
				}
				num = num / 16;
			}
			for(contador = hexIncorrecto.length()-1; contador>=0; contador--) {
				hexCorrecto += hexIncorrecto.charAt(contador);
			}
			System.out.println("El número "+numIni+" en hexadecimal es: "+hexCorrecto);
		}
	}
}
