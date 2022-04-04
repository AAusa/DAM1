/**
 * Clase genérica de definicion de una pila con sus operaciones asociadas
 * Es un TAD LIFO
 */
package Ej1_profe;

/**
 * @author alu
 *
 */
public abstract class PilaEnteros {
	
	/*
	 * Número de elementos máximo que soporta la pila
	 */
	public final int MAXSIZE = 100;
	/*
	 * Inserta un entero en la pila
	 * @param x El número a insertar
	 */
	public abstract void push(int x);
	
	/*
	 * Extrae un entero de la pila
	 * @return el numero extraído
	 */
	public abstract int pop();
	
	/*
	 * Devuelve el numero de elementos que hay en la pila
	 * @return x El número de elementos que hay en la pila
	 */
	public abstract int size();
}
