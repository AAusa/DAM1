package Repaso1Ev;
import java.util.Scanner;
public class Ej14 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 * 1º For: regula lo que se va a realizar en cada línea
		 * 2º For: imprime n espacios, siendo n, el numero introducido menos la linea en la que se encuentra el programa
		 * 3º For: se escriben tantos * como líneas en la que se encuentra el programa
		 * (4º For: por segunda ocasión, se escriben tantos * como líneas en la que se encuentra el programa
		 */
		int asteriscoIzq=0;
		int num=0;
		int nLinea=0;
		int espacios=0;
		int contEspacios=0;
		int asteriscoDer=0;
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Num:");
		num=teclado.nextInt();
		System.out.println("Opcion(1: arriba, 2: abajo, 3: izq. o 4:der.):");
		opcion=teclado.nextInt();
		if(num>0 && opcion == 1) {
			System.out.println("N="+num);
			for(nLinea=1;nLinea<=num;nLinea++) {
				espacios=num-nLinea;
				for(contEspacios=1;contEspacios<=espacios;contEspacios++) {
					System.out.print(" ");
				}
				asteriscoIzq=1;	
				for(asteriscoIzq=1;asteriscoIzq<=nLinea;asteriscoIzq++) {
					System.out.print("*");
				}
				for(asteriscoDer=1;asteriscoDer<=nLinea;asteriscoDer++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		if(num>0 && opcion == 2) {
			System.out.println("N="+num);
			for(nLinea=num;nLinea>=0;nLinea--) {
				espacios=num-nLinea;
				for(contEspacios=1;contEspacios<=espacios;contEspacios++) {
					System.out.print(" ");
				}
				asteriscoIzq=1;	
				for(asteriscoIzq=1;asteriscoIzq<=nLinea;asteriscoIzq++) {
					System.out.print("*");
				}
				for(asteriscoDer=1;asteriscoDer<=nLinea;asteriscoDer++) {
					System.out.print("*");
				}
				System.out.println("");
			}	
		}
		if(num>0 && opcion == 4) {
			System.out.println("N="+num);
			for(nLinea=1;nLinea<=num;nLinea++) {
				for(asteriscoDer=1;asteriscoDer<=nLinea;asteriscoDer++) {
					System.out.print("*");
				}
				System.out.println("");	
			}
			for(nLinea=num;nLinea>0;nLinea--) {
				for(asteriscoDer=1;asteriscoDer<=nLinea;asteriscoDer++) {
					System.out.print("*");
				}
				System.out.println("");	
			}
		}
		if(num>0 && opcion == 3) {
			System.out.println("N="+num);
			for(nLinea=1;nLinea<=num;nLinea++) {
				espacios=num-nLinea;
				for(contEspacios=1;contEspacios<=espacios;contEspacios++) {
					System.out.print(" ");
				}
				asteriscoIzq=1;	
				for(asteriscoIzq=1;asteriscoIzq<=nLinea;asteriscoIzq++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for(nLinea=num;nLinea>0;nLinea--) {
				espacios=num-nLinea;
				for(contEspacios=1;contEspacios<=espacios;contEspacios++) {
					System.out.print(" ");
				}
				asteriscoIzq=1;	
				for(asteriscoIzq=1;asteriscoIzq<=nLinea;asteriscoIzq++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
	}
}
