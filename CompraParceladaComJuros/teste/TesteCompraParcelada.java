import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TesteCompraParcelada {
	
	@Test
	public void compraComUmaParcela() {
		CompraParcelada cp = new CompraParcelada(100.0, 1, 10);
		assertEquals(110.00000000000001, cp.total(), 0);
	}
	
	@Test
	public void compraComDuasParcela() {
		CompraParcelada cp = new CompraParcelada(100.0, 2, 10);
		assertEquals(121.00000000000001, cp.total(), 0);
	}
	
	@Test
	public void compraComCincoParcela() {
		CompraParcelada cp = new CompraParcelada(100.0, 5, 10);
		assertEquals(161.05100000000004, cp.total(), 0);
	}

	@Test
	public void compraComDezParcela() {
		CompraParcelada cp = new CompraParcelada(100.0, 10, 10);
		assertEquals(259.3742460100002, cp.total(), 0);
	}
}
