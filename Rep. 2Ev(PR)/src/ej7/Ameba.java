package ej7;

public class Ameba {
	int peso;
	
	public Ameba() {
		peso = 3;
	}
	
	public Ameba(int peso) {
		this.peso = peso;
	}
	
	public int comer(int numMicro) {
		peso += numMicro-1;
		return peso;
	}
	
	public int comer(Ameba ameba) {
		if(peso > ameba.peso) {
			peso += ameba.peso-1;
			ameba.peso = 0;
		}
		return peso;
	}
}
