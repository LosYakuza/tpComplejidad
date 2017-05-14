package tpComplejidad;

/**
 * Es de la forma (a x + b)^n
 *
 */
public class BinomioDeNewton {

	/**
	 * Obtenci�n de t�rmino k usando factorial no recursivo 
	 * @param n
	 * @param a
	 * @param b
	 * @param k
	 * @return
	 */
	public static double coefUsandoFact(int n, double a, double b,int k){
		return NumCombinatorio.usandoFact(n, k)*
				Potencia.porRecursividadParImpar(a, k)*
				Potencia.porRecursividadParImpar(b,n- k);
	}
	
	/**
	 * Obtenci�n de t�rmino k usando recursividad
	 * @param n
	 * @param a
	 * @param b
	 * @param k
	 * @return
	 */
	public static double coefUsandoRec(int n, double a, double b,int k){
		return NumCombinatorio.usandoRec(n, k)*
				Potencia.porRecursividadParImpar(a, k)*
				Potencia.porRecursividadParImpar(b,n- k);
	}
	
	/**
	 * Obtenci�n de t�rmino k usando mat
	 * @param n
	 * @param a
	 * @param b
	 * @param k
	 * @return
	 */
	public static double coefUsandoMat(int n, double a, double b,int k){
		return NumCombinatorio.usandoMat(n, k)*
				Potencia.porRecursividadParImpar(a, k)*
				Potencia.porRecursividadParImpar(b,n- k);
	}
	
	
}
