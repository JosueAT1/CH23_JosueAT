package logica6;

import java.util.Scanner;

public class PalabraAlReves {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese el texto: ");
		String texto = input.nextLine();
		
		char [] arregloTexto = texto.toCharArray();
		
		String textoAlreves = "";
		
		for (int i = arregloTexto.length-1; i >= 0; i--) {
			textoAlreves += arregloTexto[i];
		}
		
		System.out.println("El texto al reves es: " + textoAlreves);
	}
}
