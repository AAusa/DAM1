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
	
	void EjecutarMetodos() {
		try {
			//pideCadena();
			System.out.println("La suma es: "+pideNum());
		} catch(InputMismatchException e1) {
			System.out.println("ERROR.- No int");
		} /*catch(NoSuchElementException e) {
			System.out.println("ERROR.- Cadena vacía");
		}*/
		
	}
	public num_cadena() {
		EjecutarMetodos();
	}
}
