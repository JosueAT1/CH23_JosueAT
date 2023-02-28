package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIf() {
		
		long nota = 4;
		
		if (nota > 5) {
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("continua el control del flujo");
		
		
		if (nota >= 5) {
			System.out.println("Nota aprobada " + nota);
			
		}else {
			System.out.println("Nota no aprobada " + nota);
		}
		
	}
	
	public void divisible() {
		System.out.print("Introduzca un primer numero: ");
		int dato1 = entrada.nextInt();
		System.out.print("Introduzca un segundo numero: ");
		int dato2 = entrada.nextInt();
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + " es divisible entre "+ dato2);
		}else {
			System.out.println(dato1 + " no es divisible entre "+ dato2);
		}
	}
	
	public void compara() {
		System.out.print("Introduzca un primer numero: ");
		int dato3 = entrada.nextInt();
		System.out.print("Introduzca un segundo numero: ");
		int dato4 = entrada.nextInt();
		if (dato3 > dato4) {
			System.out.println(dato3 + " es mayor a "+ dato4);
		}else {
			System.out.println(dato3 + " es menor  a "+ dato4);
		}

	}
	
	public void anidado() {
		System.out.print("Introduzca un primer numero: ");
		int mayor1 = entrada.nextInt();
		if (mayor1 > 0) {
			System.out.println("Numero positivo "+ mayor1);
		}else if (mayor1 < 0 ) {
			System.out.println("Numero negativo " + mayor1);
		}else {
			System.out.println("Numero igual a cero");
		}
	}

}
