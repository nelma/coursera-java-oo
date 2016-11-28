
public class Respeitoso implements FormatadorNome {
	
	private String genero;
	
	public Respeitoso(String genero) {
		this.genero = genero;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		String tratamento = "Sr. " + sobrenome;
		if(genero == "F") {
			tratamento = "Sra. " + sobrenome;
		}
		
		return tratamento;
	}
}
