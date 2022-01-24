package Repaso1Ev;
import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params hora, saludo
 *  Imprimir un saludo u otro dependiendo de la hora
 */
public class Ej6 {
	public static String queDecir(int hora) {
		String saludo;
		if ((hora>=6)&&(hora<=12)) {
			saludo="Buenos días!";
		}
		else {
			if ((hora>=13)&&(hora<=20)) {
				saludo="Buenas tardes!";
			}
			else {
				saludo="Buenos noches!";		
			}
		}
		return saludo;
	}
	public static void main(String[] args) {
		int hora;
		String saludo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce hora:");
		hora=teclado.nextInt();
		saludo=queDecir(hora);
		System.out.println(saludo);

	}

}
