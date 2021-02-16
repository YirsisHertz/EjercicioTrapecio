package com.hzcode.uni.ejercicio1.modulos;

import java.util.Scanner;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;

/**
 * @author Yirsis Serrano
 *
 */
public class Datos {
	private final Scanner leer;
	private double valor;

	public Datos() {
		leer = new Scanner(System.in);
	}

	/**
	 * @param msg = Recibe el mensaje personalizado por mostrar en pantalla.
	 */
	public void setDatos(String msg) {
		System.out.print(msg);
		try {
			valor = leer.nextDouble();
		} catch (Exception e) {
			System.out.println(Ansi.colorize("Error al introducir datos, favor de intentar más tarde",
					Attribute.BRIGHT_RED_TEXT(), Attribute.BOLD()));
			System.exit(0);
		}
	}

	/**
	 * @return double valor = Retorna el valor capturado siempre y cuando sea un
	 *         número
	 */
	public double getDatos() {
		return valor;
	}

}
