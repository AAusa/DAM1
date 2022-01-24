package Repaso1Ev;
import java.util.Scanner;
public class Ej15 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 num, digito
digito.IndexOf(numero)

		 */
		String num="";
		String digito="";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Num:");
		num=teclado.nextLine();
		System.out.println("Digito:");
		digito=teclado.nextLine();
		

		if(digito.indexOf(num)>0) {
			System.out.println("La posicion es: "+digito.indexOf(num));
		}
		else {
			System.out.println("El num no aparece");
		}
	}
}
