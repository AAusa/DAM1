package cadenas;
import java.util.Scanner;
public class Ej1 {
	public static void main (String[]args) {
		String texto;
		int longitud;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena de menos de 80 carácteres:");
		texto = teclado.nextLine();
		longitud = texto.length();
		if(longitud<80) {
			for(int i=0;i<=longitud;i++) {
				System.out.println(texto.substring(0,i));
			}
		}
		else {
			System.out.println("error");
		}	
	}
}
