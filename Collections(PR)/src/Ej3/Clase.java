package Ej3;

import java.util.HashMap;
import java.util.Iterator;

public class Clase {
	int id;
	HashMap<Integer, Alumno> alumnos = new HashMap<Integer, Alumno>(); // Vector total
	
	
	
	public Clase(Alumno[] clase) {
		for(int i = 0; i < clase.length; i++) {
			alumnos.put(id++, clase[i]);	
		}
	}
	
	
	public String datosAlumnos() {
		Iterator<Integer> it = alumnos.keySet().iterator();
		String salida = "";
		while(it.hasNext()) {
			Integer clave = it.next();
			salida += alumnos.get(clave).nombre+"\t"+alumnos.get(clave).apellido+
					  "\t"+alumnos.get(clave).notaMedia+"\n";
		}
		return salida;
	}
}

