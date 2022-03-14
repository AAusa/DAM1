public class Furgoneta extends Vehiculo  {
	
	public final int ejesf;
	
	public Furgoneta(int ejes) {
		ejesf=ejes;
		precioPintar=500+100*ejes;
	}

	public int getEjes() {
		return ejesf;
	}

	public boolean debeRevisarse() {
		boolean revisar = false;
		if(km > 12000 || dias > 180) {
			revisar =  true;
		}
		else {
			revisar = false;
		}
		return revisar;
	}

}