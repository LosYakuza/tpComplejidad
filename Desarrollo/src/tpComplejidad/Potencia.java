package tpComplejidad;

public class Potencia {

	/**
	 * Cálculo de potencia por multiplicaciones sucesivas.
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public static double porMSucesivas(double a, double b) {
		double xn = 1.0;
		for (int i = 0; i < b; i++) {
			xn *= a;
		}
		return xn;
	}

	/**
	 * Cálculo de potencia por recursividad.
	 *
	 * @param x
	 * @param n
	 * @return
	 */
	public static double porRecursividad(double x, double n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else {
			return x * porRecursividad(x, n - 1);
		}
	}

	/**
	 * Cálculo de potencia por recursividad según potencia par o impar.
	 *
	 * @param x
	 * @param n
	 * @return
	 */
	public static double porRecursividadParImpar(double x, double n) {
		if (n == 0) {
			return 1.0;
		} else if (n % 2 == 1) { // potencia impar
			return x * porRecursividadParImpar(x, n - 1);
		} else {
			return porRecursividadParImpar(x*x, n / 2); // potencia par
		}
	}
}
