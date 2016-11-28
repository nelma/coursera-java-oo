import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaDoJogo();
		
		while(!mecanica.jogoFinalizou()) {
			
			String palavra = mecanica.getPalavra();
			String palavraEmbaralhada = mecanica.getPalavraEmbaralhada(palavra);
			
			System.out.println("Qual � a palavra? " + palavraEmbaralhada);
			String respostaUsuario = in.nextLine().toUpperCase();
			
			if(mecanica.acertou(palavra, respostaUsuario)) {
				System.out.println("Voc� acertou. A palavra � " + palavra);
			} else {
				System.out.println("Voc� errou.");
			}
		}
		
		mecanica.resultadoFinal();
	}
}
