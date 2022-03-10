package herencia2.Ej2new;

import java.util.Scanner;

public class Administrativo extends Empleado {
	String estudios;
	int nOrdenador;
	public Administrativo(String estudios, int nOrdenador) {
			super();
			this.estudios = estudios;
			this.nOrdenador = nOrdenador;
	}
	void visualizarTodosDatos() {
		visualizarTodosLosDatos();
		System.out.print("Estudios: "+estudios+" ");
		System.out.print("nOrdenador: "+nOrdenador+" ");
	}
}
