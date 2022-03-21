public abstract class Vehiculo implements Revision {
	static int colorBase = 0b111111111111111111111111;
	int color = colorBase;
	int precioPintura;
	int km;
	int dias;
	int ejes = 2;
	
	public int getEjes() {
		return ejes;
	}
	
	public abstract void pintar(int nuevoColor);
	
	public int getColor() {
		return color;
	}
	
	public int precioPintura() {
		return precioPintura;
	}
	
	public void distanciaRecorrida(int km, int dias) {
		if(km > 0 && dias > 0 && dias < 361) {
			this.km += km;
			this.dias = dias;
		}
	}
	
	public void distanciaRecorrida(int km) {
		distanciaRecorrida(km, 1);
	}
 	
	public abstract boolean debeRevisarse(int km, int dias);
	public void pasarRevision() {
		dias = km = 0;
	}

}
