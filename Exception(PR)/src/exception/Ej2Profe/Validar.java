package exception.Ej2Profe;

import java.io.*;
import java.util.Scanner;

public class Validar {

	static public String pedirCadena() {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String dato="";
		boolean error = true;
		while (error) {
			try {
				dato = dataIn.readLine();
				error=false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor: ");
				error = true;
			}
		}
		return dato;

	}
	
	public boolean VerificaCod() {
		Scanner teclado = new Scanner(System.in); 
		boolean codCorrecto = false;
		String codigo = "";
		int digcorrecto = 0;
		codigo = teclado.nextLine();
			while(!codCorrecto) {
				try {
					if(codigo.length() == 8) {
						for(int i=0; i<=codigo.length()-1; i++) {
							if(codigo.charAt(i) == '0' || codigo.charAt(i) == '1' ||
									codigo.charAt(i) == '2' || codigo.charAt(i) == '3'||
									codigo.charAt(i) == '4' || codigo.charAt(i) == '5' ||
									codigo.charAt(i) == '6' || codigo.charAt(i) == '7' ||
									codigo.charAt(i) == '8' || codigo.charAt(i) == '9') {
								digcorrecto += 1;
							}
						}
						if(digcorrecto == codigo.length()) {
							codCorrecto = true;
						}
						else {
							codCorrecto = false;
						}
					}
					else {
						codCorrecto = true;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					codCorrecto = false;
					codigo = teclado.nextLine();
					digcorrecto = 0;
				}
				
			}
		return codCorrecto;
	}
	
	static public int pedirEnteroValidar() {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		int dato=0;
		boolean error = true;
		while (error) {
			try {
				dato = Integer.parseInt(dataIn.readLine());
				error=false;
			} catch (IOException e) {
				System.out.println(e.getMessage());
				error = true;
			} catch(NumberFormatException e){
				System.out.println("El dato introducido no es entero");
				System.out.println("Vuelve a inroducir el dato, por favor: ");
			}
		}
		return dato;

	}
	
	static public double decimal() {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		double dato=0;
		boolean error = true;
		while (error) {
			try {
				dato = Double.parseDouble(dataIn.readLine());
				error=false;
			} catch (IOException e) {
				System.out.println("Vuelve a inroducir el dato, por favor: ");
				error = true;
			} catch(NumberFormatException e){
				System.out.println("El dato introducido no es entero");
				System.out.println("Vuelve a introducir el dato, por favor: ");
				error=true;
			}
		}
		return dato;

	}
}
