
public class MecanicaDoJogoUm implements MecanicaDoJogo {
	
	private boolean erro = false;
	private int quantidadePalavrasAcertadas = 0;
	private int pontos = 0;
	private BancoDePalavras bd = new BancoDePalavras();
	private Embaralhador embaralhador;
	
	public MecanicaDoJogoUm() {
		embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
	}

	@Override
	public boolean jogoFinalizou() {
		boolean resultado = false;
		if(erro) {
			resultado = true;
		}
		return resultado;
	}

	@Override
	public String getPalavra() {
		return bd.getPalavra();
	}

	@Override
	public Boolean acertou(String palavra, String respostaUsuario) {

		boolean resultado = true;
		if(!palavra.equals(respostaUsuario)) {
			erro = true;
			resultado = false;
		} else{
			quantidadePalavrasAcertadas++;
			pontos += embaralhador.getGrauDificuldade();
		}
		return resultado;
	}

	@Override
	public void resultadoFinal() {
		System.out.println("Quantidade de palavras acertadas: " + quantidadePalavrasAcertadas);
		System.out.println("Pontuação: " + pontos);
	}

	@Override
	public String getPalavraEmbaralhada(String palavra) {
		return embaralhador.embaralhar(palavra);
	}
}
