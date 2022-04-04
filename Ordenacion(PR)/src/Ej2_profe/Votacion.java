package Ej2_profe;

import java.util.Arrays;

/*
 * Almacena los datos de unas elecciones y 
 * determina el número de diputados de los partidos
 */
public class Votacion {
	private final int MAXSIZE = 100;
	//lista de partidos con sus votos:
	Partido[] l = new Partido[MAXSIZE];
	// cantidad de partidos en este momento en la lista:
	int partidos = 0; 
	int diputados;
	Partido[] e = null;
	
	public Votacion (int diputados) {
		this.diputados = diputados;
	}
	
	public void insertarVotos (String partido, int votos) {
		e = null;
		for (int i = 0; i < partidos; i++) {
			if (l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return;
			}
		}
		l[partidos++] = new Partido(partido, votos);
	}
	/*
	 * Determina el numero de los diputados de cada partido con los datos actuales
	 */
	public void calcular () {
		int votosTotal = 0;
		Partido[] aux = new Partido[diputados*partidos];
		for (int i = 0; i < partidos; i++) {
			votosTotal += l[i].getVotos();
		}
		int porcentaje = (int)(votosTotal / 100.0 * 5);
		for (int i = 0; i < partidos; i++) {
			if(l[i].getVotos() >= porcentaje) {
				aux[i] = l[i];
			}
			else {
				aux[i] = new Partido(l[i].getNombre(),0);
			}
			votosTotal += l[i].getVotos();
		}
		for (int i = partidos; i < diputados*partidos; i++) {
			int auxPartido = i % partidos; //calcula el numero de partido (0 o 1 o 2 o 3)
			int divisor = i / partidos + 1; //
			aux[i] = new Partido(aux[auxPartido].getNombre(),
								 aux[auxPartido].getVotos()/divisor);
		}
		Arrays.sort(aux);
		e = new Partido[diputados];
		for (int i = 0; i < diputados; i++) {
			e[i] = aux[i];
			
		}
	}
	public String toString () {
		/* AL HABER OBJETOS VACÍOS ES NECESARIO CREAR EL RESTO
		for (int i = partidos; i < MAXSIZE; i++) {
			l[i] = new Partido("Px", 50000);
		}
		Arrays.sort(l);*/
		if (e == null) {
			return "No ha sido calculado";
		}
		String salida = "Partido\tVotos";
		for (int i = 0; i < diputados; i++) {
			salida += "\n"+l[i].getNombre()+"\t"+l[i].getVotos();
		}
		return salida;
	}
}
