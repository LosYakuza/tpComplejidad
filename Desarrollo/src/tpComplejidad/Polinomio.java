package tpComplejidad;

public class Polinomio {
	private int grado;

	/**
	 * La pos 0 del arreglo contiene el coeficiente de grado n. La pos n
	 * contiene al término independiente.
	 */
	private double[] coeficientes;

	public int getGrado() {
		return grado;
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}

	public Polinomio(final double[] coeficientes) throws Exception {
		this.grado = coeficientes.length - 1;
		if (grado < 1) {
			throw new Exception("El arreglo debe tener al menos un coeficiente");
		}
		this.coeficientes = coeficientes.clone();
	}

	/**
	 * Se usa el cálculo de potencia por multiplicaciones sucesivas.
	 * 
	 * @param x
	 * @return
	 */
	public double evaluarMSucesivas(double x) {
		double resultado = 0;
		for (int i = 0; i < coeficientes.length; i++) {
			double xn = 1.0;
			for (int j = 0; j < grado - i; j++) {
				xn *= x; // x elevado a la n
			}
			resultado += (xn * coeficientes[i]);
		}
		return resultado;
	}

	/**
	 * Se usa el cálculo de potencia por recursividad.
	 * 
	 * @param x
	 * @return
	 */
	public double evaluarRecursiva(final double x) {
		double resultado = 0.0;
		for (int i = 0; i <= grado; i++) {
			resultado += coeficientes[i] * Potencia.porRecursividad(x, grado - i);
		}
		return resultado;
	}

	/**
	 * Se usa el cálculo de potencia por recursividad par/impar.
	 * 
	 * @param x
	 * @return
	 */
	public double evaluarRecursivaPar(final double x) {
		double resultado = 0.0;
		for (int i = 0; i <= grado; i++) {
			resultado += coeficientes[i] * Potencia.porRecursividadParImpar(x, grado - i);
		}
		return resultado;
	}

	/**
	 * Se calculan las potencias mediante p
	 * @param x
	 * @return
	 */
	public double evaluarProgDinamica(final double x) {
		double vec[] = new double[grado + 1];
		vec[0] = 1;
		double result = 0;
		for (int i = 0; i <= grado; i++) {
			if(i > 0) {
				vec[i] = vec[i - 1] * x;
			}
			result += coeficientes[grado - i] * vec[i];
		}
		return result; 
	}

	public double evaluarMejorada(final double x) {
		return 0;
	}
	
	public double evaluarPow(final double x) {
		double resultado = 0.0;
		for (int i = 0; i <= grado; i++) {
			resultado += coeficientes[i] * Math.pow(x, grado - i);
		}
		return resultado;
	}

	public double evaluarHorner(final double x) {
		double aux[] = new double[grado + 1];
		aux[0] = coeficientes[0];
		for (int i = 1; i <= grado; i++) {
			aux[i] = coeficientes[i] + aux[i - 1] * x;
		}
		return aux[grado];
	}

}
