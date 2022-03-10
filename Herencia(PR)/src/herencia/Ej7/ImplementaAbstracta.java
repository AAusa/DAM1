package herencia.Ej7;

public class ImplementaAbstracta extends ClaseAbstracta {
	int datoNum;
	String datoString;
	@Override
	public int ejemplo() {
		// TODO Auto-generated method stub
		return 0;
	}
	public ImplementaAbstracta() {
		System.out.println("ImplementaAbstracta");
	}
	public static void main(String[]args) {
		ImplementaAbstracta abs;
		abs = new ImplementaAbstracta();
		
	}
	// error cambio public - package	
	/*
	package int ejemplo3() {
	} */
	@Override
	public int ejemplo3() {
		// TODO Auto-generated method stub
		return 0;
	}
}
