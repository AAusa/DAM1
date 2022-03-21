public class Automovil extends Vehiculo {
	
	public void pintar(int nuevoColor) {
		color = nuevoColor;
		precioPintura = 600;
	}
	
	public boolean debeRevisarse(int km, int dias) {
		if(km >= 15000 && dias >= 360) {
			return true;
		}
		else {
			return false;
		}
	}
}
