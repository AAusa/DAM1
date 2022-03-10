package ClasesObjetos;

import java.util.Scanner;

public class Ej2 {
	static boolean divisores (int p, int q) {
		boolean masDivP=true;
		int contadorP=1;
		int contadorQ=1;
		int divP=0;
		int divQ=0;
		while(contadorP<p+1) {
			if(p%contadorP==0) {
				divP++;
			}
			contadorP++;
		}
		while(contadorQ<q+1) {
			if(p%contadorQ==0) {
				divQ++;
			}
			contadorQ++;
		}
		if(divP>divQ) {
			masDivP=true;
		}
		else {
			masDivP=false;
		}
		return masDivP;
	}
	public static void main (String[]args) {
		boolean masDivP;
		int p;
		int q;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca p: ");
		p = teclado.nextInt();

		
		System.out.println("Introduzca q: ");
		q = teclado.nextInt();

		masDivP=divisores(p,q);
		if(masDivP==true) {
			System.out.println("P tiene más");
		}
		else {
			System.out.println("Q tiene más");
		}
	
	}
}
