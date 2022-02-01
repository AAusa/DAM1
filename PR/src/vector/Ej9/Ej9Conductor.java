package vector.Ej9;

import java.util.Scanner;

public class Ej9Conductor {
	public static void main(String[] args) {
		Plato mostrador = new Plato();
		mostrador.mostrador();
		
		System.out.println("Cuantos menus?");
		Scanner teclado = new Scanner(System.in);
		int indiceMenu = teclado.nextInt();
		Cuenta mesa1 = new Cuenta();
		mesa1.notaMenu(indiceMenu);
	}
}

