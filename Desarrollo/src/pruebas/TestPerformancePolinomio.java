package pruebas;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import tpComplejidad.Polinomio;

public class TestPerformancePolinomio {

	@Test
	public void performanceMSucesivas() throws Exception {
		Random r = new Random();
		Polinomio p;
		double[] coef;
		
		for (int size = 500; size <= 15000; size += 500) {
			coef = new double[size];
			for (int i = 0; i < size; i++) {
				coef[i] = r.nextDouble() * 100;
			}
			p = new Polinomio(coef);
			
			double x = r.nextDouble();
			
			//Ver como calc time bien.
			
			p.evaluarMSucesivas(x);
			
			p.evaluarRecursiva(x);
			
			p.evaluarRecursivaPar(x);
			
			p.evaluarProgDinamica(x);
						
			p.evaluarPow(x);
			
			p.evaluarHorner(x);
		}
	}
}
