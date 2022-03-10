/**
* 10) Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso
*(o que es mayor).
*/
package números;
 
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
