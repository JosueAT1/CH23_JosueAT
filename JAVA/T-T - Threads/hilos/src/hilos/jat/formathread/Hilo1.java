package hilos.jat.formathread;

public class Hilo1 extends Thread {
	
	public Hilo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Se inicia el Thread o hilo" + this.getName());
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Termina el hilo o Thread" + this.getName());
	}
}
