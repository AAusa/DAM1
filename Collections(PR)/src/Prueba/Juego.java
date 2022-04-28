package Prueba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Juego {
	HashMap<Integer, String> juego = new HashMap<Integer, String>();
	//ArrayList<String> v1 = new ArrayList<String>();
	//List<String> v2 = new ArrayList<String>();
	int key1, key2;
	
	public Juego(int key1, int key2) {
		juego.put(0, "Piedra");
		juego.put(1, "Papel");
		juego.put(2, "Tijera");
		juego.put(3, "Otro");
		juego.put(4, "Lagarto");
		if(key1 >= 0 && key1 <= 4 &&
		   key2 >= 0 && key2 <= 4) {
			this.key1 = key1;
			this.key2 = key2;
		}
	}
	
	public String ganar() {
		int contador = 0;
		int anterior1 = (key1 == 0) ? 4 : key1 - 1;
		int dosMas1 = (key1 == 4) ? 1 : 
					 (key1 == 3) ? 0 : key1 + 2;
		int anterior2 = (key2 == 0) ? 4 : key2 - 1;
		int dosMas2 = (key2 == 4) ? 1 : 
					 (key2 == 3) ? 0 : key2 + 2;
		if(key1 == anterior2 || key1 == dosMas2) {
			//v1.add(juego.put(contador++, juego.get(key2)));
			return juego.get(key2);
		}
		else if (key1 == key2) {
			return "empate";
		}
		else if(key2 == anterior1 || key2 == dosMas1) {
			//v2.add(juego.put(contador++, juego.get(key1)));
			return juego.get(key1);
		}
		return "no se";
	}
	/*
	public void resultados() {
		System.out.println("Jug.1:");
		for(String x : v1) {
			System.out.println("\t"+x);
		}
		System.out.println("Jug.2:");
		for(String y : v2) {
			System.out.println("\t"+y);
		}
	}
	*/
	
    
    

}
