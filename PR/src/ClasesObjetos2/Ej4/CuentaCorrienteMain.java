package ClasesObjetos2.Ej4;

import java.util.Scanner;

/**
 * @author Álvaro
 * 
 *  1º Lectura:
	 *  	Titular
	 *  	Saldo
	 *  	Comprobación del código
	 *  		Guardado en get y set
 *  2º Preguntar que opción realizar
 *  3º Realizar la operacion
 *  		Si es Ingresar --> se realiza
 *  		Si es Retirar --> puede sacar dinero o no
 *  
 *  						  
 *
 */

public class CuentaCorrienteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		String codigo="";
		int opcion=0;
		float aIngresar=0;
		float aRetirar=0;
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente();
		System.out.println("Código: ");
		Scanner teclado = new Scanner (System.in);
		codigo = teclado.nextLine();
		cuentaCorriente1.setCodigo(codigo);
		System.out.println(cuentaCorriente1.getCodigo());
		System.out.println("Si el anterior mensaje indica que el código es incorrecto pulse 0");
		System.out.println("Si desea ingresar dinero pulse 1");
		System.out.println("Si desea retirar dinero pulse 2");
		opcion = teclado.nextInt();
		switch(opcion) {
		case 0:
			System.out.println("Fin de la operación");break;
		case 1:
			System.out.println("¿Cuánto dinero desea ingresar?");
			aIngresar = teclado.nextFloat();
			cuentaCorriente1.setIngresar(aIngresar);
			System.out.println(cuentaCorriente1.ingresarDinero(aIngresar, codigo));break;
		case 2:
			System.out.println("¿Cuánto dinero desea retirar?");
			aRetirar = teclado.nextFloat();
			cuentaCorriente1.setRetirar(aRetirar);
			System.out.println(cuentaCorriente1.puedoSacar(aRetirar));
			System.out.println(cuentaCorriente1.retiraDinero(aRetirar));break;	
		default:
			System.out.println("Opción incorrecta");
			**/
	Cuentas prueba = new Cuentas();
	prueba.generarDatosCuenta();
	prueba.comparacionSaldos();
	}
}
