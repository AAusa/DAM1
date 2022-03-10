/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		int media = 0;
		int contador = 0;
		int mayor = 0;
		int menor = 0;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		media = n;
		mayor=n;
		menor=n;
		while (n!=0) {
			System.out.println("Introduzca un numero: ");
			Scanner teclado1 = new Scanner(System.in);
			n = teclado1.nextInt();
			contador++;
			media = media + n;
			if (n>mayor) {
				mayor = n;
			}
			else {
				mayor = mayor;
			}
			if (n<menor && n!=0) {
				menor = n;
			}
			else {
				menor = menor;
			}
		}
		media = media/contador;
		System.out.println("La media de los números introducidos es " + media);
		System.out.println("El mayor de los números introducidos es " + mayor);	
		System.out.println("El menor de los números introducidos es " + menor);	
		System.out.println("Se han introducido " + contador + " números");
		}
				
	}
