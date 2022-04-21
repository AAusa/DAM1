package ej9;

public class FichaJuego extends Ficha {
	// lados ocupados
	boolean ocupado1, ocupado2;
	
	public FichaJuego(char c, char d) {
		super(c,d);
		ocupado1 = ocupado2 = false;
	}

	public FichaJuego(int c, int d) {
		super(c,d);
		ocupado1 = ocupado2 = false;
	}
	public boolean compatible (FichaJuego f) {
		return c1 == f.c1 || c2 == f.c2
			|| c2 == f.c1 || c1 == f.c2;
	}
	
	public void casar (FichaJuego f) {
		if (! compatible(f)) {
			throw new IllegalArgumentException();
		}
		if (c1 == f.c1 && !ocupado1 && f.ocupado2) {
			ocupado1 = true;
			f.ocupado1 = true;
		}
	}
}
