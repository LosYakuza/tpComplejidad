package pruebas;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;

import tpComplejidad.BinomioDeNewton;

public class TestPerformanceBinomioDeNewton {

	@Test
	public void performanceBinomioDeNewton() {
		Random r = new Random();
		int n, k = 0;
		double a = 2, b = 7;
		for (int i = 1; i <= 100; i += 10) {			
			n = i;
			k++;
			System.out.println(n + "\t" + k + "\t" + 
					getTimeUsandoRecursividad(n, a, b, k)         + "\t" + 
					getTimeUsandoFactorialNoRecursivo(n, a, b, k) + "\t" +
					getTimeUsandoMat(n, a, b, k));
		}
	}
	
	private double getTimeUsandoRecursividad(int n, double a, double b,int k) {
		Calendar tIni = new GregorianCalendar();
		BinomioDeNewton.coefUsandoRec(n, a, b, k);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeUsandoFactorialNoRecursivo(int n, double a, double b,int k) {
		Calendar tIni = new GregorianCalendar();
		BinomioDeNewton.coefUsandoFact(n, a, b, k);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
	private double getTimeUsandoMat(int n, double a, double b,int k) {
		Calendar tIni = new GregorianCalendar();
		BinomioDeNewton.coefUsandoMat(n, a, b, k);
		Calendar tFin = new GregorianCalendar();
		return tFin.getTimeInMillis() - tIni.getTimeInMillis();
	}
	
}
