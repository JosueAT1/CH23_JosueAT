package tiposDeDatosYVariables;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&&
		int edad = 18;
		boolean tieneLicencia = true;
		
		if(edad >= 18 && tieneLicencia) {
			System.out.println("Puede conducir un coche");
		}else {
			System.out.println("No puede conducir un coche");
		}
		
		//OR
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		//NOT
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		//Verificar si un número es par y positivo:
			int num = 6;
			
			if(num % 2 == 0 && num > 0){
				System.out.println("El numero es par y positivo");
			}else {
				System.out.println("La condición es falsa");
			}

		//Verificar si un número está dentro de un rango específico
			int num2 = 21;
			
			if(num2 >= 0 && num2 <= 20 ) {
				System.out.println("El numero esta en el rango");
			}else {
				System.out.println("El numero no esta en el rango");
			}

		//Verificar si una cadena es igual a otra o no
			String cadena1 = "Hola";
			String cadena2 = "Hola";
			if(cadena1 == cadena2) {
				System.out.println("La cadena 1 y cadena 2 son iguales");
			}else {
				System.out.println("La cadena 1 y cadena 2 son diferentes");
			}

	}

}
