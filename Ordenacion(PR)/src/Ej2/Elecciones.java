package Ej2;

public class Elecciones {
	int partidos;
	int escaños;
	int[] votos;
	int[]resultados;
	int sumaVotos;
	public Elecciones() {
		
	}
	public Elecciones(int partidos, int escaños, int[] votos) {
		this.partidos = partidos;
		this.escaños = escaños;
		this.votos = votos;
		resultados = new int[partidos*escaños];
	}
	public void dividirVotos() {
		for(int i = 0; i < partidos; i++ ) {
			for(int j = 1; j <= escaños; j++ ) { 
				resultados [j] = votos[i] / j;
				sumaVotos += resultados [j];
			}
		}
		for(int i = 0; i < resultados.length; i++ ) {
			if(resultados[i] < (sumaVotos*0.05)) {
				resultados[i] = 0;
			}
		}	
	}
	
	public void imprimir() {
		for(int i = 0; i < partidos; i++ ) {
			System.out.println("Partido:"+i);
			for(int j = 0; j < escaños; j++ ) { 
				System.out.println(resultados[j]);
			}
		}
	}
}
