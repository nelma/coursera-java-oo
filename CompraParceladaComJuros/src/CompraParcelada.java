
public class CompraParcelada extends Compra {

	private int quantidadeParcela;
	private double jurosMensal;
	
	public CompraParcelada(double valor, int quantidadeParcela, double jurosMensal) {
		super(valor);
		this.quantidadeParcela = quantidadeParcela;
		this.jurosMensal = jurosMensal;
	}
	
	@Override
	public double total() {
		if(quantidadeParcela == 0) {
			return super.total();
		} else {
			return super.total()* Math.pow((1 + jurosMensal/100),quantidadeParcela);
		}
	}
}
