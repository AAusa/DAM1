package Ej2_profe;

import java.util.Arrays;

/*
 * Almacena los datos de unas elecciones y 
 * determina el número de diputados de los partidos
 */

public class Votacion {

	int conDiputados;
	ListaPartido e=null;
	private final int MAXSIZE = 100;
	//lista de partidos con sus votos:
	ListaPartido l =new ListaPartido();
	// cantidad de partidos en este momento en la lista:
	int partidos = 0;
	int diputados;

	public Votacion(int diputados) {
		this.diputados=diputados;
	}


	public void insertarVotos(String partido, int votos) {
		e=null;
		l.annadirVotos(partido,votos);
	}

	/**
	 * Determina el numero de cada partido con los datos actuales
	 */
	
	public void Calcular() {
		int partidos = l.getCantidad();
		int votosTotal = 0;
		ListaPartido aux = new ListaPartido(diputados*partidos);

		for( int i = 0; i<diputados*partidos; i++) 
			votosTotal += l.getVotos(i);
		
		int porcentaje= (int) (votosTotal / 100.0 * 5);
		for( int i = 0; i<diputados*partidos; i++) {
			
			int auxPartido = i%partidos; //calcula el numero de partido (0 o 1 o 2 o 3)
			int divisor = i/partidos+1;
			aux.insertarVotos(aux.getNombre(auxPartido),l.getVotos(auxPartido)< porcentaje ? 0 :  
								l.getVotos(auxPartido)/divisor);	
		}

		
		/*for( int i = 0; i<partidos; i++)
			int auxPartido = i%partidos;
		int divisor = i/partidos+1;
		aux.insertarVotos(aux.getNombre(auxPartido), 
							aux.getVotos(auxPartido)/divisor);
			if(l.getVotos(i)>=porcentaje)
				aux.insertarVotos(l.getNombre(i), l.getVotos(i));
			else
				aux.insertarVotos(l.getNombre(i),0);
		for(int i = partidos;i<diputados*partidos;i++) {	
			int auxPartido = i%partidos;
			int divisor = i/partidos+1;
			aux.insertarVotos(aux.getNombre(auxPartido), 
								aux.getVotos(auxPartido)/divisor);
		}*/
		aux.ordenar();
		e = new ListaPartido(l.getCantidad());
		//conDiputados=0;
		for(int i = 0; i<diputados; i++) {
			e.annadirVotos(aux.getNombre(i), 1);
		}
	}

	public String toString() {
		/* AL HABER OBJETOS VACÍOS ES NECESARIO CREAR EL RESTO
		for (int i = partidos; i < MAXSIZE; i++) {
			l[i] = new Partido("Px", 50000);
		}
		Arrays.sort(l);*/
		if (e==null)
			return "No ha sido calculado";
		String salida="Partido\tVotos";
		for(int i = 0; i < e.getCantidad(); i++) {
			Partido p = e.getPartido(i);
			salida+="\n"+p.getNombre(i)+"\t"+p.getVotos(i);
		}
		return salida;
	}
}
