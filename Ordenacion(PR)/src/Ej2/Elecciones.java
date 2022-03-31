package Ej2;

public class Elecciones {
	int partidos;
	int esca�os;
	int[] votos;
	int[]resultados;
	int sumaVotos;
	public Elecciones() {
		
	}
	public Elecciones(int partidos, int esca�os, int[] votos) {
		this.partidos = partidos;
		this.esca�os = esca�os;
		this.votos = votos;
		resultados = new int[partidos*esca�os];
	}
	public void dividirVotos() {
		for(int i = 0; i < partidos; i++ ) {
			for(int j = 1; j <= esca�os; j++ ) { 
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
			for(int j = 0; j < esca�os; j++ ) { 
				System.out.println(resultados[j]);
			}
		}
	}
}
