import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FabricaEmbaralhadores {

	private static List<Embaralhador> listaEmbaralhadores = new ArrayList<Embaralhador>();
	
	private static void adicionaEmbaralhadores() {
		 listaEmbaralhadores.add(new EmbaralhadorFacil());
		 listaEmbaralhadores.add(new EmbaralhadorMedio());
	}
	
	public static Embaralhador getEmbaralhadorAleatorio() {
		
		Random r = new Random();
		int i = r.nextInt(2) + 1;
		
		adicionaEmbaralhadores();
		return listaEmbaralhadores.get(i % listaEmbaralhadores.size());
	}
}
