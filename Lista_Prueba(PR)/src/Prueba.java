
public class Prueba {

	public static void main(String[] args) {
		int aOrdenar = 1;
		int ordenado = 0;
		int contador = 0;
		int cantidad = 3;
		int [] lista = new int [5];
		lista[0] = 6;
		lista[1] = 17;
		lista[2] = 4;
		/**
		while(lista[aOrdenar] > lista[ordenado]) {
			//Encontrar elemento aOrdenar:
			while(lista[aOrdenar] > lista[ordenado]) {
				aOrdenar++;
			}
			//Asignar elementos al siguiente lugar
			for(int i = ordenado; i < cantidad; i++) {
				lista[i] = lista[i - 1];
			}
			//Asignar elemento al lugar q corresponde:
			lista[aOrdenar] = lista[ordenado];
			ordenado++;
		}
		
		for (int i = 1; i < cantidad; i++) {
			int j = i - 1;
			int p = 0;
			int u = i - 1;
			int x = lista[i];
			// Busqueda binaria:
			while (p <= u) {
				int m = (p + u) / 2;
				//si está antes la mitad, la mitad será el ultimo elemento
				if (lista[i] < lista[m]) {
					u = m - 1;
				}
				//si está despues de la mitad, la mitad será el primer elemento
				else {
					p = m - 1;
				}
			}
			//desplazamiento a derecha:
			for(int j = i; j > p; j --) {
				lista[j] = lista[j-1];	
			}
			//insercion:
			lista [p] = x;
		}*/
		int menor;
		int contenidoMenor = 0;
		cantidad = 5;
		for(int k = 0; k < cantidad; k++) {
			menor = k;
			//1º Seleccion del menor
			for(int i = k+1; i < cantidad; i ++) {
				if(lista[i] < lista[menor]) {
					menor = i;
				}	
			}
			if(k != menor) {
				lista[menor] = contenidoMenor;
				/*
				//2º Correr posiciones entre la 0 y la menor
				for(int j = 1; j < menor; j++) {
					lista[j] = lista[j-1];
				}*/
				lista[menor] = lista[k];
				//3º Inserto la menor
				lista[k] = contenidoMenor;
			}
		}
			
		for(int i = 0; i < cantidad; i++) {
			System.out.println(lista[i]);
		}
	}
}
