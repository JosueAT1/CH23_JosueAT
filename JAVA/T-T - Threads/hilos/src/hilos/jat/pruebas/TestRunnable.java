package hilos.jat.pruebas;

import hilos.jat.formaRunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		Hilo2 ht = new Hilo2("Pedro");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Caligula")).start();
		new Thread(new Hilo2("Mariano")).start();

	}

}
