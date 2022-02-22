package herencia2.Ej2new;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int nEmpleado = 0, nAdm = 0, nMaq = 0, total = 0, nOrdenador = 0, nMaquina = 0, nAños = 0;
		String estudios = "";
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("nEmpleado: ");
		nEmpleado = teclado.nextInt();
		System.out.print("nAdm: ");
		nAdm = teclado.nextInt();
		System.out.print("nMaq: ");
		nMaquina = teclado.nextInt();	
		total = nEmpleado + nAdm + nMaquina;
		Empleado [] emp = new Empleado[total];
		for(int i = 0; i < total; i++) {
			if(i < nEmpleado) {
				emp[i] = new Empleado();
			}
			else if(i < (nAdm+nEmpleado)) {
				System.out.print("estudios: ");
				estudios = teclado.nextLine();
				System.out.print("nOrdenador: ");
				nOrdenador = teclado.nextInt();
				emp[i] = new Administrativo(estudios, nOrdenador);
			}
			else {
				System.out.print("nMaquina: ");
				nMaquina = teclado.nextInt();
				System.out.print("nAños: ");
				nAños = teclado.nextInt();
				emp[i] = new Maquinista(nMaquina, nAños);
			}
			
		}
		
		for(int i = 0; i < total; i++) {
			if(emp[i] instanceof Administrativo) {
				((Administrativo) emp[i]).visualizarTodosDatos();
			}
			else if(emp[i] instanceof Maquinista) {
				((Maquinista) emp[i]).visualizarTodosDatos();
			}
			else {
				emp[i].visualizarTodosLosDatos();
			}
		}
	}

}
