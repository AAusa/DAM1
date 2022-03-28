import java.util.Random;

public class Prueba {

	public static void main(String[] args) {
		int aOrdenar = 1;
		int ordenado = 0;
		int contador = 0;
		int cantidad = 3;
		int [] lista = new int [3];
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
		/*
		int menor;
		int contenidoMenor = 0;
		cantidad = 5;
		for(int i = 0; i < cantidad; i++) {
			menor = i;
			//1º Seleccion del menor
			for(int j = i+1; j < cantidad; j ++) {
				if(lista[j] < lista[menor]) {
					menor = j;
				}	
			}
			if(i != menor) {
				//Guardar contenido del menor en variable:
				lista[menor] = contenidoMenor;
				// Intercambio de valores entre lista[menor] y lista[i]
				lista[menor] = lista[i];
				lista[i] = contenidoMenor;
			}
		}
		*/	
		/*
		boolean ordenado;
		int elMenor = 0;
		for(int i = 0; i < cantidad; i++) {
			System.out.println(lista[i]);
		}
		System.out.println();
		for(int i = 0; i < cantidad - 1; i ++) {
			ordenado = true;
			for(int j = 0; j < cantidad - (i + 1); j++) {
				if(lista[j+1] < lista[j]) {
					ordenado = false;
					lista[j+1] = elMenor;
					lista[j+1] = lista[j];
					lista[j] = elMenor;
				}
			}
			// if (ordenado)
		}
		
		boolean ordenado;
		int elMenor = 0;
		for(int i = 0; i < cantidad; i++) {
			System.out.println(lista[i]);
		}
		System.out.println();
		for(int i = 0; i < cantidad - 1; i ++) {
			for(int j = cantidad - 1; j <= i; i++) {
				if(lista[j+1] < lista[j]) {
					ordenado = false;
					lista[j+1] = elMenor;
					lista[j+1] = lista[j];
					lista[j] = elMenor;
				}
			}
		}*/
		/*
		int elMenor = 0;
		boolean ordenadoTodo = false;
		int i = 0;
		do {
			//Pasadas pares ordena en un sentido:
			if(i == 0 | i % 2 == 0) {
				for(int j = 0; j < cantidad - (j + 1); j++) {
					if(lista[j+1] < lista[j]) {
						ordenadoTodo = false;
						lista[j+1] = elMenor;
						lista[j+1] = lista[j];
						lista[j] = elMenor;
					}
				}
			}
			//Pasadas impares ordena en un sentido:
			else {
				for(int j = cantidad - 1; j <= i; i++) {
					if(lista[j+1] < lista[j]) {
						ordenadoTodo = false;
						lista[j+1] = elMenor;
						lista[j+1] = lista[j];
						lista[j] = elMenor;
					}
				}
			}
		}
			while(ordenadoTodo = false);
	
		int u = cantidad - 1;
		int p = 0;
		do {
			for(int j = u; j <= p; j--) {
				if(lista[j+1] < lista[j]) {
					ordenadoTodo = false;
					lista[j+1] = elMenor;
					lista[j+1] = lista[j];
					lista[j] = elMenor;
				}			
			}
			p++;
			for(int j = p; j <= u; j++) {
				if(lista[j+1] < lista[j]) {
					ordenadoTodo = false;
					lista[j+1] = elMenor;
					lista[j+1] = lista[j];
					lista[j] = elMenor;
				}
			u--;
		}
		while (p < u);
		for(int x = 0; x < cantidad; x++) {
			System.out.println(lista[x]);
		}
	
	}
		//De un lado a otro:
		int u = cantidad - 1;
		int p = 0, elMenor = 0;
		boolean ordenado1 = false;
		int [] valores = {9,5,3,1};
		int i = 0;
				do {
					while(ordenado1) {
						ordenado1 = true;
						for(int j = u; j <= p; j--) {
 							if(lista[j] < lista[j+i]) {
 								lista[j+i] = elMenor;
 								lista[j+i] = lista[j];
 								lista[j+i] = elMenor;
 								ordenado1 = false;
							}			
						}
						p++;
					}
					i++;
						
				}
				while (p < u && ordenado1);
				for(int x = 0; x < cantidad; x++) {
					System.out.println(lista[x]);
				}
		
		int desplazamiento = 0; 
		boolean ordenado = false;
		k = valores[0];
		int [] valores = {9,5,3,1};
		
		do {
			ordenado = true;
			
			for(int i = 0; i < cantidad -1 -k; i++) {
				if(lista[i] < lista[i+k]) {
					swap(i,i+k);
					ordenado = false;
				}
				if(ordenado && desplazamiento < valores.length) {
					k = valores[desplazamiento];
					desplazamiento++;
					ordenado = false;
				}
			}
		}
		while(!ordenado);
		
		
		int [] h = {9,5,3,1};
		//vector de valores con los que comprobar:
		for(int k = 0; k < h.length; k++) {
			int m = h[k];
			for(int i = 0; i < cantidad - m; i++) {
				int j = i;
				int aux = lista[j+m];
				while(j >= 0 && lista[i] > lista[j+m]) {
					// intercambio:
					lista [j+m] = lista [j];
					// para que haga el intercambio 
					//el numero de veces como j-m se necesite
					j = j - m;
				}
				// se pone el numero a analizar en la posicion que debe estar
				lista [j+m] = aux;
		
		for (int i = 1; i < cantidad; i++) {
			int aux = lista[0];
			int j = i - 1;
			// Entre los ordenados, se busca la posición en la que debe estar:
			while (j >= 0 && lista[j] > aux) {
				//Cambia el menor por la posición del mayor (lo hace tantas veces como en la parte ordenada se tenga que correr lista[i] hasta que esté ordenado):
				lista [j + 1] = lista [j];
				//Lo  mismo que: lista [i] = lista [j];
				j --;
			}
		aux = lista [j];
		}
		
		
		for(int x = 0; x < cantidad; x++) {
			System.out.println(lista[x]);
		}
		
		int k;
		for(int i = ini; i <= fin; i++) {
			if(lista[k] > lista[i]) {
				j = i - 1;
				int aux = lista[i];
				while(j > k && lista[j] > aux) {
					lista[j+1] = lista[j];
					j--;
				}
				lista[k] = aux;
				k = i;
			}
		}
		
		int [] h = {9,5,3,1};
		//vector de valores con los que comprobar:
		int ini = 0;
		int fin = h.length;
		int j;
		for(int i = ini; i <= fin; i++) {
			if(lista[k] > lista[i]) {
				j = i - 1;
				int aux = lista[i];
				while(j > k && lista[j] > aux) {
					lista[j+1] = lista[j];
					j--;
				}
				lista[k] = aux;
				k = i;
			}
		}
		//pivotaje:
		if(ini >= fin) {
			return;
		}
		int ini, fin; 
		int aux = lista[ini];
		int i = ini, j = fin;
		do {
			while(lista[i] < aux) i++;
			while(lista[i] > aux) j--;
			swap(i,j);
		}
		while(i < j);
		//ordenar ambas partes:
		qsort(ini, i-1);
		qsort(j+1, fin);*/
		
		final int TAM = 100_000;
		Random r = new Random();
		int [] vector = new int[TAM];
		for(int i = 0; i < TAM; i++) {
			vector[i] = (int)(Math.random()*MAX)+1;
			vector[i] = r.nextInt()MAX+1;
		}
		
		long t, tiempo;
		int pruebas;
		for(int i = 0; i < pruebas; i++) {
			t = System.currentTimeMillis();
			k.ordenar();
			t += System.currentTimeMillis();
			
		}
		tiempo /= pruebas;
		
	}
	
}
