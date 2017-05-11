package pruebas;

import org.junit.Assert;
import org.junit.Test;

import tpComplejidad.Polinomio;

public class TestFuncionalPolinomio {

	@Test
	public void testConstructor() throws Exception {
		double[] coef = {2, 6, 3};
		Polinomio p = new Polinomio(coef);
		
		Assert.assertEquals(2, p.getGrado());
		Assert.assertNotNull(p.getCoeficientes());
		Assert.assertEquals(coef[0], p.getCoeficientes()[0], 0);
		Assert.assertEquals(coef[1], p.getCoeficientes()[1], 0);
		Assert.assertEquals(coef[2], p.getCoeficientes()[2], 0);
		
		double[] coef2 = new double[0];
		boolean huboExcepcion = false;
		try {
			new Polinomio(coef2);
		} catch (Exception e) {
			huboExcepcion = true;
		}
		Assert.assertTrue(huboExcepcion); //ver si lo dejo como excep o si lo dejo pasar.
	}
	
	@Test
	public void testEvaluarMSucesivas() throws Exception {
		double[] coef = {2, 6, 3};
		Polinomio p = new Polinomio(coef);
		
		Assert.assertEquals(11, p.evaluarMSucesivas(1), 0);
		Assert.assertEquals(23, p.evaluarMSucesivas(2), 0);
		Assert.assertEquals(39, p.evaluarMSucesivas(3), 0);
		Assert.assertEquals(59, p.evaluarMSucesivas(4), 0);
		Assert.assertEquals(83, p.evaluarMSucesivas(5), 0);
		Assert.assertEquals(111, p.evaluarMSucesivas(6), 0);
		Assert.assertEquals(143, p.evaluarMSucesivas(7), 0);
	}
	
	@Test
	public void testEvaluarRecursiva() throws Exception {
		double[] coef = {2, 6, 3};
		Polinomio p = new Polinomio(coef);
		
		Assert.assertEquals(11, p.evaluarRecursiva(1), 0);
		Assert.assertEquals(23, p.evaluarRecursiva(2), 0);
		Assert.assertEquals(39, p.evaluarRecursiva(3), 0);
		Assert.assertEquals(59, p.evaluarRecursiva(4), 0);
		Assert.assertEquals(83, p.evaluarRecursiva(5), 0);
		Assert.assertEquals(111, p.evaluarRecursiva(6), 0);
		Assert.assertEquals(143, p.evaluarRecursiva(7), 0);
	}
	
	@Test
	public void testEvaluarRecursivaPar() throws Exception {
		double[] coef = {2, 6, 3};
		Polinomio p = new Polinomio(coef);
		
		Assert.assertEquals(11, p.evaluarRecursivaPar(1), 0);
		Assert.assertEquals(23, p.evaluarRecursivaPar(2), 0);
		Assert.assertEquals(39, p.evaluarRecursivaPar(3), 0);
		Assert.assertEquals(59, p.evaluarRecursivaPar(4), 0);
		Assert.assertEquals(83, p.evaluarRecursivaPar(5), 0);
		Assert.assertEquals(111, p.evaluarRecursivaPar(6), 0);
		Assert.assertEquals(143, p.evaluarRecursivaPar(7), 0);
	}
	
	@Test
	public void testEvaluarHorner() throws Exception {
		double[] coef = {2, 6, 3};
		Polinomio p = new Polinomio(coef);
		
		Assert.assertEquals(11, p.evaluarHorner(1), 0);
		Assert.assertEquals(23, p.evaluarHorner(2), 0);
		Assert.assertEquals(39, p.evaluarHorner(3), 0);
		Assert.assertEquals(59, p.evaluarHorner(4), 0);
		Assert.assertEquals(83, p.evaluarHorner(5), 0);
		Assert.assertEquals(111, p.evaluarHorner(6), 0);
		Assert.assertEquals(143, p.evaluarHorner(7), 0);
	}
	
	@Test
	public void testEvaluarProgDinamica() throws Exception {
		double[] coef = {2, 6, 3};
		Polinomio p = new Polinomio(coef);
		
		Assert.assertEquals(11, p.evaluarProgDinamica(1), 0);
		Assert.assertEquals(23, p.evaluarProgDinamica(2), 0);
		Assert.assertEquals(39, p.evaluarProgDinamica(3), 0);
		Assert.assertEquals(59, p.evaluarProgDinamica(4), 0);
		Assert.assertEquals(83, p.evaluarProgDinamica(5), 0);
		Assert.assertEquals(111, p.evaluarProgDinamica(6), 0);
		Assert.assertEquals(143, p.evaluarProgDinamica(7), 0);
	}

}
