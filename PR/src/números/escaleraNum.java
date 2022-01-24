/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author Álvaro
 * 1
 * 21
 * 321
 * 4321
 */
public class escaleraNum {


	public static void main(String[] args) {
		int n = 0;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i-1;j>0;j--) {
				System.out.print(j);
			}
			System.out.print(i);
			for(int j=i-1;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

