import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FabricaMecanicaDoJogo {

	private static List<MecanicaDoJogo> listaMecanicaDoJogo = new ArrayList<MecanicaDoJogo>();
	
	private static void adicionaMecanicaDoJogo() {
		 listaMecanicaDoJogo.add(new MecanicaDoJogoUm());
		 listaMecanicaDoJogo.add(new MecanicaDoJogoDois());
	}
	
	public static MecanicaDoJogo getMecanicaDoJogo() {
		
		Random r = new Random();
		int i = r.nextInt(2) + 1;
		
		adicionaMecanicaDoJogo();;
		return listaMecanicaDoJogo.get(i % listaMecanicaDoJogo.size());
	}
}
