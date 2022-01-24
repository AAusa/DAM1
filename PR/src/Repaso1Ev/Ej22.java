package Repaso1Ev;
import java.util.Scanner;
public class Ej22 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 *  Mientras num != 2
				octal += (num % 8)
				num = num / 8
			Fin mientras
			octal += 2
			
			contador, para giro valores
		 */
		int num=0;
		int contador=0;
		String octalIncorrecto="";
		String octalCorrecto="";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num=teclado.nextInt();
		
		while(num != 2) {
			octalIncorrecto += (num % 8);
			num = num / 8;
		}
		octalIncorrecto+="2";
		for(contador = octalIncorrecto.length()-1; contador>=0; contador--) {
			octalCorrecto += octalIncorrecto.charAt(contador);
		}
		
		System.out.println("El número "+num+" en octal es: "+octalCorrecto);
	}
}
