package ej9;
/*
 * Creación de la clase fichaDomino
 */
public class FichaDomino {
	int[] ficha = new int[2];
	
	/*
	 * Contructor para las fichas que no tienen un lado blanco
	 * @param lado1
	 * @param lado2
	 */
	public FichaDomino(int lado1, int lado2) {
		if(lado1 < 1 || lado1 > 6 || lado2 < 1 || lado2 > 6) {
			throw new IllegalArgumentException();
		}
		ficha[0] = lado1;
		ficha[1] = lado2;
	}
	
	/*
	 * Contructor para las fichas que tienen un lado blanco
	 * @param lado1
	 */
	public FichaDomino(int lado1) {
		if(lado1 < 1 || lado1 > 6) {
			throw new IllegalArgumentException();
		}
		ficha[0] = lado1;
		ficha[1] = 0; // Asigna el espacio en blanco como 0
	}
	
	public FichaDomino() {
		ficha[0] = 0;
		ficha[1] = 0;
	}
	
	public String toString() { 
		String v0 = ficha[0] == 0 ? " " : (""+ficha[0]);
		String v1 = ficha[1] == 0 ? " " : (""+ficha[1]);
		return "["+v0+"|"+v1+"]";
	}
}
