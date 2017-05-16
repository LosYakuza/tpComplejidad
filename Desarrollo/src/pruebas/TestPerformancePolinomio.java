package pruebas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;

import tpComplejidad.Polinomio;

public class TestPerformancePolinomio {
	
	@Test
	public void performancePolinomio() throws Exception {
		Random r = new Random();
		Polinomio p;
		double[] coef;
		
		for (int size = 401; size <= 7001; size += 200) {
			coef = new double[size];
			for (int i = 0; i < size; i++) {
				coef[i] = r.nextDouble() * 100;
			}
			p = new Polinomio(coef);
			
			double x = 10.68;
			
			System.out.println(p.getGrado()  + "\t" + 
					getTimeMSucesivas(p,x)   + "\t" + 
					getTimeRecursiva(p,x)    + "\t" +
					getTimeRecursivaPar(p,x) + "\t" +
					getTimeProgDinamica(p,x) + "\t" +
					getTimePow(p,x)          + "\t" +
					getTimeHorner(p,x)       + "\t" +
					getTimeMejorada(p,x));
		}
	}
	
	private double getTimeMSucesivas(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarMSucesivas(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeRecursiva(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarRecursiva(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeRecursivaPar(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarRecursivaPar(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeProgDinamica(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarProgDinamica(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeMejorada(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarMejorada(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimePow(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarPow(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeHorner(Polinomio p, double x) {
		Calendar tIni = new GregorianCalendar();
		p.evaluarHorner(x);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
}
