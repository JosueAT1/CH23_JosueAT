package control;

import java.util.Scanner;

public class OrdenTres {
	Scanner num = new Scanner(System.in);
	
	public void ordenar() {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el primer numero: ");
		int a = num.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int b = num.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		int c = num.nextInt();	
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b < c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("Los números ordenados de manera descendente son: " + a + ", " + b + ", " + c);
	}

}
