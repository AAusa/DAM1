package Ej3;

import java.util.Comparator;

public class Alumno {
	String nombre;
	String apellido;
	int notaMedia;
	
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int calculoMedia (int n1, int n2, int n3) {
		notaMedia = (n1 + n2 + n3) / 3;
		return notaMedia;
	}

	
	public static Comparator<Alumno> MediaComparator = new Comparator<Alumno>() {

		@Override
		public int compare(Alumno o1, Alumno o2) {
			return o1.notaMedia - o2.notaMedia;
		}
    };
    
    public static Comparator<Alumno> NombreComparator = new Comparator<Alumno>() {

		@Override
		public int compare(Alumno o1, Alumno o2) {
			return o1.apellido.compareTo(o2.apellido);
		}
    };
}
