package com.jat.clases;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas {
	private double lado;
	
	public Cuadrado(double lado) {
		super("Cuadrado");
		this.lado = lado;
	}

	@Override
	public double areas() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.print("Introduzca el lado: ");
		this.setLado(datos.nextDouble());
		
	}

}
