package ClasesObjetos2.Ej4new;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Cuentas {
	CuentaCorriente [] cuentas = new CuentaCorriente[100];
	int [] saldos = new int [100];
	public Cuentas() {
		rellenarVectores();
		compararVectores();
	}
	
	private void rellenarVectores() {
		int i = 0;
		int correcto = 0;
		while (correcto < 100) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Titular: ");
			cuentas[i].setTitular(teclado.nextLine());
			System.out.print("Saldo: ");
			cuentas[i].setSaldo(teclado.nextInt());
			System.out.print("Codigo: ");
			cuentas[i].setCodigo(teclado.nextLine());
			if(cuentas[i].VerificaCod() == true) {
				correcto++;
			}
			Arrays.sort(saldos);
		}
	}
	
	public void compararVectores() {
		for(int i = 0; i < 100; i++) {
			 if(cuentas[i].getSaldo() == saldos[99]) {
				 System.out.println(cuentas[i].getSaldo());
				 System.out.println(cuentas[i].getTitular());
				 System.out.println(cuentas[i].getCodigo());
			 }
		}
	}
}
