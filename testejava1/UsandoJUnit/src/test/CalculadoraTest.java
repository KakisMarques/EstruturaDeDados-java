package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void somaTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0, 1.0), "Deve resultar 2");
	}
	
	void subTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.sub(1.0, 1.0), "Deve resultar 2");
	}
	
	void multTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.mult(1.0, 1.0), "Deve resultar 2");
	}
	
	void divTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.div(1.0, 1.0), "Deve resultar 2");
	}
	
	void potenciaTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.potencia(1.0, 1.0), "Deve resultar 2");
	}

}
