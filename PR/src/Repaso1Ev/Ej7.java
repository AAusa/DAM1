package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params salarioHora, salarioSemanal, horasTrabajadas
 * Calcular el salario semanal, teniendo en cuenta horas extra
 * Si hora < 41
sueldo = 12*hora
Sino 
	sueldo = 16*sueldo
 */
public class Ej7 {
	public static int calculoSalario(int horasTrabajadas) {
		int salarioSemanal;
		int salarioHora=12;
		if(horasTrabajadas<41) {
			salarioSemanal=horasTrabajadas*salarioHora;	
		}
		else {
			salarioHora=16;
			salarioSemanal=480+(horasTrabajadas-40)*salarioHora;
		}
			
		return salarioSemanal;
	}
	public static void main(String[] args) {
		int horasTrabajadas=0;
		int salarioSemanal=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce las horas trabajadas en una semana:");
		horasTrabajadas=teclado.nextInt();
		salarioSemanal=calculoSalario(horasTrabajadas);
		System.out.println("El salario semanal son: "+salarioSemanal+" €");

	}

}

