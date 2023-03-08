package com.generation.jat.clases;

public class ClaseGenerica <T> {
	T obj;

	public ClaseGenerica(T obj) {
		this.obj = obj;
	}
	
	public void clasetipo() {
		System.out.println("El tipo T es: " + obj.getClass().getName());

	}
	
}
