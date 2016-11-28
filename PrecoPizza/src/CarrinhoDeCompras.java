import java.util.ArrayList;

public class CarrinhoDeCompras {
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public void adicionaPizza(Pizza pizza) {		
		if(pizza.temIngrediente) {
			System.out.println("Pizza = " + pizza.getPreco());
			pizzas.add(pizza);
		} else {
			System.out.println("Pizza sem ingrediente. Não será adicionada ao carrinho.");
		}
	}
	
	public double valorTotal() {
		double valorPizza = 0;
		for (Pizza pizza1 : pizzas) {
			valorPizza += pizza1.getPreco(); 
		}
		return valorPizza;
	}
	
	public void exibeQtdeIngredientes() {
		System.out.println("Qtde de ingredientes = " + Pizza.listaTotalIngrediente.entrySet());
	}
}
