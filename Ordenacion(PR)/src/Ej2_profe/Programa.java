package Ej2_profe;

import java.util.Random;
/* 
 * El resultado sale con los numeros de votos en vez de los escaños que se obtienen
 */
public class Programa {

	public static void main(String[] args) {
		final int MAXVOTOS = 500;
		final int PARTIDOS = 20;
		final int ELECTORES = 724983;
		final int ESCAÑOS = 27;
		
		Random r = new Random();
		Votacion v = new Votacion(ESCAÑOS);
		
		int numVotos;
		int electores = ELECTORES;
		int[] votos = {1000, 25000, 12000, 30000};
		String[] p = new String[PARTIDOS];
		
		// rellenar datos de cada partido:
		for(int i = 1; i <= PARTIDOS; i++) {
			p[i-1] = "P_" + (i < 10 ? 0 : "") + i; 
		}
		
		while (electores > 0) {
			numVotos = r.nextInt(MAXVOTOS);
			//El hecho de que se sume dos es que los que se desborda de PARTIDOS corresponden a nulos
			int auxPartido = r.nextInt(PARTIDOS + 2);
			if (auxPartido < PARTIDOS) {
				v.insertarVotos(p[auxPartido], numVotos);
			}
			electores -= numVotos;	
		}
		v.calcular();
		System.out.println(v.toString());
		
	}

}