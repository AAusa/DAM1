package Ej1_profe;

public class PilaVector extends PilaEnteros {
	
	// vector que almacena la pila
	private int[] pila = new int[MAXSIZE]; 
	// �ltima posici�n usada en el vector: elementos en la pila.
	private int cima = 0;
	
	@Override
	public void push(int x) {
		// Si la pila no est� llena
		if (cima < MAXSIZE) {
			pila[cima++] = x;
		}
		else {
			throw new IndexOutOfBoundsException("Pila llena");
		}
	}

	@Override
	public int pop() {
		// Si la pila no est� vac�a
		if(cima > 0) {
			return pila[--cima];
		}
		//return 0;
		throw new IndexOutOfBoundsException("Pila vac�a");
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return cima;
	}

}
