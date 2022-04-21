package ej9;

import java.util.Random;

public class Domino {
	Ficha[] domino = new Ficha[28];
	// verdadero si la ficha está en la caja, falso si no
	boolean[] enCaja = new boolean[28];
	int cantidad;
	
	public Domino() {
		
		for(int i = 0; i < 7; i++) {
			for(int j = i; j < 7; j++) {
					domino[cantidad] = new Ficha(i,j);
				System.out.println(cantidad+":"+domino[cantidad]);
				cantidad++;
			}
		}
	}
	
	public Ficha[] getJuego() {
		for(int i = 0; i < domino.length; i++) {
			
		}
		return domino;
	}
	
	public Ficha[] getJuego(int cantidad) throws Exception {
		//NotImplementedException era la que tocaba
		throw new Exception("No implementado");
	}
	/*
	 * Devuelve la ficha del domino solicitada, 
	 * extrayéndola del juego
	 * @param f ficha solicitada
	 * @param ficha de este juego del dominó
	 */
	public Ficha getFicha(Ficha f) {
		for(int i = 0; i < domino.length; i++) {
			if(enCaja[i] && f.equals(domino[i])) {
				enCaja[i] = false;
				return domino[i];
				cantidad--;
			}
		}
		return null;
	}
	
	public Ficha buscarFicha(char c, char d) {
		return getFicha(new Ficha(c,d));
	}
	
	/*
	 * Devuelve una ficha al juego
	 * @param la ficha devolver
	 */
	public void putFicha(Ficha f) {
		for(int i = 0; i < domino.length; i++) {
			if(! enCaja[i] && f == domino[i]) {
				enCaja[i] = true;
			}
		}
		throw new IllegalArgumentException("La ficha no pertenece a este juego");		
	}
	
	public Ficha getFicha() {
		int aux; // posicion de la ficha a devolver
		if (cantidad > 0) return null;
		Random r = new Random();
		do {
			aux = r.nextInt(28);
			if (enCaja[aux]) {
				enCaja[aux] = false;
				cantidad--;
				return domino[aux];
			}
		}
		while(true);
	}
}