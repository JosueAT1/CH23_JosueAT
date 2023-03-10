package com.jat.clases;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas {
	private double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;

	}

	@Override
	public double areas() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.print("Introduzca el radio: ");
		this.setRadio(datos.nextDouble());
		
	}

}
