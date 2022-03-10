package vector;

/**
 * @author alu
 *
 */
public class Ej4 {

	/**
	 * @param args
	 *  int[] vector = new int[10];
		int[] vector2 = new int[10];
		
		contador(i = 0; i < vector.length; i++)
			vector[i] = random
			contador(j = 0; j < vector.length; j++)
				Si vector[i] == vector2[j]
					cAparece++;
			fin contador
		syso(vector[i] "aparece" cAparece)
		fin contador
		
		+
		syso(vector[i] "aparece" cAparece)
		contador hasta 5
			contador hasta 10
				i == vector[j]
		fin contador
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = new int[10];
		int[] vector2 = new int[10];
		int cAparece = 0;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random()*5+1);
			vector2[i] = (int) (Math.random()*5+1);
		}
		System.out.print("Vector1: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		} 
		System.out.println();
		System.out.print("Vector2: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector2[i]+" ");
		}
		System.out.println();
		
		//CUANTAS VECES CADA ELEMENTO DE UNO EN EL OTRO:
		for (int i = 0; i < vector.length; i++) {
			cAparece = 0;
			for (int j = 0; j < vector2.length; j++) {
				if(vector[i] == vector2[j]) {
					cAparece++;
				}
			}
			System.out.println("elemento "+i+": ("+vector[i]+"): "+cAparece+" veces");
		}
		
	}

}

