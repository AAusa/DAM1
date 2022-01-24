/**
 * 
 */
package números;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int i;
	        int numero;
	        int resultado;
	        int contador = 0;
	        int suma = 0;
	        System.out.println("Introduzca un numero: ");
	        Scanner teclado = new Scanner(System.in);
	        numero = teclado.nextInt();
	        suma=0;
	            for (i=1; i < numero; i++) {
	                resultado = numero % i;
	                if (resultado == 0) {
	                  suma+=i;
	                  contador++;
	                        
	                        
	                }
	             }    
	                     
	            if (suma == numero) {       
	                System.out.println("perfecto");
	            }
	            else {
	                System.out.println("no perfecto");
	            }  

		}		
	}
