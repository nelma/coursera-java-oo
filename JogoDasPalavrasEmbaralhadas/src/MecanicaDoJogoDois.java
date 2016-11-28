import java.util.ArrayList;
import java.util.List;


public class MecanicaDoJogoDois implements MecanicaDoJogo {

	private List<Integer> quantidadeErros = new ArrayList<Integer>();
	private int quantidadePalavrasAcertadas = 0;
	private int pontos = 0;
	private BancoDePalavras bd = new BancoDePalavras();
	private Embaralhador embaralhador;
	
	public MecanicaDoJogoDois() {
		embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
	}
	
	@Override
	public boolean jogoFinalizou() {
		boolean resultado = false;
		if(quantidadeErros.size() == 2) {
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
			quantidadeErros.add(1);
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
