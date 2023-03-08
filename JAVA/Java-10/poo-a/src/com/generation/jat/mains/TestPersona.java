package com.generation.jat.mains;

import com.generation.jat.clases.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Maria");
		System.out.println(">>> " + p.getNombre());
	}
}
