package ClasesObjetos2.Ej5;

import java.util.Scanner;

public class IndicadorMain {
	public static void main (String[]args) {
		
		Indicador vel1 = new Indicador();
		
		System.out.println("Indica la velActual:");
		Scanner teclado = new Scanner (System.in);
		int vActual = teclado.nextInt();
		vel1.setVelActual(vActual);
		//Modificar velActual: vel1.setVelActual(2);
		System.out.println("Si desea incrementar la velocidad pulse 1");
		System.out.println("Si desea decrementar la velocidad pulse 2");
		int opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("¿Cuánta velocidad desea incrementar?");
			int aIncrementar = teclado.nextInt();
			vel1.incrementoVel(vActual, aIncrementar);
			System.out.println(vel1.incrementoVel(vActual, aIncrementar));break;
		case 2:
			System.out.println("¿Cuánta velocidad desea decrementar?");
			int aDecrementar = teclado.nextInt();
			
			System.out.println(vel1.decrementoVel(vActual, aDecrementar));break;	
		default:
			System.out.println("Opción incorrecta");
		}
	}
}
