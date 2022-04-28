package Prueba;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Juego[] juegos = new Juego[20];
		Random r = new Random();
		/*
		Juego j = new Juego(0,1); // gana 1º piedra
		System.out.println("Gana: "+j.ganar());
		
		Juego j1 = new Juego(1,0); // gana 2º papel
		System.out.println("Gana: "+j1.ganar());
		
		System.out.println("Piedra -->  0\nPapel -->   1\nTijera -->  2\nOtro -->    3\nLagarto --> 4\n");
		
		Juego j2 = new Juego(r.nextInt(5), r.nextInt(5)); // gana 2º otro
		System.out.println("Gana: "+j2.ganar());
			
		Juego j3 = new Juego(r.nextInt(5),r.nextInt(5)); // gana 2º otro
		System.out.println("Gana: "+j3.ganar());
		
		
		for(Juego x : juegos) {
			x = new Juego(r.nextInt(5), r.nextInt(5));
			System.out.println("\t- Gana: "+x.ganar());
		}
		*/
		
		for(int i = 0; i < juegos.length; i++) {
			juegos[i] = new Juego(r.nextInt(5), r.nextInt(5));
			System.out.println("\t- Gana: "+juegos[i].ganar());
			/*
			if(i == juegos.length-1) {
				juegos[i].resultados();
			}
			*/
		}
	}

}
