package herencia2.Ej2;

import herencia2.Ej2.Empleados;

public class Principal {
	public static void main(String[] args) {
		Empleados adm = new Administrativos();
		Empleados maq = new Maquinistas();
		adm.visualizarTodosDatos();
		maq.visualizarTodosDatos();
	}
}
