
public class Burbuja extends ListaOrdenable {

	public Burbuja(int[] x) {
		super(x);
	}

	@Override
	public void ordenar() {
		int elMenor = 0;
		boolean ordenado = false;
		for(int i = 0; i < cantidad - 1; i ++) {
			for(int j = cantidad - 1; j <= i; i++) {
				if(m[j+1] < m[j]) {
					ordenado = false;
					m[j+1] = elMenor;
					m[j+1] = m[j];
					m[j] = elMenor;
				}
			// if (ordenado)
			// return;
			}
		}	
	}

}
