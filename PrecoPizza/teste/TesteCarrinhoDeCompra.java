import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TesteCarrinhoDeCompra {

	CarrinhoDeCompras carrinho;
	
	@Before 
	public void inicializaPizza() {
		carrinho = new CarrinhoDeCompras();
	}
	
	@After
	public void zeraQtdeIngredientes() {
		Pizza.zeraRegistroPizza();
	}
	
	@Test
	public void valorTotal() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("manjericao");
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("tomate");
				
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("peperoni");
		p3.adicionaIngrediente("cebola");
		p3.adicionaIngrediente("azeitona");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("ovos");
		p3.adicionaIngrediente("catupiry");
		
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		carrinho.adicionaPizza(p3);
		
		assertEquals(58.0, carrinho.valorTotal(), 0);
	}
	
	@Test
	public void pizzaSemIngredientes() {
		Pizza p1 = new Pizza();
		carrinho.adicionaPizza(p1);
		
		assertEquals(0.0, carrinho.valorTotal(), 0);
	}
}
