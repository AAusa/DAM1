package preparacionExamen;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[]args) {
		String simbolos = "$$$@@@#%<>";
		char simbolo1;
		String combinacion="";
		int saldo;
		int premio;
		int jugar=1;
		int num;
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("saldo:");
		saldo = teclado.nextInt();
		
		while(saldo>0 && jugar==1) {
			for(int i=0; i<3; i++) {
				num = (int) (Math.random()*10+1);
				simbolo1=simbolos.charAt(num);
				System.out.print(simbolo1);
				combinacion+=simbolo1;
			}
			switch(combinacion) {
			case "$$$":
				premio=50;break;
			case "$@@":
				premio=25;break;
			case "$##":
				premio=15;break;
			case "@@@":
				premio=10;break;
			case "@##":
				premio=5;break;
			case "@$$":
				premio=3;break;
			case "###":
				premio=1;break;
			case "%%%":
				premio=1;break;
			case "<<<":
				premio=1;break;
			case ">>>":
				premio=1;break;
			case "$@%":
				premio=1;break;
			default:
				premio=-1;
			}
			saldo+=premio;
			System.out.println("Resultado "+premio);
			System.out.println("Tienes "+saldo);
			System.out.println("Pulsa 1 para seguir jugando");
			System.out.println("Pulsa un nº !1 para finalizar");
			jugar=teclado.nextInt();
		}
		System.out.println("terminado");
	}
}
