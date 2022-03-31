public class Burbuja extends ListaOrdenable{

	public Burbuja(int[] m) {
		super(m);
		
	}
	public void ordenar() {
		int x=0;
		int cantidad = m.length;
		boolean ordenado=false;
		for(int i=0; i<cantidad-1;i++){
			ordenado=true;
			for(int j=i; j<cantidad-(i+1);j++){
				if(m[j]>m[j+1]) { 
					x=m[j];
					m[j]=m[j+1];	
					m[j+1]=x;
					ordenado=false;
				}
			}
			for(int j=cantidad-(i+1);j>i;j--) {
				if(m[j-1]>m[j]) { 
					x=m[j];
					m[j]=m[j-1];	
					m[j-1]=x;
					ordenado=false;
				}
			}
			if(ordenado==true)break;
		}
		
	}

}