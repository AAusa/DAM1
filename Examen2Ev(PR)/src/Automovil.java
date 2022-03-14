public class Automovil extends Vehiculo {

	public int getEjes() {
		return ejes;
	}

	public boolean debeRevisarse() {
		boolean revisar = false;
		if(km > 15000 || dias > 360) {
			revisar = true;
		}
		else {
			revisar = false;
		}
		return revisar;
	}


	
}