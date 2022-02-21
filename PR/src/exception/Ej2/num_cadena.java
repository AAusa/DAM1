package exception.Ej2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class num_cadena {
	/*
	String pideCadena() {
		String cadena;
		String cadenaTotal = "";
		for(int i = 0; i < 6; i++) {
			System.out.print("Cadena: ");
			Scanner teclado = new Scanner(System.in);
			cadena = teclado.nextLine();
			cadenaTotal += cadena+". ";
		}
		return cadenaTotal;
	}
	*/
	int pideNum() {
		int num;
		int numTotal = 0;
		for(int i = 0; i < 6; i++) {
			System.out.print("Int: ");
			Scanner teclado = new Scanner(System.in);
			num = teclado.nextInt();
			numTotal += num;
		}
		return numTotal;
	}
	
	String pideCadena() {
		String caracter;
		String cadenaTotal = "";
		for(int i = 0; i < 6; i++) {
			System.out.print("Caracter: ");
			Scanner teclado = new Scanner(System.in);
			caracter = teclado.nextLine();
			if(caracter.charAt(0) >= '0' && caracter.charAt(0) <= '9') {
				throw new InputMismatchException("ERROR.- Introduce num");
			}
			else {
				cadenaTotal += caracter;
			}
		}
		return cadenaTotal;
	}
	
	void EjecutarMetodos() {
		
		try {
			System.out.println("La suma es: "+pideNum());
		} catch(InputMismatchException e1) {
			System.out.println("ERROR.- No int");
		}
		try {
			System.out.println("La de caracteres es: "+pideCadena());
		} catch(InputMismatchException e1) {
			System.out.println(e1.getMessage());
		}
	}
	public num_cadena() {
		EjecutarMetodos();
	}
}
