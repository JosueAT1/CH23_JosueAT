package clases;

import java.util.Scanner;

public class NuevoHola {
	
	
	private String nombre;  //OBjeto porque se esta declarando como un tipo objeto
	//Para incializar la variable (objeto de tipo String) usamos el metodo contructor

	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("Hola desde java con sts de nuez " + this.nombre);
	}
	
	public void saludoConNombre(){
		System.out.print("Hola tu eres: " + this.nombre);
	}
	
	
	
}
