/**
 * 
 */
package ClasesObjetos2.Ej4;

import java.util.Arrays;

/**
 * @author alu
 *
 */
public class Cuentas {
	CuentaCorriente [] cuentas = new CuentaCorriente [100];
	int [] saldos = new int[100];
	
	private void generarSaldos() {
		for(int i = 0; i < 100; i++) {
			saldos[i] = (int) (Math.random()*100+1);
		}
		Arrays.sort(saldos);
	}
	
	private void generarDatosCuenta() {
		String codigo = "";
		String titular = "Juan";

		for(int j = 0; j < 9; j++) {
			codigo = (int) (Math.random()*9+1)+"";
		}	
		CuentaCorriente objCuenta = new CuentaCorriente(titular, codigo);
		cuentas[100] = objCuenta;
		Arrays.sort(saldos);
	}
}
