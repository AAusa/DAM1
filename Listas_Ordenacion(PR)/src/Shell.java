public class Shell extends ListaOrdenable {

	public Shell(int[]m) {
		super(m);
	}
	public void ordenar() {
		int [] h = {9,5,3,1};
		for(int k=0;k<h.length;k++){
			int n=h[k];
			for(int i =0;i<m.length-n;i++) {
				int j=i;
				int aux = m[i+n];
				while(j>=0 && m[i]>aux) {
					m[j+n]=m[j];
					j-=n;
				}
				m[j+n]=aux;
			}
		}
		
	}

}