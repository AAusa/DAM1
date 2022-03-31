public class Qsort extends ListaOrdenable{
	int ini,fin;
	public Qsort(int[]m) {
		super(m);
	}
	public void ordenar() {
		ordenar(0,m.length-1);
	}
	private void ordenar(int ini, int fin) {
			if(ini>=fin)return;
			int i = ini;
			int j = fin;
			int pivote = m[ini];
			int aux;
			do{                                                            
				while(m[i] <= pivote && i < j) i++; 
				while(m[j] > pivote) j--;           
				if (i < j) {                                          
					aux= m[i];                     
					m[i]=m[j];
					m[j]=aux;
				}
			}	while(i < j);
			m[ini]=m[j];                                   
			m[j]=pivote;      
				ordenar(ini,j-1);         
				ordenar(j+1,fin);          
		}
		
	}