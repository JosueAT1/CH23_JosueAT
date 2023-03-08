package com.generation.jat.clases;

public class AreaPerimetro {
	
	/* Area del cuadrado */
	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}
	
	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;

	}
	
	/* Area del triangulo */
	public double areaTriangulo(int base, int altura) {
		return (base * altura)/2;

	}
	public double perimetoTriangulo(double ladoA, double ladoB, double ladoC) {
		return ladoA + ladoB + ladoC;

	}
	
	/* Area del circulo */
	public double areaCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		return area;

	}
	
	public double perimetroCirculo(double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;

	}
	
	
	
}
