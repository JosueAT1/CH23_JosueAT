package com.jat.testers;

import com.jat.clases.*;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		Suma s = new Suma(5, 2);
		OperacionesAritmeticas op = new Suma(10, 3);
		Mensajes sss = new Suma();
		
		System.out.println("Suma " + s.sumar());
		System.out.println("Operaciones Aritmeticas " + op.sumar());
		s.mensaje();
		sss.mensaje();
	}

}
