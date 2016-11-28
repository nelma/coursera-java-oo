import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaDoJogo();
		
		while(!mecanica.jogoFinalizou()) {
			
			String palavra = mecanica.getPalavra();
			String palavraEmbaralhada = mecanica.getPalavraEmbaralhada(palavra);
			
			System.out.println("Qual é a palavra? " + palavraEmbaralhada);
			String respostaUsuario = in.nextLine().toUpperCase();
			
			if(mecanica.acertou(palavra, respostaUsuario)) {
				System.out.println("Você acertou. A palavra é " + palavra);
			} else {
				System.out.println("Você errou.");
			}
		}
		
		mecanica.resultadoFinal();
	}
}
