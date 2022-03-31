import java.util.Arrays;

/* Ejemplo Clase e Interface Comparable aprenderaprogramar.com */

public class Programa {
    public static void main(String arg[]) {      
        
        Persona p1 = new Persona(74999999,35);
        Persona p2 = new Persona(72759474,30);  
        Persona p3 = new Persona(72759474,45);  
        Persona p4 = new Persona(72759474,1);  
        Persona p5 = new Persona(72759474,32);  
        Persona [] personas = {p1, p2, p3, p4, p5};
        Persona [] personasOrdenadas = personas.clone();
        Arrays.sort(personas);
        
        for(int i = 0; i < personas.length; i++) {
        	System.out.println("Ordenada: "+personas[i].edad+"\t Sin ordenar:"+personasOrdenadas[i].edad);	
        }
    }
}