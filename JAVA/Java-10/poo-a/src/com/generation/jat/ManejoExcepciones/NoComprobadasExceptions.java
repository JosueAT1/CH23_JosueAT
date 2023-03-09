package com.generation.jat.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.print("Introduzca un valor: ");
		int divisor;
		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/divisor;
			System.out.println("---> " + division);
		} catch (ArithmeticException e) {
			System.out.println("Capturando la exception" + e.getMessage());
		} catch (NumberFormatException nfe) {
			System.out.println("El dato es un caracter" + nfe.getMessage());
		} finally {
			System.out.println("Este blok es opcional y se va a ejecutar con o sin excepcion");
		}
		
		System.out.println("Continuamos con el flujo de la aplicacion");
		
		

	}

}
