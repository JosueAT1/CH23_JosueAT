package com.generation.jat.clases;

public class TacoPreparar {
	Taco tq = new Taco();
	
	public float vender(int numTortilla) {
		return numTortilla * tq.getPrecio();

	}
	
	public void subirPrecio() {
		tq.setPrecio((float) 25.0);
		System.out.println(tq.getPrecio());

	}
}
