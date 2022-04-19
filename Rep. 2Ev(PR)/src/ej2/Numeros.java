package ej2;

import java.util.Random;

public class Numeros {
	final int TAM = 20;
	int[] vector;
	int[] vectorOrdenado;
	int[] par;
	int[] impar;
	int cantPares = 0;
	int cantImpares = 0;
	//variables auxiliares para seguir teneiendo la cantidad de cada vector
	int contPar = 0;
	int contImpar = 0;
	public Numeros() {
		vector = new int[TAM];
		rellenar();
	}
	
	private void rellenar() {
		Random r = new Random();
		// rellena vector
		for(int i = 0; i < vector.length; i++) {
			vector[i] = r.nextInt(101);
			// obtiene length de pares e impares
			if(vector[i] % 2 == 0) {
				cantPares++;
			}
			else {
				cantImpares++;
			}
		}
	}
	
	private void rellenarAux() {
		par = new int[cantPares];
		impar = new int[cantImpares];
		contPar = 0;
		contImpar = 0;
		// rellena vectores aux
		for(int i = vector.length-1; i > 0; i--) {
			if(vector[i] % 2 == 0) {
				par[contPar++] = vector[i];
			}
			else {
				impar[contImpar++] = vector[i];
			}
		}
	}
	
	public void ordenar() {
		rellenarAux();
		vectorOrdenado = new int[TAM];
		contPar = 0;
		contImpar = 0;
		int contador = 0;
		System.arraycopy(par, 0, vectorOrdenado, 0, par.length);
		System.arraycopy(impar, 0, vectorOrdenado, par.length, impar.length);
	}
	
	public void imprimir() {
		System.out.println("Vector sin ordenar:");
		for(int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}
		
		System.out.println("\n\nVector ordenado:");
		for(int i = 0; i < vectorOrdenado.length; i++) {
			System.out.print(vectorOrdenado[i]+"\t");
		}
	}
	
	
}
