/*
 * Tratamiento de matrices regulares
 * Filas y columnas se numeran de 1 a N y de 1 a M
 */
package vector.Ej11new;
/*
 * @author alu
 */
public class Matriz {
	protected int filas, columnas;
	private double[][] m;
	/*
	 * @return Número de filas
	 * Devuelve el nº de filas de la matriz regular
	 */
	int getFilas () {
		return filas;
		//return m.length;
	}
	int getColumnas () {
		return columnas;
		//return m[0].length;
	}
	public void hacerCero() {
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				m[i][j] = 0D; //Se convierte 0 a double
	}
	public Matriz(int cuadrada) {
		filas = columnas = cuadrada;
		m = new double[cuadrada][cuadrada];
		hacerCero(); //No hace falta inicializar la matriz, lo hace el compilador de Java
	}
	
	public Matriz(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		m = new double[filas][columnas];
		hacerCero(); //No hace falta inicializar la matriz, lo hace el compilador de Java
	}
	
	public void setValor(int fila, int columna, double valor) {
		m[fila-1][columna-1] = valor;
	}
	public double getValor(int fila, int columna) {
		if(fila < 1 || fila > this.filas)
			throw new IllegalArgumentException("Error en el numero de fila");
		if(columna < 1 || columna > this.columnas)
			throw new IllegalArgumentException("Error en el numero de columnas");
		
		return m[fila-1][columna-1];
	}
	
	public Matriz suma (Matriz b) {
		if(filas != b.filas || columnas != b.columnas) {
			throw new IllegalArgumentException("Matrices de dimensiones diferentes");
		//suma
		}
		System.out.println("OPeracion de suma");
		return null;
	}
	
	public Matriz producto (Matriz b) {
		if(filas != b.filas || columnas != b.columnas) {
			throw new IllegalArgumentException("Matrices no pueden multiplicarse");
		}
		System.out.println("Operacion de multiplicacion");
		/*
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < b.columnas; j++) 
				m[i][j] = 0;
			for(int k = 0; k < columnas; k++)
				m[i][j] += m[i][k] * b.m[i][k];
		return null;*/
		return null;
	}
	/*
	public Matriz producto1 (Matriz c) {
		Matriz p = new Matriz(filas, columnas);
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < filas; j++)
				p.m[i][j] = m[i][j] * c.m;
		return p;
	} */
}
