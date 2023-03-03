package Funciones;

public class Funciones {
	
	//Las funciones se puden declarar en cualquier lugar de la clase
    public static int sumar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }//Cierre sumar
    
    public static int resta (int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }//Cierre resta
    
    public static int multiplicar (int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }//Cierre multiplicar
    
    public static int dividir (int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }//Cierre dividir
    
    //Funciones para imprimir asteriscos
    public static void imprimirAsteriscos() {
    	System.out.println("*********************");
    }//Cierre imprimirAsteriscos
    
    //Funcion que combina distintos tipos de valores
    public static float sumaDecimal(float valor1, float valor2) {
    	float resultadoDecimal = valor1 + valor2; 
    	return resultadoDecimal;
    }//Cierre sumaDecimal
    
    //Funcion para preparar aguita de limon
    public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
    	String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
    	return recetaCompletada;
    }

	public static void main(String[] args) {
		System.out.println("El resultado de la suma es: "+ sumar(5,8));
		
		System.out.println("El resultado de la resta es: "+ resta(5,8));
		
		System.out.println("El resultado de la multiplicacion es: "+ multiplicar(5,8));
		
		System.out.println("El resultado de la division es: "+ dividir(5,8));
		
		imprimirAsteriscos();
		
		System.out.println("El resultado de la division es: "+ sumaDecimal(5.7f,5));
		
		imprimirAsteriscos();
		
		System.out.println("Estos son los pasos para preparar aguita de limon: "+ awitaDeLimon("agua", "limon", "azucar"));
		
		
		//Funciones de la biblioteca de matematicas (Math)
		
		double valorEjemplo = 7.65497834d;
		
		System.out.println("La raiz cuadrada de mi valores : " + Math.sqrt(valorEjemplo));
		
		System.out.println("La raiz cuadrada de mi valores : " + Math.sin(valorEjemplo));
		
		System.out.println("La raiz cuadrada de mi valores : " + Math.pow(valorEjemplo,2));
		
		imprimirAsteriscos();
		
		//Calcula la altura de una torre que se encuentra a 100 metros de una persona, que observa la punta de la torre con un angulo de elevacion de 30 grados
		System.out.println("Calcula la altura de una torre que se encuentra a 100 metros de una persona, que observa la punta de la torre con un angulo de elevacion de 30 grados.");
		
		float base = 100;
		float angulo = 30;
		double tan = Math.tan(Math.toRadians(angulo));
		
		double h = base*tan; 
		
		System.out.println("Tu base es: "+ base);
		System.out.println("Tu altura es: "+ h);
				
				

	}//Cierrre de funcion main

}


/*
 
 Funciones 
 	
 	- No retornan valores: No devuelven nada, nose especifica nada, y no usamos la palabra return.
 	- Si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto.
 
 */
