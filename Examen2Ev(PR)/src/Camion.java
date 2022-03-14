public class Camion extends Vehiculo {
	
public final int ejesc;
	
	public Camion(int ejes) {
		ejesc=ejes;
		precioPintar=300+200*ejes;
	}

	public int getEjes() {
		return ejesc;
	}

	public boolean debeRevisarse() {
		boolean revisar = false;
		if(km > 10000 || dias > 180) {
			revisar =  true;
		}
		else {
			revisar = false;
		}
		return revisar;
	}
}