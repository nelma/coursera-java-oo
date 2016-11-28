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
		Autoridade autoridade = new Autoridade("José", "dos Santos", formatadorNome);
		
		assertEquals("Sr. dos Santos", autoridade.getTratamento());
	}
	
	@Test
	public void testeComTitulo() {
		FormatadorNome formatadorNome = new ComTítulo("Magnífico");
		Autoridade autoridade = new Autoridade("Pedro", "Cabral", formatadorNome);
		
		assertEquals("Magnífico Pedro Cabral", autoridade.getTratamento());
	}

}
