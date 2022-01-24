package preparacionExamen;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[]args) {
		int opcion;
		int v1;
		int v2;
		double resultado=0;
		double respuesta=0;
		int correcto=0;
		int incorrecto=0;
		System.out.println("Introduce 1 si quieres realizar una suma");
		System.out.println("Introduce 2 si quieres realizar una division");
		System.out.println("Introduce 3 si quieres realizar un producto");
		Scanner teclado = new Scanner(System.in);	
		opcion = teclado.nextInt();
		for(int i=0; i<=10;i++) {
			v1 = (int) (Math.random()*20+1);
			v2 = (int) (Math.random()*20+1);

			switch(opcion) {
			case 1:
				resultado = v1 + v2;
				System.out.println(v1+" + "+v2);
				respuesta = teclado.nextInt();
				break;
			case 2:
				resultado = v1 / v2;
				System.out.println(v1+" / "+v2);
				respuesta = teclado.nextInt();
				break;	
			case 3:
				resultado = v1 * v2;
				System.out.println(v1+" * "+v2);
				respuesta = teclado.nextInt();
				break;	
			default:
				System.out.println("ERROR.- Introduce 1,2 o 3");
			}
			if(respuesta==resultado) {
				correcto=correcto+1;
			}
			else {
				incorrecto=incorrecto+1;
			}
			System.out.println("Introduce 1 si quieres realizar una suma");
			System.out.println("Introduce 2 si quieres realizar una division");
			System.out.println("Introduce 3 si quieres realizar un producto");
			opcion = teclado.nextInt();
		}
		System.out.println("errores: "+incorrecto);
		System.out.println("aciertos:"+correcto);
		
	
	}
}
