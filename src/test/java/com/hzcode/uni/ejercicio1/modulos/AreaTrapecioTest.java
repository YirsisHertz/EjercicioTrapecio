package com.hzcode.uni.ejercicio1.modulos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Yirsis Serrano
 *
 */
class AreaTrapecioTest {

	@Test
	@DisplayName("Debe hacer calculos correctos")
	void testEntero() {
		assertEquals(20, new AreaTrapecio(10, 10, 2).getAreaTrapecio());
	}

	@Test
	@DisplayName("Debe hacer calculos decimales")
	void testDecimal() {
		assertEquals(38.5, new AreaTrapecio(8, 3, 7).getAreaTrapecio());
	}

	@Test
	@DisplayName("Debe hacer calculos Grandes")
	void testGrandes() {
		assertEquals(168, new AreaTrapecio(12, 4, 21).getAreaTrapecio());
		assertEquals(118, new AreaTrapecio(32, 27, 4).getAreaTrapecio());
	}

	@Test
	@DisplayName("Debe hacer calculos negativos")
	void testNegativos() {
		assertEquals(-178.5, new AreaTrapecio(-12, -5, 21).getAreaTrapecio());
	}

}
