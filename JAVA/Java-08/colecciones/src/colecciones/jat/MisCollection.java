package colecciones.jat;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		wrapperClass();

	}
	
	public void listaCollections() {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
	}
	private void imprimir(Collection collection) {
		for (Object elementos : collection) {
			
		}

	}
	
	static void wrapperClass() {
		
		byte numeroB = 12;
		System.out.println("Tamano de un byte: "+ Byte.SIZE);
		System.out.println("Tamano de un byte: "+ Byte.MAX_VALUE);
		System.out.println("Tamano de un byte: "+ Byte.MIN_VALUE);
		System.out.println("---> "+ numeroB);
		
		int numeroI = 2147483647;
		System.out.println("Tamano de un byte: "+ Integer.SIZE);
		System.out.println("Tamano de un byte: "+ Integer.MAX_VALUE);
		System.out.println("Tamano de un byte: "+ Integer.MIN_VALUE);
		System.out.println("---> "+ numeroI);
		
		short numeroS = 16;
		System.out.println("Tamano de un byte: "+ Short.SIZE);
		System.out.println("Tamano de un byte: "+ Short.MAX_VALUE);
		System.out.println("Tamano de un byte: "+ Short.MIN_VALUE);
		System.out.println("---> "+ numeroS);
		
		long numeroL = 64;
		System.out.println("Tamano de un byte: "+ Long.SIZE);
		System.out.println("Tamano de un byte: "+ Long.MAX_VALUE);
		System.out.println("Tamano de un byte: "+ Long.MIN_VALUE);
		System.out.println("---> "+ numeroL);
		
	}

}
