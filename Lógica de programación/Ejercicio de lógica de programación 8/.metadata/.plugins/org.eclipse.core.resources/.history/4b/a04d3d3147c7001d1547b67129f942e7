package numprim;

import java.util.Scanner;

public class MostrarNumerosPrimos {
	
	public static boolean esPrimo(int n) {
		  // Si el número es menor que 2, no es primo
		  if (n < 2) {
		    return false;
		  }
		  // Si el número es divisible por algún número entre 2 y su raíz cuadrada, no es primo
		  for (int i = 2; i * i <= n; i++) {
		    if (n % i == 0) {
		      return false;
		    }
		  }
		  // Si no se cumple ninguna de las condiciones anteriores, el número es primo
		  return true;
		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada
		
		int[] numeros = new int[10]; // Crea un array de tamaño 10
		// Pide al usuario que ingrese los números y los almacena en el array
		
		for (int i = 0; i < numeros.length; i++) {
		  System.out.print("Ingrese el número " + (i + 1) + ": ");
		  numeros[i] = sc.nextInt();
		}
		
		int inicio = 0; // Índice inicial
		int fin = numeros.length - 1; // Índice final
		// Mientras los índices no se crucen
		while (inicio < fin) {
		   // Si el número en la posición inicial es primo, lo dejamos ahí y avanzamos el índice inicial
		   if (esPrimo(numeros[inicio])) {
		     inicio++;
		   }
		   // Si el número en la posición final no es primo, lo dejamos ahí y retrocedemos el índice final 
		   else if (!esPrimo(numeros[fin])) {
		     fin--;
		   }
		   // Si el número en la posición inicial no es primo y el número en la posición final es primo,
		   // los intercambiamos y actualizamos ambos índices 
		   else {
		     int temp = numeros[inicio];
		     numeros[inicio] = numeros[fin];
		     numeros[fin] = temp;
		     inicio++;
		     fin--;
		   }
		}
		
		System.out.println("Array original:");
		for (int i = 0; i < numeros.length; i++) {
		 System.out.println(i + "- " + numeros[i]);
		}

		// Muestra por consola el array reordenado 
		System.out.println("Array con primos al principio:");
		for (int i = 0; i < numeros.length; i++) {
		 System.out.println(i + "- " + numeros[i]);
		}

	}
	
	

}
