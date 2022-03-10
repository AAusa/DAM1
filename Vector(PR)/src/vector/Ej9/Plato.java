package vector.Ej9;

public class Plato {
	private String nombrePlato;
	private String ingrediente;
	private int precio;
	public String getNombrePlato() {
		return "El nombre del plato es: "+nombrePlato;
	}
	public void setNombrePlato(int indicePlato) {
		if(indicePlato < 7) {
			switch(indicePlato) {
			case 1:
				this.nombrePlato = "judias verdes";
			break;
			case 2:
				this.nombrePlato = "arroz con pollo";
				break;
			case 3:
				this.nombrePlato = "ensalada mixta";
				break;
			case 4:
				this.nombrePlato = "carne a la brasa";
				break;
			case 5:
				this.nombrePlato = "sandwich";
				break;
			case 6:
				this.nombrePlato = "hamburguesa";
				break;
			}
		}
		else {
			this.nombrePlato = "Opcion de plato incorrecta --> PLATO INCORRECTO";
		}
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(int indicePlato) {
		if(indicePlato < 7) {
			switch(indicePlato) {
			case 1:
				this.ingrediente = "judias, patatas";
			break;
			case 2:
				this.ingrediente = "arroz, pollo";
				break;
			case 3:
				this.ingrediente = "lechuga, vinagre, sal, aceite";
				break;
			case 4:
				this.ingrediente =  "carne, patatas";
				break;
			case 5:
				this.ingrediente =  "lechuga, pan, carne, mayonesa";
				break;
			case 6:
				this.ingrediente =  "lechuga, pan, hamburguesa, mayonesa";
				break;
			}
		}
		else {
			this.ingrediente =  "Eleccion del plato incorrecta --> INGREDIENTE INCORRECTO";
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int indicePlato) {
		if(indicePlato < 7) {
			switch(indicePlato) {
			case 1:
				this.precio =  10;
			break;
			case 2:
				this.precio =  11;
				break;
			case 3:
				this.precio =  12;
				break;
			case 4:
				this.precio =  13;
				break;
			case 5:
				this.precio =  14;
				break;
			case 6:
				this.precio =  15;
				break;
			}
		}
		else {
			this.precio = 0;
		}
	}
	
	public void mostrador() {
		System.out.println("Mostrador:");
		System.out.println("judias verdes: judias, patatas --> 10");
		System.out.println("arroz con pollo: arroz, pollo --> 11");
		System.out.println("ensalada mixta: lechuga, vinagre, sal, aceite --> 12");
		System.out.println("carne a la brasa: carne, patatas --> 13");
		System.out.println("sandwich: lechuga, pan, carne, mayonesa --> 14");
		System.out.println("hamburguesa: lechuga, pan, hamburguesa, mayonesa --> 15");
	}
	
	public Plato() {
		this.nombrePlato = "";
		this.ingrediente = "";
		this.precio = 0;
	}
	
}
