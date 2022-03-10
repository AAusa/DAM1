package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params salarioHora, salarioSemanal, horasTrabajadas
 * Calcular el salario semanal
 */
public class Ej4 {
	public static int calculoSalario(int horasTrabajadas) {
		int salarioSemanal;
		final int SalarioHora=12;
		salarioSemanal=horasTrabajadas*SalarioHora;		
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
