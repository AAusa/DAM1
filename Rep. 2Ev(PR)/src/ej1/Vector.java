package ej1;

public class Vector {
	final int MAX = 20;
	int[] numeros;
	int[] cuadrado;
	int[] cubo;
	
	public Vector() {
		numeros = new int[MAX];
		cuadrado = new int[MAX];
		cubo = new int[MAX];
	}
	
	public void rellenar() {
		for(int i = 0; i < MAX; i++) {
			cuadrado[i] = numeros[i] * numeros[i];
			cubo[i] = numeros[i] * numeros[i] * numeros[i];
		}
	}
	
	public String imprimir() {
		String salida = "Numero\tCuadrado\tCubo:\n";
		for(int i = 0; i < MAX; i++) {
			salida += numeros[i]+"\t"+cuadrado[i]+"\t"+cubo[i]+"\n";
		}
		return salida;		
	}
}
