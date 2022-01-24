package cadenas;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables:
				int texto;
				int longitud;
				int resultado;
				int n_mod=0;
				//Cadena:
				System.out.println("Introduce un nº del 1-10: ");
				Scanner teclado = new Scanner(System.in);	
				texto = teclado.nextInt();
				
				
				
					System.out.println("Texto en mayusculas");
					switch(texto) {
					case 1:
						n_mod=4;break;
					case 2:
						n_mod=5;break;
					case 3:
						n_mod=6;break;
					case 4:
						n_mod=7;break;
					case 5:
						n_mod=8;break;
					case 6:
						n_mod=9;break;
					case 7:
						n_mod=10;break;
					case 8:
						n_mod=1;break;
					case 9:
						n_mod=2;break;
					case 10:
						n_mod=3;break;
					
				}
					/**for(int i=0;i<longitud;i++){
						c_cadena=texto.charAt(i);
						for(int j=0;j<27;i++){
							c_abc=abecedario.charAt(j);
							if(c_cadena==c_abc){
								cod_abc=abc_codificado.charAt(i);
								System.out.print(cod_abc);
							}*/
					System.out.println(texto+" y "+n_mod);

	}

}
