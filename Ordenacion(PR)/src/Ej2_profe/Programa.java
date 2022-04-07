package Ej2_profe;

import java.util.Random;
/* 
 * El resultado sale con los numeros de votos en vez de los escaños que se obtienen
 */

public class Programa {

	public static void main(String[] args) {
		Random r =new Random();
		final int ELECTORES=724983;
		final int partidos=20;
		final int MAXVOTOS=500;
		final int escaños=27;
		int numVotos;
		int electores=ELECTORES;
		String[] p = new String[partidos];
		
		// rellenar datos de cada partido:
		for (int i = 1; i<=partidos;++i) {
			p[i-1] = "P_" + (i<10 ? "0": "")+i;
		}
		
		Votacion v = new Votacion(escaños);
		
		while (electores >0) {
			numVotos = r.nextInt(MAXVOTOS);
			//El hecho de que se sume dos es que los que se desborda de PARTIDOS corresponden a nulos
			int auxPartido = r.nextInt(partidos+2);
			if(auxPartido < partidos)
				v.insertarVotos(p[auxPartido],numVotos);
			electores -= numVotos;
		}

			
			v.Calcular();
			System.out.println(v);

	}

}