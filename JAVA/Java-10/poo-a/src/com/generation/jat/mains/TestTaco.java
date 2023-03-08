package com.generation.jat.mains;

import com.generation.jat.clases.Taco;
import com.generation.jat.clases.TacoPreparar;

public class TestTaco {

	public static void main(String[] args) {
		Taco tq = new Taco("maiz", "carne", 5, "mediana", 15);
		TacoPreparar tn = new TacoPreparar();
		
		tq.setGuisado("pollo");
		System.out.println("Tu taco es de: " + tq.getGuisado());
		
		tq.setPrecio((float) 15.0);
		System.out.println("El taco te sale en: " + tq.getPrecio());
		
		tn.subirPrecio();
		
		tn.vender(3);
		System.out.println("Son: " + tn.vender(3) + " pesos de 3 tacos");
		
		System.out.println(tq.toString());
		

	}

}
