import java.util.HashMap;
import java.util.Set;

public class Pizza {
	
	static HashMap<String, Integer> listaTotalIngrediente = new HashMap<String, Integer>();
	HashMap<String, Integer> listaIngredientePorPizza = new HashMap<String, Integer>();
	boolean temIngrediente = false;

	public void adicionaIngrediente(String ingrediente) {
		if(!ingrediente.isEmpty()) {
			int count = 1;
			if(listaIngredientePorPizza.containsKey(ingrediente)) {
				count = listaIngredientePorPizza.get(ingrediente) + 1;
			}
			
			listaIngredientePorPizza.put(ingrediente, count);
			contabilizaIngrediente(ingrediente);
			temIngrediente = true;
		}
	}
		
	public double getPreco() {
		int qtdeIngredientes = 0;
		int preco = 0;
		
		Set<String> itens = listaIngredientePorPizza.keySet();
		for (String item : itens) {
			qtdeIngredientes += listaIngredientePorPizza.get(item);
		}
		
		if(qtdeIngredientes <= 2) {
			preco = 15;
		} else if(qtdeIngredientes >= 3 && qtdeIngredientes <= 5 ) {
			preco = 20;
		} else if(qtdeIngredientes > 5) {
			preco = 23;
		}
		return preco;
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		
		if(!listaTotalIngrediente.containsKey(ingrediente)) {
			listaTotalIngrediente.put(ingrediente, 1);
		} else {
			listaTotalIngrediente.put(ingrediente, listaTotalIngrediente.get(ingrediente) + 1);
		}
	}
	
	public static void zeraRegistroPizza() {
		listaTotalIngrediente.clear();
	}
}
