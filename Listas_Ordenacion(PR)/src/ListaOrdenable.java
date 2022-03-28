// m es una copia de l que es ordenada. l es m sin ordenar.
public abstract class ListaOrdenable extends Lista {
	public abstract void ordenar();
	int [] m;
	Lista k = new Lista();
	public long tiempo() {
		long t, tiempo = 0;
		int pruebas = 10;
		m = m.clone();
		for(int i = 0; i < pruebas; i++) {
			t = System.currentTimeMillis();
			m = m.clone();
			ordenar();
			tiempo += System.currentTimeMillis() - t;
			
		}
		return tiempo /= pruebas;
	}
	public ListaOrdenable(int [] x) {
		m = x;
	}
}
