package ej9;

/*
 * Representación de una ficha del dominó
 * Una ficha de dominó tiene dos lados, cada uno, con valores del 1 al 6 o el
 * blanco. Vamos a representar dichos valores con los caracteres ' ' (blanco),
 * junto con del '1' al '6'. 
 */

public class Ficha {
	protected char c1;
	protected char c2;
		
	private boolean valido(char x) {
		if (x >= '1' && x <= '6' || x == ' ') {
			return true;
		}
		else 
			return false;
			//return x == ' ' //si no estuviera el or en el if d arriba
			
	}
	public Ficha(char c, char d) {
		if (!(valido(c) && valido(d))) {
			throw new IllegalArgumentException("Carácter no válido");
		}
		c1 = c; c2 = d;
		
	}
	/*
	 * Crea una ficha de domino con valores del 0 al 6; el 0 representa
	 * al blanco
	 * @param c uno de los lados
	 * @param d El otro lado
	 */
	public Ficha(int x, int y) {
		this(x == 0 ? ' ' : (char)('0'+x),
			 y == 0 ? ' ' : (char)('0'+y));
	}
	
	
	public boolean equals (Ficha f) {
		return c1 == f.c1 && c2 == f.c2
		    || c2 == f.c1 && c1 == f.c2;
		
	}
	
	public String toString() { 
		return "["+c1+"|"+c2+"]";
	}
}
