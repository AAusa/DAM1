public class Camion extends Vehiculo {
	int ejes;
	public Camion (int ejes) {
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void pintar(int nuevoColor) {
		color = nuevoColor;
		precioPintura = 300 + 200 * ejes;
	}
	
	public boolean debeRevisarse(int km, int dias) {
		if(km >= 10000 && dias >= 180) {
			return true;
		}
		else {
			return false;
		}
	}
}
