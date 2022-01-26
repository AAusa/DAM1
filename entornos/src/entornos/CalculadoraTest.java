package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calcu = new Calculadora(10,20);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	void testResta() {
		Calculadora calcu = new Calculadora(20,20);
		int resultado = calcu.resta();
		assertEquals(0, resultado);
	}
	
	@Test
	void testRestaNegativo() {
		Calculadora calcu = new Calculadora(20,30);
		int resultado = calcu.resta();
		assertEquals(-10, resultado);
	}
	
	@Test
	void testMultiplicacion() {
		Calculadora calcu = new Calculadora(4,20);
		int resultado = calcu.multiplicacion();
		assertEquals(80, resultado);
	}
	
	@Test
	void testMultiplicacionFalla() {
		Calculadora calcu = new Calculadora(4,20);
		int resultado = calcu.multiplicacion();
		assertEquals(10, resultado);
	}

	@Test
	void testDivision() {
		Calculadora calcu = new Calculadora(20,2);
		int resultado = calcu.division();
		assertEquals(10, resultado);
	}

	@Test
	void testDivisionDivideEntreCero() {
		try {
			Calculadora calcu = new Calculadora(20,0);
			int resultado = calcu.division();
			assertEquals(9, resultado);
		}
		catch(ArithmeticException e) {
			
		}
	}
}
