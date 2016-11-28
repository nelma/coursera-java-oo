
public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		return codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj instanceof Produto) {
			Produto objP = (Produto) obj; 
			if(this.hashCode() == objP.hashCode()) {
				return true;
			}
		}
		return result;
	}

	public double getPreco() {
		return preco;
	}
}
