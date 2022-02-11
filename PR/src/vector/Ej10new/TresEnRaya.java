package vector.Ej10new;

import java.util.Scanner;

/** 
 * <h2>Juego tres en raya, en tablero de 3x3, con fichas: 'O' y 'X'</h2>
 * @author alu
 * @version 2.0 (con métodos)
 */
public class TresEnRaya {
	/** 
	 * @since v.1.0
	 */	
	int jug1Gana = 0, jug2Gana = 0, empate = 0;
	/** 
	 * @since v.1.0
	 */	
	String[][] tablero = new String[3][3];
	/** 
	 * @since v.1.0
	 */	
	static Scanner teclado = new Scanner(System.in);
	
	/** 
	 * @since v.2.0
	 */	
	private void inicializar() {
		//INICIALIZA TABLERO
		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero[fila].length; columna++) {
				tablero[fila][columna] = "_";
			}
		}
		System.out.println("Juego tres en raya :)");
	}
	
	/** 
	 * @since v.1.0
	 */	
	
	private void juego() {
		boolean seguirJug = true;
		int filaJug = 0, columnaJug = 0;
			seguirJug = true;
			// ASIGNACIÓN DE POSICIÓN
			for (int i = 1; i <= 9 && seguirJug; i++) {
				if(i % 2 != 0) {
					System.out.println("Jugador 1: Elige fila (0, 1 o 2):");
					filaJug = teclado.nextInt();
					System.out.println("Jugador 1: Elige columna (0, 1 o 2):");
					columnaJug = teclado.nextInt();
				}
				else {
					System.out.println("Jugador 2: Elige fila (0, 1 o 2):");
					filaJug = teclado.nextInt();
					System.out.println("Jugador 2: Elige columna (0, 1 o 2):");
					columnaJug = teclado.nextInt();
				}
				if (i % 2 != 0) {
					if(tablero[filaJug][columnaJug].equals("_")) {
						tablero[filaJug][columnaJug] = "O";
					}
					else {
						i--;
						System.out.println("Posición ocupada, Escoge otra:");
					}
				} 
				else {
					if(tablero[filaJug][columnaJug].equals("_")) {
						tablero[filaJug][columnaJug] = "X";
					}
					else {
						i--;
						System.out.println("Error");
					}
				}
				//MUESTRA TABLERO
				for (int fila = 0; fila < tablero.length; fila++) {
					
					for (int columna = 0; columna < tablero.length; columna++) {
						System.out.print(tablero[fila][columna]);
						if(columna == 2 && columna != 5) {
							System.out.println();
						}
					}	
				}
				// QUIEN GANA
				if ((tablero[0][0] == "O" && tablero[1][0] == "O" && tablero[2][0] == "O")
						|| (tablero[0][1] == "O" && tablero[1][1] == "O" && tablero[2][1] == "O")
						|| (tablero[0][2] == "O" && tablero[1][2] == "O" && tablero[2][2] == "O")
						|| (tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == "O")
						|| (tablero[1][0] == "O" && tablero[1][1] == "O" && tablero[1][2] == "O")
						|| (tablero[2][0] == "O" && tablero[2][1] == "O" && tablero[2][2] == "O")
						|| (tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O")
						|| (tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O")) {
					jug1Gana++;
					System.out.println("jug1Gana");
					seguirJug = false;
 
				}
				
				else if ((tablero[0][0] == "X" && tablero[1][0] == "X" && tablero[2][0] == "X")
						|| (tablero[0][1] == "X" && tablero[1][1] == "X" && tablero[2][1] == "X")
						|| (tablero[0][2] == "X" && tablero[1][2] == "X" && tablero[2][2] == "X")
						|| (tablero[0][0] == "X" && tablero[0][1] == "X" && tablero[0][2] == "X")
						|| (tablero[1][0] == "X" && tablero[1][1] == "X" && tablero[1][2] == "X")
						|| (tablero[2][0] == "X" && tablero[2][1] == "X" && tablero[2][2] == "X")
						|| (tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X")
						|| (tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X")) {
					jug2Gana++;
					System.out.println("jug1Gana");
					seguirJug = false;
				}
				else {
					if(((tablero[0][0] != "_" && tablero[1][0] != "_" && tablero[2][0] != "_")
							&& (tablero[0][1] != "_" && tablero[1][1] != "_" && tablero[2][1] != "_")
							&& (tablero[0][2] != "_" && tablero[1][2] != "_" && tablero[2][2] != "_"))) {
						empate++;
						System.out.println("empate");
						seguirJug = false;
					}
				}
			}
		}
	
	/** 
	 * @since v.2.0
	 */
	
	private void resultado() {
		
		System.out.println("jug1Gana: "+jug1Gana);
		System.out.println("jug2Gana: "+jug2Gana);
		System.out.println("Empate: "+empate);
		System.out.println("Fin del juego :)");
	}
	
	/** 
	 * @since v.1.0
	 * @param main String[] args
	 */
	
	public static void main(String[] args) {
		TresEnRaya juego = new TresEnRaya();
		int seguir = 1;
		while (seguir == 1) {
			juego.inicializar();
			juego.juego();
			System.out.println("¿Quieres seguir jugando? 1 --> Si, 2 --> No");
			seguir = teclado.nextInt();
		}
		juego.resultado();
	}
}
