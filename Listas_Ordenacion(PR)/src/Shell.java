
public class Shell extends ListaOrdenable {

	public Shell(int[] x) {
		super(x);
	}

	@Override
	public void ordenar() {
		int [] h = {9,5,3,1};
		//vector de valores con los que comprobar:
				for(int k = 0; k < h.length; k++) {
					int u = h[k];
					for(int i = 0; i < cantidad - u; i++) {
						int j = i;
						int aux = m[j+u];
						while(j >= 0 && m[i] > m[j+u]) {
							// intercambio:
							m [j+u] = m [j];
							// para que haga el intercambio 
							//el numero de veces como j-m se necesite
							j = j - u;
						}
						// se pone el numero a analizar en la posicion que debe estar
						m [j+u] = aux;
					}
				}
		
	}

}
