import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestePizza {
	
	Pizza p1;
	CarrinhoDeCompras carrinho;
	
	@Before 
	public void inicializaPizza() {
		p1 = new Pizza();
		carrinho = new CarrinhoDeCompras();
	}
	
	@After
	public void zeraQtdeIngredientes() {
		Pizza.zeraRegistroPizza();
	}
	
	@Test
	public void valorPizza2Ingredientes() {
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("tomate");
		
		assertEquals(15.0, p1.getPreco(), 0);
	}
	
	@Test
	public void valorPizza3Ingredientes() {
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("manjericao");
		
		assertEquals(20.0, p1.getPreco(), 0);
	}
	
	@Test
	public void valorPizza6Ingredientes() {
		p1.adicionaIngrediente("peperoni");
		p1.adicionaIngrediente("cebola");
		p1.adicionaIngrediente("azeitona");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("ovos");
		p1.adicionaIngrediente("catupiry");
		
		assertEquals(23.0, p1.getPreco(), 0);
	}
	
	@Test
	public void registroIngredientePizza2() {
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("tomate");
		
		assertTrue(p1.listaIngredientePorPizza.containsKey("mussarela"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("tomate"));
	}
	
	@Test
	public void registroIngredientePizza3() {
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("manjericao");
		
		assertTrue(p1.listaIngredientePorPizza.containsKey("mussarela"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("tomate"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("manjericao"));
	}
	
	@Test
	public void registroIngredientePizza6() {
		p1.adicionaIngrediente("peperoni");
		p1.adicionaIngrediente("cebola");
		p1.adicionaIngrediente("azeitona");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("ovos");
		p1.adicionaIngrediente("catupiry");
		
		assertTrue(p1.listaIngredientePorPizza.containsKey("peperoni"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("cebola"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("azeitona"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("mussarela"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("ovos"));
		assertTrue(p1.listaIngredientePorPizza.containsKey("catupiry"));
	}

}
