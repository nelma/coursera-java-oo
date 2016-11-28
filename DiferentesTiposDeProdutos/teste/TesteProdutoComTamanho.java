import static org.junit.Assert.*;

import org.junit.Test;


public class TesteProdutoComTamanho {

	@Test
	public void testEquals() {
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Produto 1", 1, 50.0, 10);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", 1, 50.0, 15);
		
		assertEquals(p1.equals(p2), p2.equals(p1));
	}
	
	@Test
	public void testHashCode() {
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Produto 1", 1, 50.0, 10);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", 1, 50.0, 15);

		assertEquals(p1.equals(p2), p2.equals(p1));
	}

}
