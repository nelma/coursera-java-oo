import static org.junit.Assert.*;

import org.junit.Test;


public class TesteAutoridade {

	@Test
	public void testeInformal() {
		FormatadorNome formatadorNome = new Informal();
		Autoridade autoridade = new Autoridade("Maria", "da Silva", formatadorNome);
		
		assertEquals("Maria", autoridade.getTratamento());
	}
	
	@Test
	public void testeRespeitosoF() {
		FormatadorNome formatadorNome = new Respeitoso("F");
		Autoridade autoridade = new Autoridade("Maria", "da Silva", formatadorNome);
		
		assertEquals("Sra. da Silva", autoridade.getTratamento());
	}
	
	@Test
	public void testeRespeitosoM() {
		FormatadorNome formatadorNome = new Respeitoso("M");
		Autoridade autoridade = new Autoridade("Jos�", "dos Santos", formatadorNome);
		
		assertEquals("Sr. dos Santos", autoridade.getTratamento());
	}
	
	@Test
	public void testeComTitulo() {
		FormatadorNome formatadorNome = new ComT�tulo("Magn�fico");
		Autoridade autoridade = new Autoridade("Pedro", "Cabral", formatadorNome);
		
		assertEquals("Magn�fico Pedro Cabral", autoridade.getTratamento());
	}

}
