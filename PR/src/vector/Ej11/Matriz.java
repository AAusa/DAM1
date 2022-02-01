package vector.Ej11;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	int [][] matriz;
	int [][] matriz2;
	public void instanciar(int filas, int columnas) {
		matriz = new int [filas][columnas];	
		matriz2 = new int [filas][columnas];
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				matriz[fila][columna] = 3;
				matriz2[fila][columna] = 2;
			}
		}
	}
	
	public void nFila_nColumna(int filas, int columnas) {
		System.out.println("Filas: "+matriz[filas].length);
		System.out.println("Columnas: "+matriz[columnas].length);
	}
	public void AsignarValorCelda(int filas, int columnas, int valor) {
		matriz[filas][columnas] = valor;
		System.out.println("EL valor introducido es: "+matriz[filas][columnas]);
	}
	public void leerCelda(int filas, int columnas) {
		System.out.println("El valor de la direccion es: "+matriz[filas][columnas]);
	}
	public void sumaMatrices(int filas, int columnas) {
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				System.out.println("Suma: "+(matriz[fila][columna] + matriz2[fila][columna]));
			}
		}	
	}
	public void restaMatrices(int filas, int columnas) {
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				System.out.println("Resta: "+(matriz[fila][columna] - matriz2[fila][columna]));
			}
		}	
	}
	public void multiplicaMatrices(int filas, int columnas) {
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				System.out.println("Multiplica: "+(matriz[fila][columna] * matriz2[fila][columna]));
			}
		}	
	}
	public static void main(String[] args) {
		Matriz matriz1 = new Matriz();
		System.out.println("Filas crear:");
		Scanner teclado = new Scanner(System.in);
		int filasCrea = teclado.nextInt();
		System.out.println("Columnas crear:");
		int columnasCrea = teclado.nextInt();
		
		matriz1.instanciar(filasCrea, columnasCrea);
		matriz1.sumaMatrices(filasCrea, columnasCrea);
		matriz1.restaMatrices(filasCrea, columnasCrea);
		matriz1.multiplicaMatrices(filasCrea, columnasCrea);
		/**
		System.out.println("Fila:");
		int filas = teclado.nextInt();
		System.out.println("Columna:");
		int columnas = teclado.nextInt();
		System.out.println("Valor:");
		int valor = teclado.nextInt();
		matriz1.nFila_nColumna(filas, columnas);
		matriz1.AsignarValorCelda(filas, columnas, valor);
		matriz1.leerCelda(filas, columnas);
		**/
	}
}
