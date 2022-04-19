package ej9;

public class Domino {
	FichaDomino[] domino = new FichaDomino[28];
	public Domino() {
		int contador = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = i; j < 7; j++) {
				if(i == 0 && j != 0) {
					domino[i] = new FichaDomino(j);
				}
				else if (i == 0) {
					domino[i] = new FichaDomino();
				}
				else {
					domino[i] = new FichaDomino(i,j);
				}	
				System.out.println(contador+":"+domino[contador]);
				contador++;
			}
		}
	}
}