package ClasesObjetos;

import java.util.Scanner;

public class Ej4 {
	static String esPrimo (int numero) {
		String nPrimo="Los nº primos son: ";
		boolean primo = true;
		int contador=2;
		int cadaNum=numero;
		while (cadaNum>1){
			contador=2;
			while ((contador!=cadaNum) && (primo==true)){
				  if (cadaNum % contador == 0){
					  primo=false;
				  }  
				  contador++; 
				}
			if(primo==true) {
				nPrimo+=cadaNum+" ";
			}
			primo=true;
			cadaNum--;
		}	
		return nPrimo;	
	}
	public static void main (String[]args) {
		int numero;
		boolean primo;
		String nPrimo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero = teclado.nextInt();		
		nPrimo=esPrimo(numero);
		System.out.println(nPrimo);
	}
}

