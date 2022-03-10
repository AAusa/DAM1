package exception.Ej1;

import java.util.Scanner;

public class Conductor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		int altura = 0;
		Alumno [] alu = new Alumno[2];
		for(int i = 0; i < 2; i++) {
			alu[i] = new Alumno();
		}	
		System.out.println(alu[0].Comparar(alu[0], alu[1]));
	}
}
