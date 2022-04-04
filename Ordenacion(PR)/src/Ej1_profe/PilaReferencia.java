/**
 * 
 */
package Ej1_profe;

/**
 * @author alu
 *
 */
public class PilaReferencia extends PilaEnteros {
	//Clase que representa un elemento de la pila
	class elementoPila {
		// Elemento de la pila
		int elto;
		// Elemento siguiente
		elementoPila sig;
		
		elementoPila (int x) {
			elto = x;
			sig = null;
		}
	}
	
	// vector que almacena la pila
	elementoPila cima = null;
	int tam = 0; //numero de elementos de la pila
	
	@Override
	public void push(int x) {
		if(tam == MAXSIZE) {
			throw new IndexOutOfBoundsException("Pila llena");
		}
		elementoPila aux = new elementoPila(x);
		aux.sig = cima;
		cima = aux;
		tam++;

	}
	@Override
	public int pop() {
		if(cima != null) {
			elementoPila aux = cima;
			cima = cima.sig;
			tam--;
			return aux.elto;
		}
		//return 0;
		throw new IndexOutOfBoundsException("Pila vacía");
	}

	@Override
	public int size() {
		elementoPila aux = cima;
		int size = 0;
		while (aux != null) {
			size++;
			aux = aux.sig;
		}
		return size;
	}

}
