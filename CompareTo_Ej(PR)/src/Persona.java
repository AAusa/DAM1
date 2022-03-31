/* Ejemplo Clase e Interface Comparable aprenderaprogramar.com */

public class Persona implements Comparable<Persona>{
         public int dni, edad;
          public Persona( int d, int e){
          this.dni = d;
          this.edad = e;
   }



	public int compareTo(Persona o) {
		if(edad > o.edad) {return 1;}
		else if(edad == o.edad) {return 0;}
		else {return -1;}
    }

}
