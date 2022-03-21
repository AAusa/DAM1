public class Examen {
	public static void main (String[]args) {
		final int VEHICULOS = 1000000;
		Vehiculo [] v = new Vehiculo[VEHICULOS];
		int tipoVehiculo, ejes;
		String salida = ""; 
		
		//Asignar tipoVehiculo:
		for(int i = 0; i < VEHICULOS; i ++) {
			tipoVehiculo = (int)(Math.random()*3)+1;
			if (tipoVehiculo == 1) {
				v[i] = new Automovil();
			}
			else if (tipoVehiculo == 2) {
				ejes = (int)(Math.random()*2)+2;
				v[i] = new Furgoneta(ejes);
			}
			else if (tipoVehiculo == 3) {
				ejes = (int)(Math.random()*3)+4;
				v[i] = new Camion(ejes);
			}
			
			//Asignar color (asigna 0 o 1 al colorBase):
			if ((int)(Math.random()*2)+1 == 1) {
				v[i].pintar((int)(Math.random() * Vehiculo.colorBase + 1));
			}
		}
		//lectura:
		for(int i = 0; i < VEHICULOS; i ++) {
			if (v[i] instanceof Automovil) {
				salida = "Automovil\t"+v[i].getEjes()+"\t";
			}
			else if (v[i] instanceof Furgoneta) {
				salida = "Furgoneta\t"+v[i].getEjes()+"\t";
			}
			else if (v[i] instanceof Camion) {
				salida = "Camion\t"+v[i].getEjes()+"\t";
			}
			if (v[i].getColor() != 0b111111111111111111111111) {
				salida += v[i].getColor() + v[i].precioPintura();
			}
			System.out.println(salida);
		}
		
		
	}
}
