package com.jat.testers;

import com.jat.clases.*;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(10, 2);
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas cuadrado = new Cuadrado(12);
		FigurasGeometricas triangulo = new Triangulo(5, 3);
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(cuadrado.areas());
		System.out.println(triangulo.areas());
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		System.out.println(cuadrado.toString());
		System.out.println(triangulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
		
		circulo.pedirDatos();
		System.out.println(circulo.toString());
		System.out.println(circulo.areas());
		
		cuadrado.pedirDatos();
		System.out.println(cuadrado.toString());
		System.out.println(cuadrado.areas());
		
		triangulo.pedirDatos();
		System.out.println(triangulo.toString());
		System.out.println(triangulo.areas());
	}

}
