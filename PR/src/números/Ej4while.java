/**
* 10) Dado un numero N le�do por teclado encontrar el numero P primo mas cercano a �l por exceso
*(o que es mayor).
*/
package n�meros;
 
import java.util.Scanner;
 
public class Ej4while {
 
	public static void main(String[] args) {
 
		int contador = 2;
		boolean primo=true;
		int numero;
		System.out.println("Introduzca un numero: ");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		
		while ((primo==true) && (contador!=numero)){
		  if (numero % contador == 0) {
			  primo = false;
			  System.out.println("no primo");
		  }
		 	  
		  contador++;
		}
		if (primo == true) {
			  
			  System.out.println("primo");
		  }
		
	}
 
}
