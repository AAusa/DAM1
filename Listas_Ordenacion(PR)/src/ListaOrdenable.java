public abstract class ListaOrdenable extends Lista {
	int[]m;
	public ListaOrdenable(int[]m) {
		this.m=m.clone();
			l=m.clone();
	}
	public abstract void ordenar();
	public long tiempo() {
		 long tiempo = 0;
		 long t;
		 for(int i = 0; i<5;++i) {
		 t=System.currentTimeMillis(); 
		 m=l.clone();
		 ordenar();
		 tiempo+=(System.currentTimeMillis()-t);
		 }
		 tiempo/=5;
		return tiempo;
	}
	
}
