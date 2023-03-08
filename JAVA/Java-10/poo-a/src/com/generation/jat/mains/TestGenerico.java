package com.generation.jat.mains;

import com.generation.jat.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica<String>("Prueba");
		
		intObj.clasetipo();
		caracteresObj.clasetipo();

	}

}
