import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProcessadorArquivo {
	
	private static HashMap<String, String> textoArquivo = new HashMap<String, String>();
	private static Scanner scanner;
	
	public static HashMap<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
		
		try {
			File arquivo = new File(nomeArquivo);
			scanner = new Scanner(arquivo);
			
			if(!scanner.hasNext()) {
				throw new LeituraArquivoException("Arquivo vazio");
			}
			
			while (scanner.hasNextLine()) {
				String str = scanner.nextLine();
				
				if(str.indexOf("->") != -1) {
					String texto[] = str.split("->{1}");
					if(texto.length > 2) {
						throw new LeituraArquivoException("Formato de arquivo inválido");
					}
					textoArquivo.put(texto[0], texto[1]);
				} else {
					throw new LeituraArquivoException("Formato de arquivo inválido");
				}
			}
			return textoArquivo;
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo" + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
