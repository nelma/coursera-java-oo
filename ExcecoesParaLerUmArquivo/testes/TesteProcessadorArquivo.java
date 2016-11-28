import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.Test;

public class TesteProcessadorArquivo {

	@Test
	public void lerArquivoComSucesso() throws LeituraArquivoException {
		HashMap<String, String> textoComparar = new HashMap<String, String>();
		
		textoComparar.put("nome", "Eduardo");
		textoComparar.put("sobrenome", "Guerra");
		textoComparar.put("idade", "37");
		
		assertEquals(textoComparar, ProcessadorArquivo.processar("arquivos/arquivo.txt"));
	}
	
	@Test
	public void lerArquivoVazio() throws LeituraArquivoException {
		try {
			ProcessadorArquivo.processar("arquivos/arquivoVazio.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Arquivo vazio", e.getMensagem());
		}
	}
	
	@Test
	public void lerArquivoMalFormatado() throws LeituraArquivoException {
		try {
			ProcessadorArquivo.processar("arquivos/arquivoMalFormatado.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido", e.getMensagem());
		}
	}

}
