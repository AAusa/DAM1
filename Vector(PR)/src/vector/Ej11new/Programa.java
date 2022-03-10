package vector.Ej11new;

public class Programa {
	static void imprime(Matriz m) {
		for(int i = 1; i <= m.getFilas(); i++) {
			for(int j = 1; j <= m.getColumnas(); j++)
				System.out.print(m.getValor(i, j)+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Matriz m = new Matriz(3);
		Matriz b = new Matriz(3,4);
		for(int i = 1; i <= 9; i++)
			// posicion / filas = nºFila
			// posicion % fila = nºcolumna
			//
			// fila = (posicion - 1) / 3 + 1
			// columna = (posicion - 1) % 3 + 1
			m.setValor((i-1) / 3 + 1, (i-1) % 3 + 1, i);
		for(int i = 1; i <= b.getFilas(); i++) {
			for(int j = 1; j <= b.getColumnas(); j++)
				b.setValor(i, j, 2);
		}
		imprime(b);
		b.suma(b);//Si se pone m, b --> error (tamaño diferente)
		m.producto(m);
		/*
		try {
			double h = b.getValor(5, 0);
		} catch (Exception e) {
			System.out.println("Fallo"+e.getMessage());
		}
		System.out.println("Fin");
		 */
		
	}
	
}
