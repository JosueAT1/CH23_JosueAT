package cuenta.jat;

public class CuentaDeAhorros extends Cuenta {
	
	private boolean activa;
	
	public CuentaDeAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		
		if (saldo < 10000) {
			activa = false;
		} else {
			activa = true;
		}
	}
	
	@Override
	public void consignar(float cantidad) {
		if (activa) {
			super.consignar(cantidad);
		}
		
	}
	
	@Override
	public void retirar(float cantidad) {
		if (activa) {
			super.retirar(cantidad);
		}
		
	}
	
	@Override
	public void extractoMensual() {
		if (retiros > 4) {
			comisionMensual = comisionMensual + (retiros - 4)*1000;
		}
		super.extractoMensual();
		if (saldo < 10000) {
			activa = false;
		}
	}
	
	public void imprimir() {
		System.out.println("Saldo = " + saldo);
		System.out.println("Comision mensual = " + comisionMensual);
		System.out.println("Numero de transacciones = " + (consignaciones + retiros));

	}
	
	
}
