package com.jat.clases;

public abstract class FigurasGeometricas {
	private String nombre;
	
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double areas();
	public abstract void pedirDatos();
	
	//Polimorfismo dinamico
	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	}
	
}
