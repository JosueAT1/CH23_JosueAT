package colecciones.jat;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//imprimir(c.listaCollections());
		//wrapperClass();
		//imprimir(c.setCollections());
		//imprimir(c.mapCollections());
		mapCollections();

	}
	
	//Map es una abstracción de collections, que utiliza set,
	private static void mapCollections() {
		
		Map miMap = new HashMap();
		
		miMap.put("Valor1", "Juan");
		miMap.put("Valor2", "Maria");
		miMap.put("Valor3", "Arturo");
		miMap.put("Valor4", "Karla");
		
		imprimir(miMap.keySet());
		imprimir(miMap.values());

	}
	
	Set setCollections() {
		Set miSet = new HashSet();
		
		
		
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add("cinco");
		
		System.out.println(miSet + " Tamano de la lista " + miSet.size());
		miSet.clear();
		System.out.println("Esta vacia " + miSet.isEmpty());
		
		
		return miSet;

	}
	
	public List listaCollections() {
		
		List miLista = new ArrayList();
		
		System.out.println(miLista + "Tamano de la lista " + miLista.size());
		System.out.println("Esta vacia " + miLista.isEmpty());
		
		miLista.add("1"); // add agrega elementos a un array
		miLista.add(2);
		miLista.add(3);
		miLista.add(0,"Pato");
		
		miLista.set(0, miLista);
		miLista.remove(2);
		
		System.out.println(miLista + "Tamano de la lista despues " + miLista.size());
		System.out.println("Esta vacia " + miLista.isEmpty());
		
		boolean e = miLista.contains(3);
		System.out.println("---> " + e);
		
		return miLista;
	}
	
	public static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos "+ elementos);
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
