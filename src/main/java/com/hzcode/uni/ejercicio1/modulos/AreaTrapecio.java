package com.hzcode.uni.ejercicio1.modulos;

/**
 * @author Yirsis Serrano
 *
 */
public class AreaTrapecio {

	private double B, b, h;

	/**
	 * @param B = double Base Mayor
	 * @param b = double Base Menor
	 * @param h = double Altura
	 */
	public AreaTrapecio(double B, double b, double h) {
		this.B = B;
		this.b = b;
		this.h = h;
	}

	/**
	 * @return Área de un Trapecio = Retorna el calculo de ((Base Mayor + Base
	 *         Menor) * Altura) / 2
	 */
	public double getAreaTrapecio() {
		return ((B + b) * h) / 2;
	}
}
