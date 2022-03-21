
public class Furgoneta extends Vehiculo {
	int ejes;
	public Furgoneta(int ejes) {
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void pintar(int nuevoColor) {
		color = nuevoColor;
		precioPintura = 500 + 100 * ejes;
	}
	
	public boolean debeRevisarse(int km, int dias) {
		if(km >= 12000 && dias >= 180) {
			return true;
		}
		else {
			return false;
		}
	}
}
