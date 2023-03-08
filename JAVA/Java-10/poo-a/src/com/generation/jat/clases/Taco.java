package com.generation.jat.clases;

public class Taco {
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio;
	
	public Taco() {
		super();
	}

	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}

	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getGuisado() {
		return guisado;
	}

	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
	
}


