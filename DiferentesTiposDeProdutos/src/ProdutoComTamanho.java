
public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	@Override
	public int hashCode() {
		int superHasCode = super.hashCode();
		return superHasCode + tamanho;
	}
	
	@Override
	public boolean equals(Object obj) {
		
boolean result = false;
		
		if(obj instanceof ProdutoComTamanho) {
			ProdutoComTamanho objP = (ProdutoComTamanho) obj; 
			if(this.hashCode() == objP.hashCode()) {
				return true;
			}
		}
		return result;
	}
}
