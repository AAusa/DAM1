package vector.Ej9;

import java.util.Scanner;

public class Menu {
	Scanner teclado = new Scanner(System.in);
	String [] vPlato = new String[100];
	int [] vMenuPrecio = new int[100];
	public void construccionMenus(int indiceMenu) {
		int indicePlato = 0;
		int precioMenu = 0;
		if(indiceMenu < 100) {
			for(int i = 0; i < indiceMenu*2; i++) {
				
					System.out.println("Que plato te apetece?");
					indicePlato = teclado.nextInt();
					Plato plato1 = new Plato();
					plato1.setNombrePlato(indicePlato);
					System.out.println(plato1.getNombrePlato());
					plato1.setIngrediente(indicePlato);
					System.out.println(plato1.getIngrediente());
					plato1.setPrecio(indicePlato);
					System.out.println(plato1.getPrecio());
					precioMenu = plato1.getPrecio();
					vPlato[i] = plato1.getNombrePlato()+" "+plato1.getIngrediente()+" "+plato1.getPrecio();
				
				vMenuPrecio[i] = precioMenu;
				System.out.println("PrecioMenu: "+precioMenu);
			}
		}
	}
	public void todosMenus(int indiceMenu) {
		int precioTotal = 0, aPagar = 0;
		
		for(int i = 0; i < indiceMenu*2; i++) {
			if(i % 2 == 0) {
				System.out.println("Menu:");	
			}
			System.out.println(vPlato[i]);		
			System.out.println();
			precioTotal += vMenuPrecio[i];
		}
		for(int i = 0; i < indiceMenu*2; i++) {
			System.out.println("Precio plato "+i+" "+vMenuPrecio[i]);
		}
		System.out.println("El precio a pagar son: "+precioTotal);
		System.out.println("Inserte pago:");
		aPagar = teclado.nextInt();
		if(aPagar >= precioTotal) {
			System.out.println("El cambio: "+(aPagar-precioTotal)+" €");
		}
		else {
			System.out.println("Falta dinero");
		}
	}
}
