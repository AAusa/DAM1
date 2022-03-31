package Ej2;

public class Principal {
	public static void main (String[]args) {
		int partidos = (int)(Math.random()*10)+1;
		int escaños = (int)(Math.random()*10)+1;
		int [] votos = new int[partidos];
		for(int i = 0; i < partidos; i++ ) {
			for(int j = 0; j < votos.length; j++ ) {
				votos[i] = (int)(Math.random()*100)+1;
			}	
		}
		Elecciones e = new Elecciones(partidos, escaños, votos);
		e.dividirVotos();
		e.imprimir();
	}
}
