
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
}
