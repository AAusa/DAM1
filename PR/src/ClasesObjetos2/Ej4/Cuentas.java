/**
 * 
 */
package ClasesObjetos2.Ej4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author alu
 * �C�mo se puede relacionar los datos de un objeto (saldo) con un vector(saldos) para que se impriman el resto de datos del objeto?
 *
 */
public class Cuentas {
	CuentaCorriente [] cuentas = new CuentaCorriente [100];
	int [] saldos = new int[100];
	
	public void generarDatosCuenta() {
		String codigo = "";
		String titular = "";
		float saldo = 0;
		for(int i = 0; i < 100; i++) {
			saldo = (int) (Math.random()*100+1);
			cuentas[i].setSaldo(saldo);
			for(int j = 0; j < 9; j++) {
				cuentas[i].setCodigo(codigo);
			}
			cuentas[i].setTitular(titular);
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
