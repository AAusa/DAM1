package herencia.Ej3;


public class Principal {
	public static void main(String[] args) {
		Empleados adm = new Administrativos();
		Empleados maq = new Maquinistas();
		adm.visualizarMediaEdad();
	}
}
