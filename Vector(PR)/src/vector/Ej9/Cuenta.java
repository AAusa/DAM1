package vector.Ej9;

import java.util.Scanner;

public class Cuenta {
	public void notaMenu(int indiceMenu) {
		int precioMenu = 0;
		if(indiceMenu < 101) {
			Menu menu1 = new Menu();
			menu1.construccionMenus(indiceMenu);
			menu1.todosMenus(indiceMenu);
		}
	}
}
