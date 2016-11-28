import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	
	private static List<String> textoArquivo = new ArrayList<String>();

	private void lerArquivo() throws FileNotFoundException {
		File arquivo = new File("arquivos/arquivo.txt");
		Scanner scanner = new Scanner(arquivo);
		
		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();
			String texto = str;
			textoArquivo.add(texto);
		}
		
		scanner.close();
	}
	
	public String getPalavra() {
		Random r = new Random();
		int i = r.nextInt(19) + 1;
		
		try {
			lerArquivo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return textoArquivo.get(i % textoArquivo.size());
	}
	
}
