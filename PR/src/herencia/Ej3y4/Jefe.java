package herencia.Ej3y4;

import java.util.Scanner;

public class Jefe extends Empleado {
	String dep;
	int incSueldo;
	public Jefe() {
		RellenarDatosJefe();
	}
	
	//4.1.- Si se llamara RellenarDatos se sobrescribe
	//Para que no se sobrescriba
	public void RellenarDatosJefe() {
		System.out.println("Inf. jefe:");
		Scanner teclado = new Scanner(System.in);
		System.out.print("	Dep: ");
		dep = teclado.nextLine();
		incSueldo = 250;
	}
	
	public void LeerDatosJefe() {
		System.out.println();
		LeerDatos();
		System.out.println("	Dep: "+dep);
		System.out.println("	incSueldo jefe: "+incSueldo);
		
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getIncSueldo() {
		return incSueldo;
	}

	public void setIncSueldo(int incSueldo) {
		this.incSueldo = incSueldo;
	}
}
