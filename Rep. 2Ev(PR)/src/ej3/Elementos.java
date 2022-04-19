package ej3;

import java.util.Arrays;
import java.util.Random;

public class Elementos {

		final int TAM = 100;
		int[] vector;
		public Elementos() {
			vector = new int[TAM];
			rellenar();
		}
		
		private void rellenar() {
			Random r = new Random();
			// rellena vector
			for(int i = 0; i < vector.length; i++) {
				vector[i] = r.nextInt(501);
			}
		}
		
		public void ordenar() {
			Arrays.sort(vector);
		}
		
		public void imprimir() {
			System.out.println("Mayor: "+vector[vector.length-1]);
			System.out.println("\nMenor: "+vector[0]);
		}
}
