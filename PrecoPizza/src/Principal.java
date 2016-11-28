
public class Principal {

	public static void main(String[] args) {
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
		
		Pizza p4 = new Pizza();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		carrinho.adicionaPizza(p3);
		carrinho.adicionaPizza(p4);
		
		carrinho.exibeQtdeIngredientes();
		System.out.println("Valor Total = " + carrinho.valorTotal());
	}

}
