package pruebas;

import org.junit.Assert;
import org.junit.Test;

import tpComplejidad.BinomioDeNewton;
import tpComplejidad.NumCombinatorio;

public class TestNumCombinatorio {

	@Test
	public void testNumCombinatorio() {
		Assert.assertEquals(2, NumCombinatorio.usandoFact(2, 1),0.05);
		Assert.assertEquals(10, NumCombinatorio.usandoFact(5, 3),0.05);
		Assert.assertEquals(15504, NumCombinatorio.usandoFact(20, 5),0.05);
		
		Assert.assertEquals(2, NumCombinatorio.usandoRec(2, 1),0.05);
		Assert.assertEquals(10, NumCombinatorio.usandoRec(5, 3),0.05);
		Assert.assertEquals(15504, NumCombinatorio.usandoRec(20, 5),0.05);
		
		Assert.assertEquals(2, NumCombinatorio.usandoMat(2, 1),0.05);
		Assert.assertEquals(10, NumCombinatorio.usandoMat(5, 3),0.05);
		Assert.assertEquals(15504, NumCombinatorio.usandoMat(20, 5),0.05);
	}

}
