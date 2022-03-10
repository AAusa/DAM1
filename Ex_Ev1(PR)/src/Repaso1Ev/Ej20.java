package Repaso1Ev;

import java.util.Scanner;
public class Ej20 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 * eleccionFigura, jug1, jug2, jug3
			contador (i=1;i<=3;i++)
				eleccionFigura aleatorio hasta 5
				Se elige entre:
					1:
						imprime corazón
					...
					5:
						imprime limón
				Si i == 1
					jug1 = eleccionFigura
				Sino
					Si i == 2
						jug2 = eleccionFigura
					Sino
						Si i == 3
							jug3 = eleccionFigura
			Fin contador
			
			Si jug1 == jug2 == jug3
				imprime ha ganado
			Sino
				Si jug1 =! jug2 =! jug3
					imprime ha perdido
				Sino
					imprime ha recuperado la moneda
		 */
		int eleccionFigura=0, jug1=0, jug2=0, jug3=0;
		for(int i=1;i<=3;i++) {
			eleccionFigura=(int)(Math.random()*5+1);
			switch(eleccionFigura) {
			case 1:
				System.out.print("corazón ");break;
			case 2:
				System.out.print("diamante ");break;
			case 3:
				System.out.print("herradura ");break;
			case 4:
				System.out.print("campana ");break;
			case 5:
				System.out.print("limón ");break;	
			}
			if(i == 1) {
				jug1 = eleccionFigura;
			}
			else {
				if(i == 2) {
					jug2 = eleccionFigura;
				}
				else {
					jug3 = eleccionFigura;
				}
			}
		}
		if(jug1 == jug2 && jug1 == jug3) {
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		}
		else {
			if (jug1 != jug2 && jug1 != jug3) {
				System.out.println("Lo siento, ha perdido");
			}
			else {
				System.out.println("Bien, ha recuperado su moneda");
			}
		}
	}
}

