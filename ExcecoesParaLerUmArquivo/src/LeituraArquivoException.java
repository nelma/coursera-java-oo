
public class LeituraArquivoException extends Exception {
	
	private String mensagem;

	public LeituraArquivoException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
