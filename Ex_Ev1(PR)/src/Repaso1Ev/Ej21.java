package Repaso1Ev;
import java.util.Scanner;
public class Ej21 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 * num, binario
			Mientras num != 1
				Si num % 2 == 0
					binario += 0
				Sino
					binario += 1
				num=(num-1) / 2;
			Fin mientras
		 */
		int num=0;
		int contador=0;
		String binarioIncorrecto="";
		String binarioCorrecto="";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num=teclado.nextInt();
		
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
		binarioIncorrecto+="1";
		for(contador = binarioIncorrecto.length()-1; contador>=0; contador--) {
			binarioCorrecto += binarioIncorrecto.charAt(contador);
		}
		
		System.out.println("El número "+num+" en binario es: "+binarioCorrecto);
	}
}

