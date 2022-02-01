/**
 * 
 */
package ClasesObjetos2.Ej4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author alu
 * ¿Cómo se puede relacionar los datos de un objeto (saldo) con un vector(saldos) para que se impriman el resto de datos del objeto?
 *
 */
public class Cuentas {
	CuentaCorriente [] cuentas = new CuentaCorriente [100];
	int [] saldos = new int[100];
	
	public void generarDatosCuenta() {
		String codigo = "";
		int titularN = 0;
		String titular = "";
		int saldo = 0;
		for(int i = 0; i < 100; i++) {
			titularN = (int)(Math.random()*5+1);	
			switch(titularN) {
			case 0:
				titular = "Pepe"; break;
			case 1:
				titular = "Miguel"; break;
			case 2:
				titular = "Álvaro"; break;
			case 3:
				titular = "Jimena"; break;
			case 4:
				titular = "Mar"; break;
			case 5:
				titular = "Maria"; break;
				}
			saldo = (int)(Math.random()*100+1);	
			saldos[i] = (int)(Math.random()*100+1);	
			
			for(int j = 0; j < 9; j++) {
				codigo += (int) (Math.random()*9+1);
			} 
			
			cuentas[i] = new CuentaCorriente(titular, codigo, saldo);
			codigo = "";
		}
		Arrays.sort(saldos);		
	}
	
	public void comparacionSaldos() {

		for(int i = 0; i < 100; i++) {
			if(saldos[saldos.length-1] == cuentas[i].getSaldo()) {
				System.out.println(cuentas[i].getTitular()+" "+cuentas[i].getCodigo()+" "+cuentas[i].getSaldo());
			}
		}
		Arrays.sort(saldos);
	}
}
