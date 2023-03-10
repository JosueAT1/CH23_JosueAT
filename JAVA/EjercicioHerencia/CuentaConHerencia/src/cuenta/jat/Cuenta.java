package cuenta.jat;

public class Cuenta {
	protected float saldo;
	protected int consignaciones = 0;
	protected int retiros = 0;
	private float tasaAnual;
	protected float comisionMensual = 0;
	
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	
	public void consignar(float cantidad) {
		saldo = saldo + cantidad;
		consignaciones = consignaciones + 1;

	}
	
	public void retirar(float cantidad) {
		float nuevoSaldo = saldo - cantidad;
		
		if (nuevoSaldo >= 0) {
			saldo = saldo - cantidad;
			retiros = retiros + 1;
		} else {
			System.out.println("No cueta con suficientes fondos");
		}

	}
	
	public void calcularInteres() {
		float tasaMensual = tasaAnual/12;
		float interesMensual = saldo * tasaMensual;
		saldo = saldo + interesMensual;

	}
	
	public void extractoMensual() {
		saldo = saldo - comisionMensual;
		calcularInteres();

	}
	
	
	
	
	
	
	
}
