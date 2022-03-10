/**
 * Toma de datos: fecha inicial y final
 * Contador_dias = 0
 * Si aIni>aFin
 * 		fecha erronea
 * Sino
 * 		Si mIni>mFin
 * 			fecha erronea
 * 		Sino 
 * 			Si dIni>dFin
 * 				fecha erronea
 *		 
 *
 * Mientras (fecha inicial > fecha final)
 *		contador++
 *		fecha inicial++
 *		
	 *Si a�o % 4 = 0
	 * 		es bisiesto
	 * Sino 
	 * 		no es bisiesto
	 *
	 * En cuanto al mes:
	 * 		Si es: 4,6,9,10
	 * 			diasMes=30
	 *		Si es: 2
	 *			Si es bisiesto
	 *				diasMes=29
	 *			Sino 
	 *				diasMes=28
	 *		El resto:
	 *			diasMes=31	
 *
 *		Si es el �ltimo d�a del a�o
 *			dia_inicial = 1
 *			mes_inicial = 1
 *			a�o_inicial += 1
 *		Sino, 
 *			si es el �ltimo d�a del mes
 *				dia_inicial = 1
 *				mes_inicial += 1
 *			Sino
 *				dia_inicial += 1	
 * Si aIni>aFin
 * 		fecha erronea
 * Sino
 * 		Si mIni>mFin
 * 			fecha erronea
 * 		Sino 
 * 			Si dIni>dFin
 * 				fecha erronea	
 * 
 * MEJORA A�O:
 * Si a�oFin>=a�o+1
 * 		contador=a�oFin-a�o-1
 * 		contador=a�osIntermedios*365
 * 		contador+=a�osIntermedios%4
 * 		contador+=(a�o+1)%4==0?1:0;
 * 		a�o=a�oFin-1;
 * 
 * 
 * MEJORA MES:
 * Si a�o<aFin
 * 		contador+= dFin-dia;
 * 		dia=0;
 * 		mes++;
 * 		Si mes==13
 * 			mes=1;
 *else if(nes<mesFin)
 *		contador+=diaFinal;
 *		mes++;
 *else
 *		contador+=diaF-dia;
 */

/**APRENDER: 
Nombrar variables
Expresion para q entre en condicional: == comparaciones
Asignacion el contenido de una variable a otra: variableFinal=variableInicial
*/
package correcci�nExamen;
import java.util.Scanner;
public class Ej3 {
	public static void main(String[]args) {
		//VARIABLES:
		int dIni=0;
		int mIni=0;
		int aIni=0;

		int dFin=0;
		int mFin=0;
		int aFin=0;

		int dTotal=0;
		int dMes=0;
		boolean erronea=false;
		boolean bisiesto=false;
		boolean correcta=true;
		//FECHA INICIAL:
		Scanner teclado=new Scanner(System.in);
		System.out.print("a�o inicial: ");
		aIni=teclado.nextInt();
		System.out.print("mes inicial: ");
		mIni=teclado.nextInt();
		System.out.print("dia inicial: ");
		dIni=teclado.nextInt();	
		System.out.println();
		//FECHA FINAL:
		System.out.print("a�o final: ");
		aFin=teclado.nextInt();
		System.out.print("mes final: ");
		mFin=teclado.nextInt();
		System.out.print("dia final: ");
		dFin=teclado.nextInt();


		int a�o=aIni;
		int dia=dIni;
		int mes=mIni;

		//VALIDACI�N FECHA INICIAL<FECHA FINAL
		if (!(a�o<aFin || a�o == aFin && (mes < mFin || mes == mFin && dia < dFin))) {
			System.out.println("Error");
		}
		else {
			//MIENTRAS LA FECHA SEA CORRECTA AUMENTO UN D�A EN CADA ITERACI�N:
			while (a�o<aFin || a�o == aFin && (mes < mFin || mes == mFin && dia < dFin)) {


				//BISIESTO:
				if(a�o % 4 == 0) {
					bisiesto=true;
				}
				else {
					bisiesto=false;
				}
				//diasMes:
				switch (mes) {
				case 4,6,9,10:
					dMes=30;break;
				case 2:
					if(bisiesto==true) {
						dMes=29;
					}
					else {
						dMes=28;
					}break;
				default:
					dMes=31;
				}
				//INCREMENTO DE CADA DIA EN CADA CASO:
				if(dia==dMes && mes==12) {
					dia = 1;
					mes = 1;
					a�o += 1;
				}
				else {
					if(dia==dMes) {
						dia = 1;
						mes += 1;
					}
					else {
						dia += 1;	
					}
				}
				dTotal+=1;
			}
			System.out.println(dTotal+" son los dias transcurridos");
		}
	}
}
