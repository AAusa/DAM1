package cadenas;

import java.util.Scanner;

public class Ej8 {

		public static void main(String[]args) {

			//variables:
			String texto;
			int longitud;
			String mayuscula;
			int resultado;
			String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			String abc_codificado = "DEFGHIJKLMNÑOPQRSTUVWXYZABC";
			char c_cadena;
			char c_abc;
			char cod_abc;
			//Cadena:
			System.out.println("Introduce una cadena menor de 80 caracteres: ");
			Scanner teclado = new Scanner(System.in);	
			texto = teclado.nextLine();
			//Proceso filtro mayus:
			longitud = texto.length();
			mayuscula = texto.toUpperCase();
			resultado = texto.compareTo(mayuscula);
			if (resultado>0) {
				System.out.println("Texto en minusculas");
				
			}
			else {
				System.out.println("Texto en mayusculas");
			for(int i=0;i<longitud;i++) {
				c_cadena=texto.charAt(i);
				switch(c_cadena) {
				case 'A':
					System.out.print('D');break;
				case 'B':
					System.out.print('E');break;
				case 'C':
					System.out.print('F');break;
				case 'D':
					System.out.print('G');break;
				case 'E':
					System.out.print('H');break;
				case 'F':
					System.out.print('I');break;
				case 'G':
					System.out.print('J');break;
				case 'H':
					System.out.print('K');break;
				case 'I':
					System.out.print('L');break;
				case 'J':
					System.out.print('M');break;
				case 'K':
					System.out.print('N');break;
				case 'L':
					System.out.print('Ñ');break;
				case 'M':
					System.out.print('O');break;
				case 'N':
					System.out.print('P');break;
				case 'Ñ':
					System.out.print('Q');break;
				case 'O':
					System.out.print('R');break;
				case 'P':
					System.out.print('S');break;
				case 'Q':
					System.out.print('T');break;
				case 'R':
					System.out.print('U');break;
				case 'S':
					System.out.print('V');break;
				case 'T':
					System.out.print('W');break;
				case 'U':
					System.out.print('X');break;
				case 'V':
					System.out.print('Y');break;
				case 'W':
					System.out.print('Z');break;
				case 'X':
					System.out.print('A');break;
				case 'Y':
					System.out.print('B');break;
				case 'Z':
					System.out.print('C');break;
				
			}
				/**for(int i=0;i<longitud;i++){
					c_cadena=texto.charAt(i);
					for(int j=0;j<27;i++){
						c_abc=abecedario.charAt(j);
						if(c_cadena==c_abc){
							cod_abc=abc_codificado.charAt(i);
							System.out.print(cod_abc);
						}*/
			}
			System.out.print(" y "+texto);
			
			}
	}
}
