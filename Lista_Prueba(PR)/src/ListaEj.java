
public class ListaEj {
	String[] Lista = new String[5];
	int cantidad = 0;
	
	public void insertar(String presidente) {
		int i, j;
		
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
		
	}	

