package ej1;

import java.util.Random;

public class Principal {
	public static void main (String[] args) {
		Vector v = new Vector();
		Random r = new Random();
		for(int i = 0; i < v.MAX; i++) {
			v.numeros[i] = r.nextInt(101);
		}
		v.rellenar();
		System.out.print(v.imprimir());
			
	}
}
