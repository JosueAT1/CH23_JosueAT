package pruebasJunit.jat.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunit.jat.app.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecutando Before ---> configurandoBefore()");

	}
	@AfterEach
	public void configurandoAfter() {
		ct = null;
		System.out.println("Ejecutando AfterEach() ---> configurandoAfter()");
		System.out.println("***********************************************");

	}
	
	
	@Test
	public void calculadoraNull() {
		assertNull(ct1, "La clase es una instanciada");
		System.out.println("Ejecutando el primer test ---> caluladora");
	}
	

	
	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct, "La clase es una instancia no nula");
		System.out.println("Ejecutando el segundo test ---> calculadora");
	}
	
	/*Primeras pruebas*/
	
	@Test
	public void primerosAssert() {
		/* 
		 * 1.- Indicar que se va a evaluar
		 * 2.- Indicar lo que se va a realizar
		 * 3.- Evaluar con el assert indicado
		 * */
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(6, 4);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test ---> primerosAsssert()");

	}
	@Test
	public void sumarTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, calculadora.sumar(10, 10));
		System.out.println("Ejecutando cuarto test ---> sumarTest()");
	}
	/*Tipos de Assert*/
	@Test
	public void tiposDeAsserts() {
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.2, .5);

	}
	@Test
	public void validandoSuma() {
		assertEquals(11, ct.sumar(5, 6));

	}
	@Test
	public void validandoResta() {
		assertEquals(50, ct.restar(56, 6));

	}
	@Test
	public void validandoRestaNegativa() {
		assertEquals(-10, ct.restar(10, 20));

	}
	@Test
	public void validandoDivision() {
		assertEquals(2, ct.division(10, 5));

	}
	/*
	@Test
	public void validandoDivisionByZero() {
		assertThrows(ArithmeticException.class, 
				()->ct.divisonByZero(10, 0),"No se puede dividir por cero");

	}
	*/
	@Disabled("En espera")
	@Test
	public void validandoDivisionByZero() {
		assertThrows(ArithmeticException.class, 
				()->ct.divisonByZero(10, 1),"No se puede dividir por cero");

	}
	
}
