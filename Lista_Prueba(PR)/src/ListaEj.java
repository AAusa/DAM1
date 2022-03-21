
public class ListaEj {
	String[] Lista = new String[5];
	int cantidad = 0;
	
	public void insertar(String presidente) {
		int i = 0, j;
		
		while(i < cantidad && presidente.compareTo(Lista[i]) < 0) {
			i++;
		}
		if(cantidad != 0 && i< cantidad && presidente.equals(Lista[i])) {
			return;
		}
		j = cantidad;
		while(j > i) {
			Lista [j] = Lista [j - 1];
			j--;
		}
		Lista[i] = presidente;
		/*
		if(Lista[0] == null) {
			Lista[0] = presidente;
		}
			// El que entra va antes que el que está
			if(Lista[cantidad].charAt(0) > presidente.charAt(0)) {
				for(int j = cantidad+1; j < Lista.length; j ++) {
					Lista[j] = Lista[j+1];
				}
				presidente = Lista[cantidad];
			}
			// El que entra va después que el que está
			while(Lista[cantidad].charAt(0) < presidente.charAt(0) || Lista[cantidad].charAt(0) == presidente.charAt(0)) {
				cantidad++;
			}
			for(int j = cantidad+1; cantidad < cantidad - 1; j ++) {
				Lista[j] = Lista[j+1];
			}
				presidente = Lista[cantidad];*/
			
		}
	
		boolean buscar (T o) {
			int i = 0;
			while (o.clave < lista[i].clave) {
				i ++;
			}
			if (o.clave == lista[i].clave) 
				return true;
			else 
				return false;
			//return (o.clave == lista[i].clave)
		}
		
		boolean buscarBinaria (T o) {
			int mitad = cantidad / 2;
			int i = mitad;
			if (o.clave < o.lista[mitad].clave) {
				while (o.clave < lista[i].clave) {
					i --;
				}
				if (o.clave == lista[i].clave) 
					return true;
				else 
					return false;
			}
			else (o.clave > o.lista[mitad].clave) {
				while (o.clave > lista[i].clave) {
					i ++;
				}
				if (o.clave == lista[i].clave) 
					return true;
				else 
					return false;
			}
		}
		
		
		//Buscar dividiendo entre dos por aproximacion
		boolean buscarBinaria (T o) {
			int p = 0;
			int u = cantidad - 1;
			while(p <= u) {
				int m = (p+u)/2;
				//si está en la mitad lo tenemos
				if (o.clave == o.lista[mitad].clave) {
					return true;
				}
				//si está antes la mitad, la mitad será el ultimo elemento
				else if (o.clave < lista[m].clave) {
					u = p;
				}
				//si está despues de la mitad, la mitad será el primer elemento
				else {
					p = m;
				}
			}
			return o.clave == lista[m].clave;
		}
		
	}	

