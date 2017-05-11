package pruebas;

import org.junit.Assert;
import org.junit.Test;

import tpComplejidad.Potencia;

public class TestPotencia {

	@Test
	public void testPotenciaPorMSucesivas() {
		Assert.assertEquals(1, Potencia.porMSucesivas(1, 0), 0);
		Assert.assertEquals(8, Potencia.porMSucesivas(2, 3), 0);
		Assert.assertEquals(729, Potencia.porMSucesivas(3, 6), 0);
		Assert.assertEquals(1048576, Potencia.porMSucesivas(4, 10), 0);
	}
	
	@Test
	public void testPotenciaPorRecursividad() {
		Assert.assertEquals(1, Potencia.porRecursividad(1, 0), 0);
		Assert.assertEquals(8, Potencia.porRecursividad(2, 3), 0);
		Assert.assertEquals(729, Potencia.porRecursividad(3, 6), 0);
		Assert.assertEquals(1048576, Potencia.porRecursividad(4, 10), 0);
	}
	
	@Test
	public void testPotenciaPorRecursividadParImpar() {
		Assert.assertEquals(1, Potencia.porRecursividadParImpar(1, 0), 0);
		Assert.assertEquals(8, Potencia.porRecursividadParImpar(2, 3), 0);
		Assert.assertEquals(729, Potencia.porRecursividadParImpar(3, 6), 0);
		Assert.assertEquals(1048576, Potencia.porRecursividadParImpar(4, 10), 0);
	}

}
