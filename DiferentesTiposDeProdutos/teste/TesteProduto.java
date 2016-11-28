import static org.junit.Assert.*;

import org.junit.Test;


public class TesteProduto {

	@Test
	public void testEquals() {
		Produto p1 = new Produto("Produto 1", 1, 50.0);
		Produto p2 = new Produto("Produto 2", 1, 35.0);
		
		assertEquals(p1.equals(p2), p2.equals(p1));
	}
	
	@Test
	public void testHashCode() {
		Produto p1 = new Produto("Produto 1", 1, 50.0);
		Produto p2 = new Produto("Produto 2", 1, 35.0);
		
		assertEquals(p1.hashCode(), p2.hashCode());
	}

}
