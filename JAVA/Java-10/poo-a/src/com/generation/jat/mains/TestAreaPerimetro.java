package com.generation.jat.mains;

import com.generation.jat.clases.AreaPerimetro;
import com.generation.jat.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap =  new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("Area Cuadrado ---> " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro Cuadrado ---> " + fg.getPerimetro());
		
		fg.setArea(ap.areaTriangulo(5, 5));
		System.out.println("Area Triangulo ---> " + fg.getArea());
		
		fg.setPerimetro(ap.perimetoTriangulo(5, 5, 5));
		System.out.println("Perimetro Triangulo ---> " + fg.getPerimetro());
		
		fg.setArea(ap.areaCirculo(2.5));
		System.out.println("Area Circulo ---> " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCirculo(2.5));
		System.out.println("Perimetro Circulo ---> " + fg.getPerimetro());
	}

}
