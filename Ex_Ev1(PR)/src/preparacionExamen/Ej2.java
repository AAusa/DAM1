package preparacionExamen;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[]args) {
		int azar;
		int respuesta;
		boolean acierto = false;
		Scanner teclado=new Scanner(System.in);
		azar = (int) (Math.random()*50+1);
		System.out.println(azar);
		for(int i=1;i<=7 && acierto == false;i++) {		
			System.out.println("Valor: ");
			respuesta = teclado.nextInt();
			if (respuesta>azar) {
				System.out.println("Te pasas");
			}
			else if (respuesta==azar) {
				System.out.println("Acierto");
				acierto = true;
				
			}
			else {
				System.out.println("Te quedas corto");
			}
			
		}
		
		
		
	}
}
