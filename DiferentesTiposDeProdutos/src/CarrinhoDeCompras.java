import java.util.HashMap;


public class CarrinhoDeCompras {

	private HashMap<Produto, Integer> c = new HashMap<Produto, Integer>();
	
	public void adicionaProduto(Produto p, int quantidade) {
		if(c.containsKey(p)) {
			int quantidadeAtual = c.get(p);
			c.put(p, quantidadeAtual + quantidade);
		} else {
			c.put(p, quantidade);
		}
	}
	
	public void removeProduto(Produto p, int quantidade) {
		if(c.containsKey(p)) {
			int quantidadeAtual = c.get(p);
			if(quantidade <= quantidadeAtual) {
				c.put(p, quantidadeAtual - quantidade);
			} else {
				c.put(p, 0);
			}
		}
	}
	
	public double valorTotalDaCompra() {
		
		double valorTotal = 0.0;
		for(Produto p : c.keySet()) {
			valorTotal += p.getPreco() * c.get(p);
		}
		return valorTotal;
	}

}
