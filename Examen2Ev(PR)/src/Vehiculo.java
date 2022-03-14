public abstract class Vehiculo implements Revision {
	int precioPintar = 600;
	int km, dias;
	static int colorbase = 0b111111111111111111111111;
	int color = 0b111111111111111111111111;
	static int ejes = 2;
	
	public abstract int getEjes();
	
	public int getColor() {
		return color;
	}
	
	public void pintar(int color) {
		if(color < colorbase && color >= 0) {
			this.color = color;
		}
	}
	
	public void distanciaRecorrida(int Km, int dias) {
		if(km > 0 && dias > 0) {
			this.km += km;
			this.dias += dias;
		}
	}
	
	public void distanciaRecorrida(int Km) {
		distanciaRecorrida(km,1);		
	}
	public int precioPintura() {
		return precioPintar;
	}
	
	abstract public boolean debeRevisarse();
	public void pasarRevision() {
		km = dias = 0;
	}
}