package com.hzcode.uni.ejercicio1;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import com.hzcode.uni.ejercicio1.modulos.AreaTrapecio;
import com.hzcode.uni.ejercicio1.modulos.Datos;

/**
 * @author Yirsis Serrano
 *
 */
public class EjercicioAreaTrapecio {

	/**
	 * @param args por defecto no esta configurado para procesar pipes
	 * 
	 *             Este modulo implementa los modulos de Datos y de AreaTrapecio
	 *             dedicados a capturar datos y a procesar esos valores
	 */
	public static void main(String[] args) {
		Datos dato = new Datos();

		dato.setDatos("Ingresa la Base Mayor: ");
		double baseMayor = dato.getDatos();

		dato.setDatos("Ingresa la Base Menor: ");
		double baseMenor = dato.getDatos();

		dato.setDatos("Ingresa la Altura: ");
		double altura = dato.getDatos();

		AreaTrapecio area = new AreaTrapecio(baseMayor, baseMenor, altura);
		System.out.println(Ansi.colorize(area.getAreaTrapecio() + "", Attribute.GREEN_TEXT()));

	}
}
