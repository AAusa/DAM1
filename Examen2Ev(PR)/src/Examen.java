public class Examen {

	public static void main(String[] args) {

		final int VEHICULOS = 1000000;
		Vehiculo[] v = new Vehiculo[VEHICULOS];
		for(int i = 0; i < 1000000; i++) {
			int tipoVehiculo = (int)(Math.random()*3);
			int ejes;
			if(tipoVehiculo == 0) {
				v[i] = new Automovil();
			}
			else if (tipoVehiculo == 1) {
				ejes = (int)(Math.random() * 2) + 2;
				v[i] = new Furgoneta(ejes);
			}
			else {
				ejes = (int)(Math.random() * 3) + 4;
				v[i] = new Camion(ejes);
			}
			if(Math.random() >= 0.5) {
				v[i].pintar((int)(Math.random() * Vehiculo.colorbase + 1));				
			}
		}

		for(int i = 0; i < 1000000; i++) {
			String salida="";
			int ejes;
			if(v[i] instanceof Automovil)
				salida = "Automovil";
			else if(v[i] instanceof Furgoneta)
				salida = "Furgo";

			else 
				salida = "Camion";
				salida += "\t"+v[i].getEjes();
			if(v[i].getColor() != Vehiculo.colorbase)
				salida += "\t"+v[i].getColor()+"\t"+v[i].precioPintura();
			System.out.println(salida);
		}



	}

}