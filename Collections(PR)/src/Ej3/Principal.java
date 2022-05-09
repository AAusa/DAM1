package Ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		String[] nombres = {"Pepe","Jimena","Pablo","Paula","Raúl",
				"María", "Álvaro", "Marina", "David", "Carmen"};
		String[] apellidos = {"Rodrig","Ausa","Garcia","Gomara","Chamul",
				  "Joe", "Ferrer", "Nebra", "Lopez", "Jimenez"};
		final int TOTAL = 50;
		Alumno[] aux = new Alumno[TOTAL]; //Cada alumno
		Random r = new Random();
		for(int i = 0; i < TOTAL; i++) {
			alumnos.add(new Alumno(nombres[r.nextInt(10)], apellidos[r.nextInt(10)]));
			alumnos.get(i).calculoMedia(r.nextInt(100), r.nextInt(100), r.nextInt(100));
		}
		
		Clase clase = new Clase(aux);
		Collections.sort(alumnos, Alumno.MediaComparator);
		for(int i = 0; i < TOTAL; i++) {
				alumnos.add(new Alumno(nombres[r.nextInt(10)], apellidos[r.nextInt(10)]));
				alumnos.get(i).calculoMedia(r.nextInt(100), r.nextInt(100), r.nextInt(100));
		}
		Collections.sort(alumnos, Alumno.NombreComparator);
	}
}
