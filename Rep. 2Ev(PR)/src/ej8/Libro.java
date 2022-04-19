package ej8;

public class Libro extends Publicacion implements Prestable {
	boolean prestado = false;

	@Override
	public boolean presta() {
		prestado = true;
		return prestado;
	}

	@Override
	public boolean devolver() {
		if (!prestado)
			prestado = true;
		return prestado;
	}

	@Override
	public boolean estaPrestado() {
		if (prestado)
			prestado = true;
		return prestado;
	}
	
}
