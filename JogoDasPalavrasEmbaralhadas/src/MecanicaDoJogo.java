
public interface MecanicaDoJogo {

	boolean jogoFinalizou();

	String getPalavra();

	Boolean acertou(String palavra, String respostaUsuario);

	void resultadoFinal();
	
	String getPalavraEmbaralhada(String palavra);
	
}
