import java.util.Random;

public class Principal {
	public static void main(String[]args) {
		Random r = new Random();
		Pila p = new Pila();
		for(int i = 0; i < ((int)(Math.random()*p.MAXSIZE)+1); i++) {
			try {
				p.push((int)(Math.random()*10+1));
			} catch (PilaDesbordeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		for(int i = 0; i < ((int)(Math.random()*p.MAXSIZE)+1); i++) {
			try {
				p.pop();
			} catch (PilaVaciaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	
		System.out.println("Nº de elementos: "+p.size());
		
		for(int i = 0; i < ((int)(Math.random()*p.MAXSIZE)+1); i++) {
			try {
				System.out.println("Contenido de cada elemento eliminado: "+p.verElementos());
			} catch (PilaVaciaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}
