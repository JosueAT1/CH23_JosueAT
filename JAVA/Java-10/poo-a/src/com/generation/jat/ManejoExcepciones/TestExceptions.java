package com.generation.jat.ManejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) {
		try {
			Division d =  new Division(4,0);
			d.visualizarD();
		} catch (OpExceptions e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Continua..");

	}

}
