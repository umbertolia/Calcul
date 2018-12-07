/**
 * 
 */
package hdn.examples.calcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class CalculMetierTest {
	
	CalculMetier calculator;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new CalculMetier();
	}

	@Test
	public void testSomme() {
		double a = 3;
		double b = 5;
		
		double result = calculator.somme(a, b);
		assertTrue("Methode somme() invalide", result == 8);
	}
	
	@Test
	public void testProduit() {
		double a = 3;
		double b = 5;
		
		double result = calculator.produit(a, b);
		assertTrue("Methode produit() invalide", result == 15);
	}
}
