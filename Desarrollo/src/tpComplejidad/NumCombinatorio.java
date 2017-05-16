package tpComplejidad;
import java.util.ArrayList;

public class NumCombinatorio {

	private static int [][] mat;
	
	/**
	 * Cálculo de factorial usando multiplicaciones sucesivas.
	 * @param i
	 * @return
	 */
	private static double factorial(int i) {
		int j;
		double res = 1;
		for (j = 1; j <= i; j++) {
			res *= j;
		}
		return res;
	}
	
	/**
	 * Cálculo de número combinatorio usando factorial no recursivo.
	 * @param m
	 * @param i
	 * @return
	 */
	public static double usandoFact(int m, int i){
		double comb;
		comb = factorial(m) / (factorial(i) * factorial(m - i));
		return comb;
	}
	
	/**
	 * Cálculo de número combinatorio usando recursividad.
	 * @param n
	 * @param k
	 * @return
	 */
	public static double usandoRec(int n, int k) {
		if(k == 0){
			return 1;
		}
		if(n == 0){
			return 0;
		}
		if(k == n){
			return 1;
		}
		return usandoRec(n-1, k-1) + usandoRec(n-1, k);
	}
	
	/**
	 * Carga de matriz para cálculo de número combinatorio
	 * @param hasta
	 */
	private static void cargaMat(int hasta){
		if(mat != null && mat.length >= hasta )
			return;
		mat= new int[hasta][];
		for(int i=0; i<hasta;i++){
			mat[i]=new int[i+1];
			mat[i][0]=1;
			for(int j=1; j<i;j++){
				mat[i][j]= mat[i-1][j]+mat[i-1][j-1];
			}
			mat[i][i]=1;
		}
		
	}
	
	/**
	 * Cálculo de número combinatorio mediante uso de matriz.
	 * @param n
	 * @param k
	 * @return
	 */
	public static double usandoMat(int n, int k) {
		cargaMat(n+1);
		return mat[n][k];
	}

}
