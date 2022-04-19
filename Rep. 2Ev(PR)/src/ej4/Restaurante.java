package ej4;

public class Restaurante {
	final int NUMMESAS = 10;
	int[] mesas;
	
	public Restaurante() {
		mesas = new int[NUMMESAS];
	}
	
	private boolean muchasPersonas(int nPersonas) {
		// tener a false la comprobacion es que se puede seguir
		if (nPersonas > 4) return true;
		else return false;
	}
	
	private boolean lleno() {
		// tener a false la comprobacion es que se puede seguir
		for(int i = 0; i < mesas.length; i++) {
			if(mesas[i] == 0) return false;
		}
		return true;
	}
	
	public void rellenar(int nPersonas) {
		if(!muchasPersonas(nPersonas) && !lleno()) {
			int contador = 0;
			while(mesas[contador] != 0) {
				contador++;
			}
			mesas[contador] = nPersonas;
		}
		else if (!muchasPersonas(nPersonas) && lleno()) {
			System.out.println("Está lleno");
		}
		else {
			System.out.println("4 o menos");
		}
	}

	public void imprimir() {
		for(int i = 0; i < mesas.length; i++) {
			System.out.println("Mesa "+(i+1)+": "+mesas[i]);
		}
		
	}
}

