package logica9.jat;

import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioESEN {

	public static void main(String[] args) {
		// Crea un objeto HashMap que almacene cadenas como clave y valor
		HashMap<String, String> diccionario = new HashMap<String, String>();
		// Agrega algunos pares de palabras al diccionario
		diccionario.put("hola", "hello");
		diccionario.put("adiós", "goodbye");
		diccionario.put("gracias", "thank you");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("rata", "rat");
		diccionario.put("oveja", "sheep");
		diccionario.put("conejo", "rabbit");
		diccionario.put("oso", "bear");
		diccionario.put("delfin", "dolphin");

		Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada
		System.out.print("Ingrese una palabra en español: "); // Pide al usuario que ingrese una palabra
		String palabra = sc.nextLine(); // Lee la palabra ingresada por el usuario
		String traduccion = diccionario.get(palabra); // Obtiene la traducción de la palabra en el diccionario

		if (diccionario.containsKey(palabra)) { // Si la palabra se encuentra en el diccionario
			System.out.println("La palabra en inglés es: " + traduccion); // Imprime su traducción por consola
		} else { // Si la palabra no se encuentra en el diccionario
			System.out.println("La palabra no se encuentra en el diccionario."); // Imprime un mensaje por consola
		}
	}

}
