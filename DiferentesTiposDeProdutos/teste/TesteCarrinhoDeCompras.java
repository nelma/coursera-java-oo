import static org.junit.Assert.*;

import org.junit.Test;


public class TesteCarrinhoDeCompras {

	@Test
	public void valorTotalCarrinho() {
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Produto 1", 1, 50.0, 10);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", 2, 30.0, 15);
		ProdutoComTamanho p3 = new ProdutoComTamanho("Produto 3", 3, 20.0, 5);
		ProdutoComTamanho p4 = new ProdutoComTamanho("Produto 3", 3, 20.0, 10);
		ProdutoComTamanho p5 = new ProdutoComTamanho("Produto 1", 1, 50.0, 10);

		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		c.adicionaProduto(p1, 2);
		c.adicionaProduto(p1, 3);
		c.adicionaProduto(p2, 1);
		c.adicionaProduto(p3, 1);
		c.adicionaProduto(p4, 1);
		c.adicionaProduto(p5, 1);
			
		c.removeProduto(p1, 2);
		
		assertEquals(270.0, c.valorTotalDaCompra(), 0);
	}

}
